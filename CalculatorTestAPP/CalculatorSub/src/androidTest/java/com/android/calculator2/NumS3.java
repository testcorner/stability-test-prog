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
public class NumS3 {

    @Rule
    public ActivityTestRule<Calculator> mActivityTestRule = new ActivityTestRule<>(Calculator.class);

    @Test
    public void numS3() {
        ViewInteraction button = onView(
                allOf(withId(R.id.digit_9), withText("9"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button.perform(click());

        ViewInteraction calculatorEditText = onView(
                allOf(withId(R.id.formula),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("9"), closeSoftKeyboard());

        ViewInteraction button2 = onView(
                allOf(withId(R.id.digit_8), withText("8"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button2.perform(click());

        ViewInteraction calculatorEditText2 = onView(
                allOf(withId(R.id.formula), withText("9"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("98"), closeSoftKeyboard());

        ViewInteraction button3 = onView(
                allOf(withId(R.id.digit_4), withText("4"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button3.perform(click());

        ViewInteraction calculatorEditText3 = onView(
                allOf(withId(R.id.formula), withText("98"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984"), closeSoftKeyboard());

        ViewInteraction button4 = onView(
                allOf(withId(R.id.digit_6), withText("6"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button4.perform(click());

        ViewInteraction calculatorEditText4 = onView(
                allOf(withId(R.id.formula), withText("984"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("9846"), closeSoftKeyboard());

        ViewInteraction button5 = onView(
                allOf(withId(R.id.digit_3), withText("3"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button5.perform(click());

        ViewInteraction calculatorEditText5 = onView(
                allOf(withId(R.id.formula), withText("9846"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("98463"), closeSoftKeyboard());

        ViewInteraction button6 = onView(
                allOf(withId(R.id.digit_5), withText("5"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button6.perform(click());

        ViewInteraction calculatorEditText6 = onView(
                allOf(withId(R.id.formula), withText("98463"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635"), closeSoftKeyboard());

        ViewInteraction button7 = onView(
                allOf(withId(R.id.op_sub), withText("−"), withContentDescription("minus"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button7.perform(click());

        ViewInteraction calculatorEditText7 = onView(
                allOf(withId(R.id.formula), withText("984635"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−"), closeSoftKeyboard());

        ViewInteraction button8 = onView(
                allOf(withId(R.id.digit_2), withText("2"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button8.perform(click());

        ViewInteraction calculatorEditText8 = onView(
                allOf(withId(R.id.formula), withText("984635−"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−2"), closeSoftKeyboard());

        ViewInteraction button9 = onView(
                allOf(withId(R.id.digit_6), withText("6"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button9.perform(click());

        ViewInteraction calculatorEditText9 = onView(
                allOf(withId(R.id.formula), withText("984635−2"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26"), closeSoftKeyboard());

        ViewInteraction button10 = onView(
                allOf(withId(R.id.digit_8), withText("8"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button10.perform(click());

        ViewInteraction calculatorEditText10 = onView(
                allOf(withId(R.id.formula), withText("984635−26"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−268"), closeSoftKeyboard());

        ViewInteraction button11 = onView(
                allOf(withId(R.id.digit_7), withText("7"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button11.perform(click());

        ViewInteraction calculatorEditText11 = onView(
                allOf(withId(R.id.formula), withText("984635−268"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−2687"), closeSoftKeyboard());

        ViewInteraction button12 = onView(
                allOf(withId(R.id.digit_5), withText("5"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button12.perform(click());

        ViewInteraction calculatorEditText12 = onView(
                allOf(withId(R.id.formula), withText("984635−2687"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875"), closeSoftKeyboard());

        ViewInteraction button13 = onView(
                allOf(withId(R.id.op_sub), withText("−"), withContentDescription("minus"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button13.perform(click());

        ViewInteraction calculatorEditText13 = onView(
                allOf(withId(R.id.formula), withText("984635−26875"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−"), closeSoftKeyboard());

        ViewInteraction button14 = onView(
                allOf(withId(R.id.digit_3), withText("3"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button14.perform(click());

        ViewInteraction calculatorEditText14 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−3"), closeSoftKeyboard());

        ViewInteraction button15 = onView(
                allOf(withId(R.id.digit_1), withText("1"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button15.perform(click());

        ViewInteraction calculatorEditText15 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−3"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−31"), closeSoftKeyboard());

        ViewInteraction button16 = onView(
                allOf(withId(R.id.digit_5), withText("5"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button16.perform(click());

        ViewInteraction calculatorEditText16 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−31"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−315"), closeSoftKeyboard());

        ViewInteraction button17 = onView(
                allOf(withId(R.id.digit_6), withText("6"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button17.perform(click());

        ViewInteraction calculatorEditText17 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−315"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−3156"), closeSoftKeyboard());

        ViewInteraction button18 = onView(
                allOf(withId(R.id.digit_8), withText("8"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button18.perform(click());

        ViewInteraction calculatorEditText18 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−3156"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−31568"), closeSoftKeyboard());

        ViewInteraction button19 = onView(
                allOf(withId(R.id.op_sub), withText("−"), withContentDescription("minus"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button19.perform(click());

        ViewInteraction calculatorEditText19 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−31568"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−31568−"), closeSoftKeyboard());

        ViewInteraction button20 = onView(
                allOf(withId(R.id.digit_3), withText("3"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button20.perform(click());

        ViewInteraction calculatorEditText20 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−31568−"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−31568−3"), closeSoftKeyboard());

        ViewInteraction button21 = onView(
                allOf(withId(R.id.digit_4), withText("4"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button21.perform(click());

        ViewInteraction calculatorEditText21 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−31568−3"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−31568−34"), closeSoftKeyboard());

        ViewInteraction button22 = onView(
                allOf(withId(R.id.digit_2), withText("2"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button22.perform(click());

        ViewInteraction calculatorEditText22 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−31568−34"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−31568−342"), closeSoftKeyboard());

        ViewInteraction button23 = onView(
                allOf(withId(R.id.digit_0), withText("0"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button23.perform(click());

        ViewInteraction calculatorEditText23 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−31568−342"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−31568−3420"), closeSoftKeyboard());

        ViewInteraction button24 = onView(
                allOf(withId(R.id.op_sub), withText("−"), withContentDescription("minus"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button24.perform(click());

        ViewInteraction calculatorEditText24 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−31568−3420"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−31568−3420−"), closeSoftKeyboard());

        ViewInteraction button25 = onView(
                allOf(withId(R.id.digit_2), withText("2"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button25.perform(click());

        ViewInteraction calculatorEditText25 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−31568−3420−"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−31568−3420−2"), closeSoftKeyboard());

        ViewInteraction button26 = onView(
                allOf(withId(R.id.digit_1), withText("1"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button26.perform(click());

        ViewInteraction calculatorEditText26 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−31568−3420−2"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−31568−3420−21"), closeSoftKeyboard());

        ViewInteraction button27 = onView(
                allOf(withId(R.id.digit_5), withText("5"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button27.perform(click());

        ViewInteraction calculatorEditText27 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−31568−3420−21"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−31568−3420−215"), closeSoftKeyboard());

        ViewInteraction button28 = onView(
                allOf(withId(R.id.digit_9), withText("9"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button28.perform(click());

        ViewInteraction calculatorEditText28 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−31568−3420−215"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−31568−3420−2159"), closeSoftKeyboard());

        ViewInteraction button29 = onView(
                allOf(withId(R.id.digit_7), withText("7"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button29.perform(click());

        ViewInteraction calculatorEditText29 = onView(
                allOf(withId(R.id.formula), withText("984635−26875−31568−3420−2159"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("984635−26875−31568−3420−21597"), closeSoftKeyboard());

        ViewInteraction editText = onView(
                allOf(withId(R.id.result), withText("901175"),
                        childAtPosition(
                                allOf(withId(R.id.display),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                                0)),
                                1),
                        isDisplayed()));
        editText.check(matches(withText("901175")));

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
