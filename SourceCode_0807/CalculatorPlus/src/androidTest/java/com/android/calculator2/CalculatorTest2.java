package com.android.calculator2;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;


public class CalculatorTest2 {

    @Rule
    public ActivityTestRule<Calculator> mActivityTestRule = new ActivityTestRule<>(Calculator.class);

    //基本的Espresso Test Case
    @Test
    public void three() {
        ViewInteraction button3 = onView(
                allOf(withId(R.id.digit_3), withText("3"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button3.perform(click());
        System.out.println("3");
    }

    @Test
    public void four() {
        ViewInteraction button3 = onView(
                allOf(withId(R.id.digit_4), withText("4"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button3.perform(click());
        System.out.println("4");
    }
}

