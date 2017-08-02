package com.android.calculator2;

import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunListener;
import org.junit.runners.Suite;

//@RunWith(IntermittentTestRunner.class)
//
//public class SuiteClassCodeClear extends TestSuite {
//    @Test
//    @Intermittent(s = 30000)
//
//    public void SuiteTest() {
//
//      //  JUnitCore.runClasses(CalculatorTest2.class);
//    }
//}

//@RunWith(DurationTestRunner.class)
//public class SuiteClassCodeClear {
//    @Test
//    @Duration(s = 30000)
//    public void SuiteTest() throws Exception {
//        JUnitCore.runClasses(CalculatorTest2.class);
//    }
//
//}



@RunWith(DurationTestRunner.class)
public class StabilityTest {
    @Test
    @Duration(s = 10 * 60)
    public void Stage1(){
        JUnitCore.runClasses(CalculatorTest2.class);
        System.out.println("Test case1");
    }
    @Test
    @Duration(s = 10)
        public void Stage2(){
        JUnitCore.runClasses(CalculatorTest4.class);
        System.out.println("Test case2");
    }
}






////@RunWith(SuiteTestRunner.class)
//@RunWith(IntermittentTestRunner.class)
//@SuiteTest(CalculatorTest2.class)
//public class SuiteClassCodeClear {
//    @Intermittent(s = 30000)
//    public void SuiteTest(){
//    }
//}
//
//@RunWith(SuiteTestRunner.class)
//@Intermittent(s = 30000)
//@SuiteTest(CalculatorTest2.class)
//public class SuiteClassCodeClear {
//}
