package com.example.weatherapp.model;

import lombok.Data;

@Data
public class WeatherInfoDto {
    private String name;
    private BasicWeatherInfoDto main;
}
