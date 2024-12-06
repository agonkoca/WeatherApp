package com.example.weatherapp;

import static org.junit.Assert.assertEquals;

import android.content.Context;

import androidx.test.core.app.ApplicationProvider;

import com.example.weatherapp.WeatherRVAdapter;
import com.example.weatherapp.WeatherRVModal;

import org.junit.Test;

import java.util.ArrayList;

public class RecyclerViewAdapterTest {

    @Test
    public void testRecyclerViewAdapterContents() {
        // Mock context
        Context context = ApplicationProvider.getApplicationContext();

        // Mock data
        ArrayList<WeatherRVModal> mockData = new ArrayList<>();
        mockData.add(new WeatherRVModal("10:00", "25°C", "icon_url", "15 km/h"));
        mockData.add(new WeatherRVModal("11:00", "28°C", "icon_url_2", "20 km/h"));

        // Initialize the adapter
        WeatherRVAdapter adapter = new WeatherRVAdapter(context, mockData);

        // Verify item count
        assertEquals(2, adapter.getItemCount());

        // Verify contents of each item
        WeatherRVModal firstItem = mockData.get(0);
        assertEquals("10:00", firstItem.getTime());
        assertEquals("25°C", firstItem.getTemperature());
        assertEquals("icon_url", firstItem.getIcon());
        assertEquals("15 km/h", firstItem.getWindSpeed());
    }
}
