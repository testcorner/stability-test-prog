package com.android.calculator2;

/**
 * Created by EdenLai on 2017/7/31.
 */
import com.android.calculator2.cpsuite.ClasspathSuite;
import com.android.calculator2.cpsuite.SuiteType;
import org.junit.runner.RunWith;

import static com.android.calculator2.cpsuite.SuiteType.JUNIT38_TEST_CLASSES;
@ClasspathSuite.ClasspathProperty("d:\\Users\\EdenLai\\Desktop\\CalculatorPlus_0728\\CalculatorPlus\\CalculatorPlus\\src\\androidTest\\java\\com\\android\\calculator2")
@RunWith(ClasspathSuite.class)
@ClasspathSuite.SuiteTypes(JUNIT38_TEST_CLASSES)
public class AllJUnit38Tests {}
