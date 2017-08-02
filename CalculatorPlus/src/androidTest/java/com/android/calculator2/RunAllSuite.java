package com.android.calculator2;

/**
 * Created by EdenLai on 2017/7/31.
 */

import com.android.calculator2.cpsuite.ClasspathSuite;
import com.android.calculator2.cpsuite.ClasspathSuite.*;
import org.junit.runner.RunWith;
import org.junit.runner.JUnitCore;
import org.junit.internal.TextListener;
import static com.android.calculator2.cpsuite.SuiteType.*;

@RunWith(ClasspathSuite.class)
@SuiteTypes({ JUNIT38_TEST_CLASSES, TEST_CLASSES })
public class RunAllSuite {
    public static void main(String args[]) {
        JUnitCore junit = new JUnitCore();
       // junit.addListener(new TextListener(System.out));
        junit.run(RunAllSuite.class);
    }
}