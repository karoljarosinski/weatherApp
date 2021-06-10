package com.example.weatherapp.controller;

import com.example.weatherapp.model.WeatherInfoDto;
import com.example.weatherapp.service.WeatherInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    private final WeatherInfoService weatherInfoService;

    public HomeController(WeatherInfoService weatherInfoService) {
        this.weatherInfoService = weatherInfoService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @PostMapping("/city")
    public String weatherForCity(@RequestParam(value = "city_name") String city, RedirectAttributes redirectAttributes) {
        WeatherInfoDto weatherInfo = weatherInfoService.getWeatherInfo(city);
        redirectAttributes.addFlashAttribute("weather", weatherInfo);
        return "redirect:/weather";
    }

    @GetMapping("/weather")
    public String weatherForCity(@ModelAttribute(name = "weather") WeatherInfoDto weatherInfoDto, Model model) {
        model.addAttribute("weather", weatherInfoDto);
        return "weather";
    }
}
