package com.android.calculator2;


import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class NumS {

    @Rule
    public ActivityTestRule<Calculator> mActivityTestRule = new ActivityTestRule<>(Calculator.class);

    @Test
    public void numS() {
        ViewInteraction button = onView(
                allOf(withId(R.id.digit_6), withText("6"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button.perform(click());

        ViewInteraction calculatorEditText = onView(
                allOf(withId(R.id.formula),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("6"), closeSoftKeyboard());

        ViewInteraction button2 = onView(
                allOf(withId(R.id.digit_1), withText("1"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button2.perform(click());

        ViewInteraction calculatorEditText2 = onView(
                allOf(withId(R.id.formula), withText("6"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("61"), closeSoftKeyboard());

        ViewInteraction button3 = onView(
                allOf(withId(R.id.digit_2), withText("2"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button3.perform(click());

        ViewInteraction calculatorEditText3 = onView(
                allOf(withId(R.id.formula), withText("61"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("612"), closeSoftKeyboard());

        ViewInteraction button4 = onView(
                allOf(withId(R.id.op_sub), withText("−"), withContentDescription("minus"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button4.perform(click());

        ViewInteraction calculatorEditText4 = onView(
                allOf(withId(R.id.formula), withText("612"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("612−"), closeSoftKeyboard());

        ViewInteraction button5 = onView(
                allOf(withId(R.id.digit_5), withText("5"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button5.perform(click());

        ViewInteraction calculatorEditText5 = onView(
                allOf(withId(R.id.formula), withText("612−"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("612−5"), closeSoftKeyboard());

        ViewInteraction button6 = onView(
                allOf(withId(R.id.digit_0), withText("0"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button6.perform(click());

        ViewInteraction calculatorEditText6 = onView(
                allOf(withId(R.id.formula), withText("612−5"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("612−50"), closeSoftKeyboard());

        ViewInteraction editText = onView(
                allOf(withId(R.id.result), withText("562"),
                        childAtPosition(
                                allOf(withId(R.id.display),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                                0)),
                                1),
                        isDisplayed()));
        editText.check(matches(withText("562")));

    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
