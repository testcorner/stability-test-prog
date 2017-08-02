package com.android.calculator2;

import junit.framework.TestSuite;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

/**
 * Created by EdenLai on 2017/7/10.
 */
@RunWith(DurationTestRunner.class)
public class SuiteClassCodeClear2 extends TestSuite {
    @Test
   // @Duration(s = 10000)
    public void SuiteTest(){
        JUnitCore.runClasses(CalculatorTest2.class);
    }
}







