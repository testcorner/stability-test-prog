package com.android.calculator2;

import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;

import java.util.concurrent.TimeUnit;

public class DurationTestRunner extends BlockJUnit4ClassRunner {
    private final Class<?> type;

    public DurationTestRunner(Class<?> type) throws InitializationError {
        super(type);
        this.type = type;
    }

    private static boolean Duration(FrameworkMethod method) {
        return method.getAnnotation(Duration.class) != null;
    }

    private static boolean Duration(Class<?> type) {
        return type.getAnnotation(Duration.class) != null;
    }

    private static int s(FrameworkMethod method) {
        return method.getAnnotation(Duration.class).s();
    }

    private static int s(Class<?> type) {
        return type.getAnnotation(Duration.class).s();
    }

    @Override
    protected void runChild(final FrameworkMethod method, final RunNotifier notifier) {
        System.out.println(method.getAnnotation(Duration.class).s());
        int timeset = method.getAnnotation(Duration.class).s();
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
            } else {
                super.runChild(method, notifier);
            }
        }
        return;
    }
}

