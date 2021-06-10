package com.example.weatherapp.service;

import com.example.weatherapp.exception.CityNotFoundException;
import com.example.weatherapp.model.WeatherInfoDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherInfoService {

    public WeatherInfoDto getWeatherInfo(String city) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            String URL = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=eb271fe4c083078e8f7e467c1d533207";
            return restTemplate.getForObject(URL, WeatherInfoDto.class);
        } catch (Exception e) {
            throw new CityNotFoundException();
        }
    }
}
