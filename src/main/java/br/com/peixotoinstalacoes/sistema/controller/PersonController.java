package br.com.peixotoinstalacoes.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonController {

    @GetMapping("/person")
    public ModelAndView person(){
        return new ModelAndView("person");

    }

}
