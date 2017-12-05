package gt.com.gtrunner;


import android.os.Environment;
import android.util.Log;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by EdenLai on 2017/9/18.
 */


public class JUnitExecutionListener2 extends RunListener {

    String filename = "Report.xml";
    String failurename = "Failure.xml";
    String countname = "Count.xml";
    File extDir = Environment.getExternalStorageDirectory();
    long timeStart,timeFinish,timeTotalStart,timeTotalFinish,timeTotal,timecount;
    String ClassName,strDate,FailureMes,FailureName ,FailureMess;
    int FailureCount ,testCount;
    Integer failcount,n,Errorcount;
    int count = 0;
    int start = 0;
    int counterror = 0;
    int starterror = 0;

    @Override
    public void testRunStarted(Description description) throws Exception {
        long timeTotalStarttime = System.currentTimeMillis();
        timeTotalStart = TimeUnit.MILLISECONDS.toSeconds(timeTotalStarttime);
        testCount = description.testCount();
    }
    @Override
    public void testRunFinished(Result result) throws Exception {
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();
        strDate = sdFormat.format(date);
        long timeTotalFinishtime = System.currentTimeMillis();
        timeTotalFinish = TimeUnit.MILLISECONDS.toSeconds(timeTotalFinishtime);
        timeTotal = timeTotalFinish - timeTotalStart;
        if (new File(extDir, "Failure.xml").exists()) {
            FileReader frr = new FileReader("/sdcard/failure.xml");
            BufferedReader brr = new BufferedReader(frr);
                String strNum = brr.readLine();
            StringBuffer sb = new StringBuffer();
           // while ((strNum)!=null){

            int ch;
            while ((ch=brr.read()) != -1) {
                sb.append((char)ch);
                //System.out.print((char)ch);
            }
                String str = sb.toString();
                String st = "failure message";
                while (str.indexOf(st, start) > 0 && start < str.length()) {
                    count++;
                    start = str.indexOf(st, start) + st.length();
                }
                frr.close();
                //System.out.println("Failure在" + str + "出现的次数为" + count);
                failcount =count;

        }
        else
        {
            failcount= 0;
        }
        if (new File(extDir, "Error.xml").exists()) {
            FileReader frrr = new FileReader("/sdcard/Error.xml");
            BufferedReader brrr = new BufferedReader(frrr);
            String strNum = brrr.readLine();
            StringBuffer sb = new StringBuffer();
            // while ((strNum)!=null){

            int ch;
            while ((ch=brrr.read()) != -1) {
                sb.append((char)ch);
              // System.out.print((char)ch);
            }
            String strr = sb.toString();
            String str = "Error message";
            while (strr.indexOf(str, starterror) > 0 && starterror < strr.length()) {
                counterror++;
                starterror = strr.indexOf(str, starterror) + str.length();
            }
            frrr.close();
            //System.out.println("Error在" + strr + "出现的次数为" + counterror);
            Errorcount =counterror;

        }
        else
        {
            Errorcount= 0;
        }


       /*if (!new File(extDir, "Failure.xml").exists())
        {
            failcount= 0;
        }
        if (!new File(extDir, "Error.xml").exists())
        {
           Errorcount= 0;
        }*/

            FileWriter fw = new FileWriter(new File(extDir, filename));
            fw.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            fw.write("<testsuites>\n");
            fw.write("<testsuite name=\"" + ClassName + "\" errors=\""+Errorcount+"\" skipped=\"" + result.getIgnoreCount() + "\" tests=\"" + result.getRunCount() + "\" failures=\"" +  failcount + "\" time=\"" + timeTotal + "\" timestamp=\"" + strDate + "\" />\n");
            fw.flush();
            if (new File(extDir, "Failure.xml").exists()&&new File(extDir, "Error.xml").exists()&&new File(extDir, "Success.xml").exists())
            {
                FileReader frrrr = new FileReader("/sdcard/Success.xml");
                BufferedReader brrrr = new BufferedReader(frrrr);
                while (brrrr.ready()) {
                    FileWriter fw4 = new FileWriter(new File(extDir, filename), true);
                    fw4.write(brrrr.readLine() + "\n");
                    fw4.close();
                }
                frrrr.close();
                FileReader fr = new FileReader("/sdcard/failure.xml");
                BufferedReader br = new BufferedReader(fr);
                while (br.ready()) {
                    FileWriter fw4 = new FileWriter(new File(extDir, filename), true);
                    fw4.write(br.readLine() + "\n");
                    fw4.close();
                }
                fr.close();
                    FileReader frr = new FileReader("/sdcard/Error.xml");
                    BufferedReader brr = new BufferedReader(frr);
                    while (brr.ready()) {
                        FileWriter fw4 = new FileWriter(new File(extDir, filename), true);
                        fw4.write(brr.readLine() + "\n");
                        fw4.close();
                    }
                    frr.close();
                    FileWriter fw10 = new FileWriter(new File(extDir, filename), true);
                    fw10.write("</testsuite>\n");
                    fw10.write("</testsuites>\n");
                    fw10.close();
            }

        if (new File(extDir, "Failure.xml").exists()&& !new File(extDir, "Error.xml").exists()&&new File(extDir, "Success.xml").exists())
        {
            FileReader frrrr = new FileReader("/sdcard/Success.xml");
            BufferedReader brrrr = new BufferedReader(frrrr);
            while (brrrr.ready()) {
                FileWriter fw4 = new FileWriter(new File(extDir, filename), true);
                fw4.write(brrrr.readLine() + "\n");
                fw4.close();
            }
            frrrr.close();

            FileReader fr = new FileReader("/sdcard/failure.xml");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                FileWriter fw4 = new FileWriter(new File(extDir, filename), true);
                fw4.write(br.readLine() + "\n");
                fw4.close();
            }
            fr.close();
            FileWriter fw10 = new FileWriter(new File(extDir, filename), true);
            fw10.write("</testsuite>\n");
            fw10.write("</testsuites>\n");
            fw10.close();
        }

