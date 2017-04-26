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
public class CalculatorTest2 {

    @Rule
    public ActivityTestRule<Calculator> mActivityTestRule = new ActivityTestRule<>(Calculator.class);

    @Test
    public void calculatorTest2() {
        ViewInteraction button = onView(
                allOf(withId(R.id.digit_4), withText("4"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button.perform(click());

        ViewInteraction calculatorEditText = onView(
                allOf(withId(R.id.formula),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4"), closeSoftKeyboard());

        ViewInteraction button2 = onView(
                allOf(withId(R.id.digit_8), withText("8"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button2.perform(click());

        ViewInteraction calculatorEditText2 = onView(
                allOf(withId(R.id.formula), withText("4"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("48"), closeSoftKeyboard());

        ViewInteraction button3 = onView(
                allOf(withId(R.id.digit_7), withText("7"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button3.perform(click());

        ViewInteraction calculatorEditText3 = onView(
                allOf(withId(R.id.formula), withText("48"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("487"), closeSoftKeyboard());

        ViewInteraction button4 = onView(
                allOf(withId(R.id.digit_5), withText("5"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button4.perform(click());

        ViewInteraction calculatorEditText4 = onView(
                allOf(withId(R.id.formula), withText("487"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875"), closeSoftKeyboard());

        ViewInteraction button5 = onView(
                allOf(withId(R.id.op_add), withText("+"), withContentDescription("plus"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button5.perform(click());

        ViewInteraction calculatorEditText5 = onView(
                allOf(withId(R.id.formula), withText("4875"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+"), closeSoftKeyboard());

        ViewInteraction button6 = onView(
                allOf(withId(R.id.digit_5), withText("5"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button6.perform(click());

        ViewInteraction calculatorEditText6 = onView(
                allOf(withId(R.id.formula), withText("4875+"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5"), closeSoftKeyboard());

        ViewInteraction button7 = onView(
                allOf(withId(R.id.digit_9), withText("9"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button7.perform(click());

        ViewInteraction calculatorEditText7 = onView(
                allOf(withId(R.id.formula), withText("4875+5"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+59"), closeSoftKeyboard());

        ViewInteraction button8 = onView(
                allOf(withId(R.id.digit_7), withText("7"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button8.perform(click());

        ViewInteraction calculatorEditText8 = onView(
                allOf(withId(R.id.formula), withText("4875+59"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+597"), closeSoftKeyboard());

        ViewInteraction button9 = onView(
                allOf(withId(R.id.digit_1), withText("1"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button9.perform(click());

        ViewInteraction calculatorEditText9 = onView(
                allOf(withId(R.id.formula), withText("4875+597"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971"), closeSoftKeyboard());

        ViewInteraction button10 = onView(
                allOf(withId(R.id.op_add), withText("+"), withContentDescription("plus"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button10.perform(click());

        ViewInteraction calculatorEditText10 = onView(
                allOf(withId(R.id.formula), withText("4875+5971"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+"), closeSoftKeyboard());

        ViewInteraction button11 = onView(
                allOf(withId(R.id.digit_3), withText("3"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button11.perform(click());

        ViewInteraction calculatorEditText11 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3"), closeSoftKeyboard());

        ViewInteraction button12 = onView(
                allOf(withId(R.id.digit_6), withText("6"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button12.perform(click());

        ViewInteraction calculatorEditText12 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+36"), closeSoftKeyboard());

        ViewInteraction button13 = onView(
                allOf(withId(R.id.digit_8), withText("8"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button13.perform(click());

        ViewInteraction calculatorEditText13 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+36"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+368"), closeSoftKeyboard());

        ViewInteraction button14 = onView(
                allOf(withId(R.id.digit_2), withText("2"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button14.perform(click());

        ViewInteraction calculatorEditText14 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+368"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682"), closeSoftKeyboard());

        ViewInteraction button15 = onView(
                allOf(withId(R.id.op_add), withText("+"), withContentDescription("plus"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button15.perform(click());

        ViewInteraction calculatorEditText15 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+"), closeSoftKeyboard());

        ViewInteraction button16 = onView(
                allOf(withId(R.id.digit_9), withText("9"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button16.perform(click());

        ViewInteraction calculatorEditText16 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682+"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+9"), closeSoftKeyboard());

        ViewInteraction button17 = onView(
                allOf(withId(R.id.digit_4), withText("4"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button17.perform(click());

        ViewInteraction calculatorEditText17 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682+9"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+94"), closeSoftKeyboard());

        ViewInteraction button18 = onView(
                allOf(withId(R.id.digit_7), withText("7"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button18.perform(click());

        ViewInteraction calculatorEditText18 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682+94"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+947"), closeSoftKeyboard());

        ViewInteraction button19 = onView(
                allOf(withId(R.id.digit_6), withText("6"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button19.perform(click());

        ViewInteraction calculatorEditText19 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682+947"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+9476"), closeSoftKeyboard());

        ViewInteraction button20 = onView(
                allOf(withId(R.id.op_add), withText("+"), withContentDescription("plus"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button20.perform(click());

        ViewInteraction calculatorEditText20 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682+9476"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+9476+"), closeSoftKeyboard());

        ViewInteraction button21 = onView(
                allOf(withId(R.id.digit_2), withText("2"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button21.perform(click());

        ViewInteraction calculatorEditText21 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682+9476+"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+9476+2"), closeSoftKeyboard());

        ViewInteraction button22 = onView(
                allOf(withId(R.id.digit_3), withText("3"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button22.perform(click());

        ViewInteraction calculatorEditText22 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682+9476+2"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+9476+23"), closeSoftKeyboard());

        ViewInteraction button23 = onView(
                allOf(withId(R.id.digit_8), withText("8"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button23.perform(click());

        ViewInteraction calculatorEditText23 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682+9476+23"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+9476+238"), closeSoftKeyboard());

        ViewInteraction button24 = onView(
                allOf(withId(R.id.digit_4), withText("4"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button24.perform(click());

        ViewInteraction calculatorEditText24 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682+9476+238"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+9476+2384"), closeSoftKeyboard());

        ViewInteraction button25 = onView(
                allOf(withId(R.id.op_add), withText("+"), withContentDescription("plus"),
                        withParent(withId(R.id.pad_operator)),
                        isDisplayed()));
        button25.perform(click());

        ViewInteraction calculatorEditText25 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682+9476+2384"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+9476+2384+"), closeSoftKeyboard());

        ViewInteraction button26 = onView(
                allOf(withId(R.id.digit_5), withText("5"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button26.perform(click());

        ViewInteraction calculatorEditText26 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682+9476+2384+"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+9476+2384+5"), closeSoftKeyboard());

        ViewInteraction button27 = onView(
                allOf(withId(R.id.digit_9), withText("9"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button27.perform(click());

        ViewInteraction calculatorEditText27 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682+9476+2384+5"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+9476+2384+59"), closeSoftKeyboard());

        ViewInteraction button28 = onView(
                allOf(withId(R.id.digit_7), withText("7"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button28.perform(click());

        ViewInteraction calculatorEditText28 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682+9476+2384+59"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+9476+2384+597"), closeSoftKeyboard());

        ViewInteraction button29 = onView(
                allOf(withId(R.id.digit_1), withText("1"),
                        withParent(withId(R.id.pad_numeric)),
                        isDisplayed()));
        button29.perform(click());

        ViewInteraction calculatorEditText29 = onView(
                allOf(withId(R.id.formula), withText("4875+5971+3682+9476+2384+597"),
                        withParent(withId(R.id.display)),
                        isDisplayed()));
        calculatorEditText.perform(replaceText("4875+5971+3682+9476+2384+5971"), closeSoftKeyboard());

        ViewInteraction editText = onView(
                allOf(withId(R.id.result), withText("32359"),
                        childAtPosition(
                                allOf(withId(R.id.display),
                                        childAtPosition(
                                                IsInstanceOf.<View>instanceOf(android.widget.LinearLayout.class),
                                                0)),
                                1),
                        isDisplayed()));
        editText.check(matches(withText("32359")));

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
