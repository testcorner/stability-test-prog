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
public class NumM3 {

    @Rule
    public ActivityTestRule<Calculator> mActivityTestRule = new ActivityTestRule<>(Calculator.class);

    @Test
    public void numM3() {
        ViewInteraction button = onView(
                allOf(withId(R.id.digit_7), withText("7"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button.perform(click());

        ViewInteraction calculatorEditText = onView(
                allOf(withId(R.id.formula),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("7"), closeSoftKeyboard());

        ViewInteraction button2 = onView(
                allOf(withId(R.id.digit_9), withText("9"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button2.perform(click());

        ViewInteraction calculatorEditText2 = onView(
                allOf(withId(R.id.formula), withText("7"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("79"), closeSoftKeyboard());

        ViewInteraction button3 = onView(
                allOf(withId(R.id.digit_4), withText("4"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button3.perform(click());

        ViewInteraction calculatorEditText3 = onView(
                allOf(withId(R.id.formula), withText("79"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794"), closeSoftKeyboard());

        ViewInteraction button4 = onView(
                allOf(withId(R.id.op_mul), withText("×"), withContentDescription("times"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button4.perform(click());

        ViewInteraction calculatorEditText4 = onView(
                allOf(withId(R.id.formula), withText("794"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×"), closeSoftKeyboard());

        ViewInteraction button5 = onView(
                allOf(withId(R.id.digit_6), withText("6"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button5.perform(click());

        ViewInteraction calculatorEditText5 = onView(
                allOf(withId(R.id.formula), withText("794×"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×6"), closeSoftKeyboard());

        ViewInteraction button6 = onView(
                allOf(withId(R.id.digit_8), withText("8"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button6.perform(click());

        ViewInteraction calculatorEditText6 = onView(
                allOf(withId(R.id.formula), withText("794×6"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×68"), closeSoftKeyboard());

        ViewInteraction button7 = onView(
                allOf(withId(R.id.digit_5), withText("5"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button7.perform(click());

        ViewInteraction calculatorEditText7 = onView(
                allOf(withId(R.id.formula), withText("794×68"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×685"), closeSoftKeyboard());

        ViewInteraction button8 = onView(
                allOf(withId(R.id.digit_9), withText("9"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button8.perform(click());

        ViewInteraction calculatorEditText8 = onView(
                allOf(withId(R.id.formula), withText("794×685"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×6859"), closeSoftKeyboard());

        ViewInteraction button9 = onView(
                allOf(withId(R.id.op_mul), withText("×"), withContentDescription("times"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button9.perform(click());

        ViewInteraction calculatorEditText9 = onView(
                allOf(withId(R.id.formula), withText("794×6859"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×6859×"), closeSoftKeyboard());

        ViewInteraction button10 = onView(
                allOf(withId(R.id.digit_3), withText("3"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button10.perform(click());

        ViewInteraction calculatorEditText10 = onView(
                allOf(withId(R.id.formula), withText("794×6859×"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×6859×3"), closeSoftKeyboard());

        ViewInteraction button11 = onView(
                allOf(withId(R.id.digit_7), withText("7"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button11.perform(click());

        ViewInteraction calculatorEditText11 = onView(
                allOf(withId(R.id.formula), withText("794×6859×3"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×6859×37"), closeSoftKeyboard());

        ViewInteraction button12 = onView(
                allOf(withId(R.id.digit_4), withText("4"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button12.perform(click());

        ViewInteraction calculatorEditText12 = onView(
                allOf(withId(R.id.formula), withText("794×6859×37"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×6859×374"), closeSoftKeyboard());

        ViewInteraction button13 = onView(
                allOf(withId(R.id.digit_9), withText("9"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button13.perform(click());

        ViewInteraction calculatorEditText13 = onView(
                allOf(withId(R.id.formula), withText("794×6859×374"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×6859×3749"), closeSoftKeyboard());

        ViewInteraction button14 = onView(
                allOf(withId(R.id.op_mul), withText("×"), withContentDescription("times"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button14.perform(click());

        ViewInteraction calculatorEditText14 = onView(
                allOf(withId(R.id.formula), withText("794×6859×3749"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×6859×3749×"), closeSoftKeyboard());

        ViewInteraction button15 = onView(
                allOf(withId(R.id.digit_6), withText("6"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button15.perform(click());

        ViewInteraction calculatorEditText15 = onView(
                allOf(withId(R.id.formula), withText("794×6859×3749×"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×6859×3749×6"), closeSoftKeyboard());

        ViewInteraction button16 = onView(
                allOf(withId(R.id.digit_8), withText("8"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button16.perform(click());

        ViewInteraction calculatorEditText16 = onView(
                allOf(withId(R.id.formula), withText("794×6859×3749×6"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×6859×3749×68"), closeSoftKeyboard());

        ViewInteraction button17 = onView(
                allOf(withId(R.id.digit_1), withText("1"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button17.perform(click());

        ViewInteraction calculatorEditText17 = onView(
                allOf(withId(R.id.formula), withText("794×6859×3749×68"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×6859×3749×681"), closeSoftKeyboard());

        ViewInteraction button18 = onView(
                allOf(withId(R.id.op_mul), withText("×"), withContentDescription("times"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button18.perform(click());

        ViewInteraction calculatorEditText18 = onView(
                allOf(withId(R.id.formula), withText("794×6859×3749×681"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×6859×3749×681×"), closeSoftKeyboard());

        ViewInteraction button19 = onView(
                allOf(withId(R.id.digit_3), withText("3"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button19.perform(click());

        ViewInteraction calculatorEditText19 = onView(
                allOf(withId(R.id.formula), withText("794×6859×3749×681×"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×6859×3749×681×3"), closeSoftKeyboard());

        ViewInteraction button20 = onView(
                allOf(withId(R.id.digit_5), withText("5"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button20.perform(click());

        ViewInteraction calculatorEditText20 = onView(
                allOf(withId(R.id.formula), withText("794×6859×3749×681×3"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("794×6859×3749×681×35"), closeSoftKeyboard());

        ViewInteraction editText = onView(
                allOf(withId(R.id.result), withText("4.8664459E14"),
                        childAtPosition(
                                allOf(withId(R.id.display),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                                0)),
                                1),
                        isDisplayed()));
        editText.check(matches(withText("4.8664459E14")));

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
