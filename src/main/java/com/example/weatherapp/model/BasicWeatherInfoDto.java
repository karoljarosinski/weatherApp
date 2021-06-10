package com.example.weatherapp.model;

import lombok.Data;

@Data
public class BasicWeatherInfoDto {
    private double temp;
    private double pressure;
    private double humidity;
}
