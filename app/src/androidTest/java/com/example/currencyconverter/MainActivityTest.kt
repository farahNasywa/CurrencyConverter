package com.example.currencyconverter

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.onData
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    /* Test input angka dan pilih USD lalu tekan tombol konversi */
    @Test
    fun testConversionFlow() {
        ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.inputAmount)).perform(typeText("100000"), closeSoftKeyboard())
        onView(withId(R.id.currencySpinner)).perform(click())
        onData(allOf(`is`(instanceOf(String::class.java)), `is`("USD"))).perform(click())
        onView(withId(R.id.btnConvert)).perform(click())
        onView(withId(R.id.resultText)).check(matches(withSubstring("USD")))
    }

    /* Test hasil tetap muncul walaupun input kosong (default 0) */
    @Test
    fun testEmptyInputDefaultsToZero() {
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.btnConvert)).perform(click())
        onView(withId(R.id.resultText)).check(matches(withSubstring("0.00")))
    }
}
