package com.weatherapi.alperen.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;

@Controller
public class MainController {

    @GetMapping("/")
    public RedirectView redirect(Model model) {
            return new RedirectView("homepage");
    }
}

