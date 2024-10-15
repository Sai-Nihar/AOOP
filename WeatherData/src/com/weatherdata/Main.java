package com.weatherdata;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<WeatherData> weatherData = WeatherDataGenerator.generateSampleData();

        double averageTemp = WeatherDataAggregator.calculateAverageTemperature(weatherData);
        double maxTemp = WeatherDataAggregator.findMaximumTemperature(weatherData);
        double minPressure = WeatherDataAggregator.findMinimumPressure(weatherData);
        List<WeatherData> filteredData = WeatherDataAggregator.filterDataByTemperature(weatherData, 20.0);

        System.out.println("Average Temperature: " + averageTemp);
        System.out.println("Maximum Temperature: " + maxTemp);
        System.out.println("Minimum Pressure: " + minPressure);
        System.out.println("Filtered Data: " + filteredData);
    }
}