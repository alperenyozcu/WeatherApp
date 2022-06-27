package com.weatherapi.alperen.controller;

import com.weatherapi.alperen.dao.WeatherRepository;
import com.weatherapi.alperen.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/weather")
public class WeatherController {
    @Autowired
    private WeatherRepository weatherRepository;
//
//    @GetMapping("/Get")
//    public ModelAndView GetWeather(Model model)
//    {
//        return //sayfa adı add atribute
//    }

    @PostMapping("/save")
    public @ResponseBody Boolean saveWeather(@RequestBody Weather weather)
    {
        try {
            weatherRepository.save(weather);
            return true;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            return false;
        }

    }

    @GetMapping("/getAll")
    public @ResponseBody List<Weather> getAll()
    {
        return weatherRepository.findAll();
    }

    @GetMapping("/delete")
    public @ResponseBody Boolean deleteWeather(@RequestParam Long id)
    {
        try {
            weatherRepository.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;

        }
    }


}
