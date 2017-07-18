package com.android.calculator2;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.AllTests;
import org.junit.runners.Suite;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

//@RunWith(AndroidJUnit4.class)
//@RunWith(runner.class)
//RunWith(NameAwareRunner.class)
//@Suite.SuiteClasses(CalculatorTest2.class)
//@RunWith(RandomRunner.class)

public class CalculatorTest2 {

    @Rule
    public ActivityTestRule<Calculator> mActivityTestRule = new ActivityTestRule<>(Calculator.class,true,true);
   // public RepeatRule repeatRule = new RepeatRule();
    @Rule
    public DurationRule durationRule = new DurationRule();

    /*@After
    public void calculatorTest1() {
        ViewInteraction button = onView(
                allOf(withId(R.id.digit_1), withText("1"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button.perform(click());

        ViewInteraction calculatorEditText = onView(
                allOf(withId(R.id.formula),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("1"), closeSoftKeyboard());
        ViewInteraction button2 = onView(
                allOf(withId(R.id.digit_1), withText("1"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button.perform(click());

        ViewInteraction calculatorEditText1 = onView(
                allOf(withId(R.id.formula),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("1"), closeSoftKeyboard());
    }
*/
   // @Test
    public void one() {
        System.out.println("one");
    }
   // @Test
    public void six() { System.out.println("6"); }
   // @Test
    public void four() {
        System.out.println("4");
    }
   // @Test
    public void five() {
        System.out.println("5");
    }
    @Test
    //@Order(order = 2)
    //@Repeat(times = 5)
    //@Duration(s = 7000)
    public void two() {
        ViewInteraction button = onView(
                allOf(withId(R.id.digit_1), withText("1"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button.perform(click());

        ViewInteraction button2 = onView(
                allOf(withId(R.id.op_add), withText("+"), withContentDescription("plus"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button2.perform(click());
        //System.out.println("two");
        System.out.println("espresso test case");


    }


    public void setUp() throws Exception{
    Class clazz = this.getClass(); //if you want to get Class object
    String name = clazz.getCanonicalName(); //you want to get only class name
        System.out.println(name);
}
    }


   /* public void calculatorTest2() {
        ViewInteraction button = onView(
                allOf(withId(R.id.digit_1), withText("1"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button.perform(click());

        ViewInteraction calculatorEditText = onView(
                allOf(withId(R.id.formula),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("1"), closeSoftKeyboard());

        ViewInteraction button2 = onView(
                allOf(withId(R.id.op_add), withText("+"), withContentDescription("plus"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button2.perform(click());

        ViewInteraction calculatorEditText2 = onView(
                allOf(withId(R.id.formula), withText("1"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("1+"), closeSoftKeyboard());

        ViewInteraction button3 = onView(
                allOf(withId(R.id.digit_2), withText("2"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button3.perform(click());

        ViewInteraction calculatorEditText3 = onView(
                allOf(withId(R.id.formula), withText("1+"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("1+2"), closeSoftKeyboard());

    }

}*/
