package com.android.calculator2;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.AllTests;
import org.junit.runners.Suite;

/**
 * Created by EdenLai on 2017/7/31.
 */

//@RunWith(SuiteTestRunner.class)
//@SuiteTest({ AllTests.class, AllTests.class, AllTests.class})
public class MasterTest {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(AllTests.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
    }
}