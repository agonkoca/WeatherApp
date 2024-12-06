package com.example.weatherapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeatherRVModalTest {

    @Test
    public void testWeatherRVModalGettersAndSetters() {
        // Create a WeatherRVModal object
        WeatherRVModal modal = new WeatherRVModal("10:00", "25", "icon_url", "15");

        // Test getters
        assertEquals("10:00", modal.getTime());
        assertEquals("25", modal.getTemperature());
        assertEquals("icon_url", modal.getIcon());
        assertEquals("15", modal.getWindSpeed());

        // Test setters
        modal.setTime("12:00");
        modal.setTemperature("30");
        modal.setIcon("new_icon_url");
        modal.setWindSpeed("20");

        assertEquals("12:00", modal.getTime());
        assertEquals("30", modal.getTemperature());
        assertEquals("new_icon_url", modal.getIcon());
        assertEquals("20", modal.getWindSpeed());
    }

    @Test
    public void testEmptyWeatherRVModal() {
        // Create an empty WeatherRVModal object
        WeatherRVModal modal = new WeatherRVModal("", "", "", "");

        // Test getters
        assertEquals("", modal.getTime());
        assertEquals("", modal.getTemperature());
        assertEquals("", modal.getIcon());
        assertEquals("", modal.getWindSpeed());
    }

    @Test
    public void testWeatherRVModalWithNullValues() {
        // Create a WeatherRVModal object with null values
        WeatherRVModal modal = new WeatherRVModal(null, null, null, null);

        // Test getters
        assertNull(modal.getTime());
        assertNull(modal.getTemperature());
        assertNull(modal.getIcon());
        assertNull(modal.getWindSpeed());
    }

    @Test
    public void testWeatherRVModalPartialInitialization() {
        // Create a WeatherRVModal object with partial values
        WeatherRVModal modal = new WeatherRVModal("10:00", "25", null, "");

        // Test getters
        assertEquals("10:00", modal.getTime());
        assertEquals("25", modal.getTemperature());
        assertNull(modal.getIcon());
        assertEquals("", modal.getWindSpeed());

        // Test setters
        modal.setIcon("icon_url");
        modal.setWindSpeed("15");

        assertEquals("icon_url", modal.getIcon());
        assertEquals("15", modal.getWindSpeed());
    }

    @Test
    public void testWeatherRVModalEquality() {
        // Create two identical WeatherRVModal objects
        WeatherRVModal modal1 = new WeatherRVModal("10:00", "25", "icon_url", "15");
        WeatherRVModal modal2 = new WeatherRVModal("10:00", "25", "icon_url", "15");

        // Verify equality based on field values
        assertEquals(modal1.getTime(), modal2.getTime());
        assertEquals(modal1.getTemperature(), modal2.getTemperature());
        assertEquals(modal1.getIcon(), modal2.getIcon());
        assertEquals(modal1.getWindSpeed(), modal2.getWindSpeed());
    }

    @Test
    public void testWeatherRVModalFieldModification() {
        // Create a WeatherRVModal object
        WeatherRVModal modal = new WeatherRVModal("10:00", "25", "icon_url", "15");

        // Modify fields using setters
        modal.setTime("15:00");
        modal.setTemperature("20");
        modal.setIcon("new_icon_url");
        modal.setWindSpeed("10");

        // Verify updated values
        assertEquals("15:00", modal.getTime());
        assertEquals("20", modal.getTemperature());
        assertEquals("new_icon_url", modal.getIcon());
        assertEquals("10", modal.getWindSpeed());
    }
}
