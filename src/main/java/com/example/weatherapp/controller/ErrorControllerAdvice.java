package com.example.weatherapp.controller;

import com.example.weatherapp.exception.CityNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorControllerAdvice {

    @ExceptionHandler(CityNotFoundException.class)
    public String handleException() {
        return "notfound";
    }
}
