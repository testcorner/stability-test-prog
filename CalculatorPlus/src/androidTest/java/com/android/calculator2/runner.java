package com.android.calculator2;

import org.junit.Rule;
import org.junit.rules.TestName;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

import java.util.List;

/**
 * Created by EdenLai on 2017/7/17.
 */


    public class runner extends BlockJUnit4ClassRunner {
    //@Rule public TestName testName = new TestName();

        public runner(Class<?> klass) throws InitializationError {
            super(klass);
        }

        @Override
        public void run(RunNotifier notifier) {
            beforeRunTests();
            try {
                super.run(notifier);
            } finally {
                afterRunTests();
            }
        }

        private void afterRunTests() {


        }

        private void beforeRunTests() {
            Class clazz = getClass(); //if you want to get Class object
            String name = clazz.getName(); //you want to get only class name
            System.out.println(name);
           // System.out.println(testName.getMethodName());

           // List<Class<?>> classes = ClassFinder.find(runner.class.getPackage().getName());
            //List<Class<?>> classes = ClassFinder.find("com.android.calculator2");
            //System.out.println(classes);
        }

        private void trace() {

        }
    }

