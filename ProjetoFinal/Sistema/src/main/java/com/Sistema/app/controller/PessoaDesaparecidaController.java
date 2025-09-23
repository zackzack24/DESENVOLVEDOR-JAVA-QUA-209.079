package com.Sistema.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PessoaDesaparecidaController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }

    @RequestMapping("/lista")
    public String lista() {
        return "lista";
    }

    @RequestMapping("/buscar")
    public String buscar() {
        return "buscar";
    }

}
