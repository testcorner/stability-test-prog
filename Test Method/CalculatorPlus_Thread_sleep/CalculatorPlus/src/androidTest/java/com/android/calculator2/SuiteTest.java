package com.android.calculator2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;



@RunWith(Suite.class)

@Suite.SuiteClasses({CalculatorTest2.class, CalculatorTest3.class})
public class SuiteTest {

    @After
    public void tearDown() throws Exception {
        try {
           Thread.sleep(10000);

        } catch (InterruptedException e) {
           e.printStackTrace();
       }




        }
    }
