package com.android.calculator2;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.AllTests;

@RunWith(AllTests.class)
public class MasterTester {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite();
        suite.addTest(new junit.framework.JUnit4TestAdapter(CalculatorTest2.class));
      //  suite.addTest(new junit.framework.JUnit4TestAdapter(ExampleInstrumentedTest2.class));
        return suite;
    }
}