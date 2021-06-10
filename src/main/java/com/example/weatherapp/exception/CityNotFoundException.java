package com.example.weatherapp.exception;

public class CityNotFoundException extends RuntimeException {
    public CityNotFoundException() {
        super("Nie znaleziono takiego miasta");
    }
}
