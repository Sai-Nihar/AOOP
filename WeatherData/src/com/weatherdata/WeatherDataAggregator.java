package com.weatherdata;
import java.util.List;
import java.util.stream.Collectors;

public class WeatherDataAggregator {
    public static double calculateAverageTemperature(List<WeatherData> weatherData) {
        return weatherData.stream()
                .mapToDouble(WeatherData::getTemperature)
                .average()
                .orElse(0.0);
    }

    public static double findMaximumTemperature(List<WeatherData> weatherData) {
        return weatherData.stream()
                .mapToDouble(WeatherData::getTemperature)
                .max()
                .orElse(0.0);
    }

    public static double findMinimumPressure(List<WeatherData> weatherData) {
        return weatherData.stream()
                .mapToDouble(WeatherData::getPressure)
                .min()
                .orElse(0.0);
    }

    public static List<WeatherData> filterDataByTemperature(List<WeatherData> weatherData, double threshold) {
        return weatherData.stream()
                .filter(data -> data.getTemperature() > threshold)
                .collect(Collectors.toList());
    }
}