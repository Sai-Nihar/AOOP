package com.weatherdata;
import java.time.LocalDate;

public class WeatherData {
    private LocalDate date;
    private double temperature;
    private double humidity;
    private double pressure;
    private double windSpeed;

    public WeatherData(LocalDate date, double temperature, double humidity, double pressure, double windSpeed) {
        this.date = date;
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "date=" + date +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                ", windSpeed=" + windSpeed +
                '}';
    }
}