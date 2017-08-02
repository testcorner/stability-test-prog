package com.android.calculator2;

import android.support.test.runner.AndroidJUnit4;

import junit.extensions.RepeatedTest;
import junit.framework.JUnit4TestAdapter;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;

import java.util.List;

import static android.R.attr.duration;

/**
 * Created by EdenLai on 2017/7/10.
 */
//@RunWith(runner.class)
//@RunWith(AndroidJUnit4.class)
// /@Suite.SuiteClasses(TestSuite.class)
//@RunWith(Suite.class)
//@Suite.SuiteClasses(CalculatorTest2.class)
//@RunWith(IntermittentTestRunner.class)
public class SuiteClass extends TestSuite {

    //@Duration(s = 7000)
   /* @Test
    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        //suite.addTest(new RepeatedTest(new TestSuite(),2));
            suite.addTest(new JUnit4TestAdapter(CalculatorTest2.class));
           // suite.addTest(new JUnit4TestAdapter(CalculatorTest4.class));
            //suite.addTest(new JUnit4TestAdapter(CalculatorTest2.class));
        return suite;
    }*/
    @Rule
    public DurationRule durationRule = new DurationRule();
    @Test
   // @Intermittent(repetition = 20)
   // @Duration(s = 10000)
    public void SuiteTest(){
        JUnitCore.runClasses(CalculatorTest2.class,CalculatorTest4.class);
        //JUnitCore.runClasses();
    }
    //@RunWith(Suite.class)
   // @Suite.SuiteClasses(CalculatorTest2.class)
   //public static class TestRunner {
   // }
       /* public static TestSuite suite() {
            TestSuite suite = new TestSuite();
            //suite.addTest(new RepeatedTest(new TestSuite(),2));
            suite.addTest(new JUnit4TestAdapter(CalculatorTest2.class));
            // suite.addTest(new JUnit4TestAdapter(CalculatorTest4.class));
            //suite.addTest(new JUnit4TestAdapter(CalculatorTest2.class));
            return suite;
        }
    }*/
}







