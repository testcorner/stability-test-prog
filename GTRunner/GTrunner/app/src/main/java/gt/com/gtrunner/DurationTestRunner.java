package gt.com.gtrunner;

import android.os.Bundle;
import android.os.Environment;
import android.support.test.InstrumentationRegistry;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.RunNotifier;

import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;


import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;



public class DurationTestRunner extends GTTestRunner {
    private final Class<?> type;

    public DurationTestRunner(Class<?> type) throws InitializationError {
        super(type);
        this.type = type;
        String filename = "Report.xml";
        File extDir = Environment.getExternalStorageDirectory();
           try {
              FileWriter fw3 = new FileWriter(new File(extDir,"Failure.xml"));
               fw3.write("");
               fw3.close();

               File file = new File(extDir, filename);
               file.delete();

               FileWriter fw4 = new FileWriter(new File(extDir,"Error.xml"));
               fw4.write("");
               fw4.close();

               FileWriter fw5 = new FileWriter(new File(extDir,"Success.xml"));
               fw5.write("");
               fw5.close();

           }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run(RunNotifier notifier) {
       // notifier.addListener(new JUnitExecutionListener3());
        notifier.addListener(new JUnitExecutionListener2());
        notifier.fireTestRunStarted(getDescription());
        super.run(notifier);
    }

    @Override
    protected void runChild(final FrameworkMethod method, final RunNotifier notifier) {
        System.out.println(method.getAnnotation(Duration.class));
        if (method.getAnnotation(Duration.class)!= null)
        {
            runDuration(method, notifier);
        }
        else
        {
            Description description = describeChild(method);
            runLeaf(methodBlock(method), description, notifier);
        }
    }
    protected void runTest(final FrameworkMethod method, final RunNotifier notifier) {
    //    Description description = describeChild(method);
   //     runLeaf(methodBlock(method), description, notifier);
        runDuration(method, notifier);
   }


    protected void runDuration(final FrameworkMethod duration, final RunNotifier notifier) {
        System.out.println(duration.getAnnotation(Duration.class).s());
        int timeset = duration.getAnnotation(Duration.class).s();
        long timeMillis = System.currentTimeMillis();
        long timeStart = TimeUnit.MILLISECONDS.toSeconds(timeMillis);
        long timeloop = timeStart + timeset;
        while (true) {
            long timeMillinow = System.currentTimeMillis();
            long timeCount = TimeUnit.MILLISECONDS.toSeconds(timeMillinow);
            System.out.println("TimeCount : " + timeCount);
            long set = timeloop - timeCount;
            System.out.println("Time left :" + set);
            if (set <= 0) {
                System.out.println("Test Stop");
                break;
            }
            else {
               super.runChild(duration, notifier);
            }
        }
    }

    @Override
    protected List<FrameworkMethod> computeRandomMethods() {
        int seed = 0;
        Bundle extras = InstrumentationRegistry.getArguments();
        if ((extras.containsKey("r"))) {
            System.out.println("Seed : " + extras.getString("r"));
            seed = Integer.valueOf(extras.getString("r"));
        }

        List<FrameworkMethod> methods = super.computeRandomMethods();
        List<FrameworkMethod> newMethods = new ArrayList<>(methods);
        ArrayList<?> copy = new ArrayList<> (newMethods);
        Collections.shuffle(newMethods, new Random(seed));
        String s = newMethods.toString();
        String ss [] = s.split(",");
        for (int i = 0; i < newMethods.size(); i++)
        System.out.println(ss[i]);
        return newMethods;
    }

    @Override
    protected List<FrameworkMethod> computeTestMethods() {
        List<FrameworkMethod> list = super.computeTestMethods();
        List<FrameworkMethod> copy = new ArrayList<FrameworkMethod>(list);
        Collections.sort(copy, new Comparator<FrameworkMethod>() {
            @Override
            public int compare(FrameworkMethod f1, FrameworkMethod f2) {
                Testorder o1 = f1.getAnnotation(Testorder.class);
                Testorder o2 = f2.getAnnotation(Testorder.class);

                if (o1 == null || o2 == null)
                    return -1;

                return o1.order() - o2.order();
            }
        });
        return copy;
    }


    private static boolean duration(FrameworkMethod method) {
        return method.getAnnotation(Duration.class) != null;
    }

    private static boolean duration(Class<?> type) {
        return type.getAnnotation(Duration.class) != null;
    }

    private static int durations(FrameworkMethod method) {
        return method.getAnnotation(Duration.class).s();
    }

    private static int durations(Class<?> type)
    {
        return type.getAnnotation(Duration.class).s();
    }



}


