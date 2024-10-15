package com.weatherdata;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class WeatherDataGenerator {
    public static List<WeatherData> generateSampleData() {
        List<WeatherData> weatherData = new ArrayList<>();
        weatherData.add(new WeatherData(LocalDate.of(2023, 1, 1), 25.0, 60.0, 1010.0, 10.0));
        // Add more sample data points
        return weatherData;
    }
}