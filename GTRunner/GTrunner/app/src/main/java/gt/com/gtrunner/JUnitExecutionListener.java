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
import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by EdenLai on 2017/9/18.
 */


public class JUnitExecutionListener extends RunListener {

    String filename = "Report.xml";
    String failurename = "Failure.xml";
    String Errorname = "Error.xml";
    String Successname = "Success.xml";
    File extDir = Environment.getExternalStorageDirectory();
    long timeStart,timeFinish,timeTotalStart,timeTotalFinish,timeTotal,timecount;
    String ClassName,strDate,FailureMethod,FailureName,FailureMsg;
    int FailureCount ,testCount;
    Integer failcount,n;
    int count = 0;
    int start = 0;

    @Override
    public void testStarted(Description description) throws Exception {
        long timeStarttime = System.currentTimeMillis();
        timeStart = TimeUnit.MILLISECONDS.toSeconds(timeStarttime);
    }
    @Override
    public void testFailure(Failure failure) throws Exception {
        SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();
        String strDate2 = sdFormat.format(date);
        long timefailuretime = System.currentTimeMillis();
        long timefailure = TimeUnit.MILLISECONDS.toSeconds(timefailuretime);
        long timecount2 = timefailure - timeStart;

        FailureName = failure.getDescription().getTestClass().getName();
        FailureMethod = failure.getDescription().getMethodName();
        FailureMsg = escapeXML(failure.getTrace());
        FileWriter fw2 = new FileWriter(new File(extDir, failurename), true);
        fw2.write("<testcase classname=\"" + FailureName + "\" name=\"" + FailureMethod + "\" time=\"" + timecount2 + "\">\n" +
                "<failure message=\"test failure\">" + FailureMsg + "</failure>\n");
        fw2.write("</testcase>\n");
        fw2.close();
        FailureCount++;
        System.out.println("FailureCount:" + FailureCount);
    }

    private String escapeXML(String xml) {
        String result = xml.replaceAll("&", "&amp;")
                           .replaceAll("<", "&lt;")
                           .replaceAll(">", "&gt;")
                           .replaceAll("\"", "&quot;")
                           .replaceAll("'", "&apos;");
        return result;
    }


    @Override
    public void testAssumptionFailure(Failure failure) {
    }
    @Override
    public void testIgnored(Description description) throws Exception {
    }

    @Override
    public void testFinished(Description description) throws Exception {
        long timeFinishtime = System.currentTimeMillis();
        timeFinish = TimeUnit.MILLISECONDS.toSeconds(timeFinishtime);
        timecount = timeFinish - timeStart;
        if(FailureCount != 1) {
            FileWriter fw2 = new FileWriter(new File(extDir, Successname), true);
            fw2.write("<testcase classname=\"" + description.getClassName() + "\" name=\"" + description.getMethodName() + "\" time=\"" + timecount + "\">\n");
            fw2.write("</testcase>\n");
            fw2.close();
        }
    }
}
