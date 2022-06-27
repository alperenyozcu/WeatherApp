package com.weatherapi.alperen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePagecontroller {


    @GetMapping({"/homepage"})
    public String homepage() {
        return "homepage";
    }

    @GetMapping("/weatherpage")
    public String weatherpage()
    {
        return "weatherpage";
    }


}