        if (!new File(extDir, "Failure.xml").exists()&& new File(extDir, "Error.xml").exists()&&new File(extDir, "Success.xml").exists())
        {
            FileReader frrrr = new FileReader("/sdcard/Success.xml");
            BufferedReader brrrr = new BufferedReader(frrrr);
            while (brrrr.ready()) {
                FileWriter fw4 = new FileWriter(new File(extDir, filename), true);
                fw4.write(brrrr.readLine() + "\n");
                fw4.close();
            }
            frrrr.close();

            FileReader fr = new FileReader("/sdcard/Error.xml");
            BufferedReader br = new BufferedReader(fr);
            while (br.ready()) {
                FileWriter fw4 = new FileWriter(new File(extDir, filename), true);
                fw4.write(br.readLine() + "\n");
                fw4.close();
            }
            fr.close();
            FileWriter fw10 = new FileWriter(new File(extDir, filename), true);
            fw10.write("</testsuite>\n");
            fw10.write("</testsuites>\n");
            fw10.close();
        }
        if (!new File(extDir, "Failure.xml").exists()&& !new File(extDir, "Error.xml").exists()&&new File(extDir, "Success.xml").exists())
        {
            FileReader frrrr = new FileReader("/sdcard/Success.xml");
            BufferedReader brrrr = new BufferedReader(frrrr);
            while (brrrr.ready()) {
                FileWriter fw4 = new FileWriter(new File(extDir, filename), true);
                fw4.write(brrrr.readLine() + "\n");
                fw4.close();
            }
            frrrr.close();

            FileWriter fw10 = new FileWriter(new File(extDir, filename), true);
            fw10.write("</testsuite>\n");
            fw10.write("</testsuites>\n");
            fw10.close();
        }
        }
    @Override
    public void testStarted(Description description) throws Exception {
        long timeStarttime = System.currentTimeMillis();
        timeStart = TimeUnit.MILLISECONDS.toSeconds(timeStarttime);
        ClassName = description.getClassName();
    }
    @Override
    public void testFinished(Description description) throws Exception {
        long timeFinishtime = System.currentTimeMillis();
        timeFinish = TimeUnit.MILLISECONDS.toSeconds(timeFinishtime);
        timecount = timeFinish - timeStart;
    }
}
