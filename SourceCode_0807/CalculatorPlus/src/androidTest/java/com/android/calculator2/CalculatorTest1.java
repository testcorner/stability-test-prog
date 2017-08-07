package com.android.calculator2;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class CalculatorTest1 {

    @Rule
    public ActivityTestRule<Calculator> mActivityTestRule = new ActivityTestRule<>(Calculator.class, true, true);

    //基本的Espresso Test Case
    @Test
    public void one() {
        ViewInteraction button3 = onView(
                allOf(withId(R.id.digit_1), withText("1"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button3.perform(click());
        ViewInteraction button2 = onView(
                allOf(withId(R.id.op_add), withText("+"), withContentDescription("plus"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button2.perform(click());

        ViewInteraction button5 = onView(
                allOf(withId(R.id.digit_1), withText("1"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button3.perform(click());
        ViewInteraction button4 = onView(
                allOf(withId(R.id.op_add), withText("+"), withContentDescription("plus"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button2.perform(click());
        ViewInteraction button6 = onView(
                allOf(withId(R.id.digit_1), withText("1"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button3.perform(click());
    }

    @Test
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

        ViewInteraction button3 = onView(
                allOf(withId(R.id.digit_3), withText("3"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button3.perform(click());
        System.out.println("espresso test case");


    }
}
