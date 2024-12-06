package com.example.weatherapp;

import androidx.test.espresso.Espresso;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.scrollToPosition;
import static androidx.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.not;

public class MainActivityInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testCitySearchUpdatesCityName() {
        // Type a city name into the input field
        Espresso.onView(withId(R.id.idEdtCity))
                .perform(typeText("London"), closeSoftKeyboard());

        // Click the search button
        Espresso.onView(withId(R.id.idTVSearch))
                .perform(click());

        // Check if the TextView displays the entered city name
        Espresso.onView(withId(R.id.idTVCityName))
                .check(matches(withText("London")));
    }





    @Test
    public void testRecyclerViewIsDisplayedAfterSearch() {
        // Type a city name into the input field
        Espresso.onView(withId(R.id.idEdtCity))
                .perform(typeText("New York"), closeSoftKeyboard());

        // Click the search button
        Espresso.onView(withId(R.id.idTVSearch))
                .perform(click());

        // Wait for the RecyclerView to populate (use IdlingResource in production)
        try {
            Thread.sleep(3000); // Temporary sleep to wait for API response
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify that the RecyclerView is visible
        Espresso.onView(withId(R.id.idRvWeather))
                .check(matches(isDisplayed()));
    }



    @Test
    public void testDefaultCityNameOnLaunch() {
        // Verify that the city name is displayed (e.g., based on location)
        Espresso.onView(withId(R.id.idTVCityName))
                .check(matches(not(withText(""))))
                .check(matches(isDisplayed()));
    }
}
