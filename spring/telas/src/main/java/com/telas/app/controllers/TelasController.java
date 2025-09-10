package com.telas.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TelasController {
    @RequestMapping("home")
    public String home() {
        return "home";
    }
    @RequestMapping("cadastrar")
    public String cadastrar() {
        return "cadastrar";
    }
}
