package com.example.myapplication

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCompareButton_equalTexts() {
        onView(withId(R.id.editTextText)).perform(typeText("Hola"))
        onView(withId(R.id.editTextText3)).perform(typeText("Hola"))
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.viewText)).check(ViewAssertions.matches(withText("Son iguales! escribiste mucho Hola")))
    }

    @Test
    fun testCompareButton_differentTexts() {
        onView(withId(R.id.editTextText)).perform(typeText("Hola"))
        onView(withId(R.id.editTextText3)).perform(typeText("Chau"))
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.viewText)).check(ViewAssertions.matches(withText("Los textos son distintos Hola y Chau")))
    }
}
