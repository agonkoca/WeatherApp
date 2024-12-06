package com.example.weatherapp;

import static org.mockito.Mockito.mock;

import android.content.Context;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

import com.example.weatherapp.WeatherRVAdapter;
import com.example.weatherapp.WeatherRVModal;

public class WeatherRVAdapterTest {

    @Test
    public void testWeatherRVAdapterItemCount() {
        Context mockContext = mock(Context.class);

        // Prepare a mock dataset
        ArrayList<WeatherRVModal> dataList = new ArrayList<>();
        dataList.add(new WeatherRVModal("10:00", "25", "icon_url", "15"));
        dataList.add(new WeatherRVModal("11:00", "28", "icon_url_2", "18"));

        // Initialize the adapter
        WeatherRVAdapter adapter = new WeatherRVAdapter(mockContext, dataList);

        // Verify the item count
        assertEquals(2, adapter.getItemCount());
    }
}
