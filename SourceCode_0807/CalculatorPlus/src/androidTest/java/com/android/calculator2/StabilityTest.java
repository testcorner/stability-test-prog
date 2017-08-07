package com.android.calculator2;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

//加上@RunWith

@RunWith(DurationTestRunner.class)
public class StabilityTest {
    @Test
    //@Duration (以秒為單位，下面 10 * 60 = 600 秒 ， = 十分鐘)
    @Duration(s = 10 * 60)
    public void Stage1() {
        //JUnitCore.runClasses(需要run的Espresso test class)
        JUnitCore.runClasses(CalculatorTest1.class);
        System.out.println("Test case1");
    }

    @Test
    @Duration(s = 10)
    public void Stage2() {
        JUnitCore.runClasses(CalculatorTest2.class);
        System.out.println("Test case2");
    }
}
