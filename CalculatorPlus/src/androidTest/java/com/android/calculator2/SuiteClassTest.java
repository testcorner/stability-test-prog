package com.android.calculator2;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

@RunWith(DurationTestRunner.class)


public class SuiteClassTest {
    @SuiteTest(CalculatorTest.class)
    public void SuiteTest() throws Exception {
        JUnitCore.runClasses(CalculatorTest2.class);
    }
}