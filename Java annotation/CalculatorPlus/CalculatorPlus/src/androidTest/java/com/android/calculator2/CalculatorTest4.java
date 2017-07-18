package com.android.calculator2;


import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//@RunWith(AndroidJUnit4.class)
@RunWith(OrderedRunner.class)

@Suite.SuiteClasses(CalculatorTest4.class)

public class CalculatorTest4 {

    @Rule
    public ActivityTestRule<Calculator> mActivityTestRule = new ActivityTestRule<>(Calculator.class);
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
    @Test
    @Order(order = 3)
    public void second() {
        System.out.println("five");
    }

    @Test
    @Order(order = 2)
    //@Repeat(times = 5)
    //@Duration(times = 1)
    public void third() {
        System.out.println("four");
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
