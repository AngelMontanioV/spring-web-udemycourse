package com.angel.curso.sprigboot.spring_web.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("message", "Hola estoy pasando valores a la vista");
        model.addAttribute("name", "Angel");
        model.addAttribute("lastname", "Montaño");
        return "details";
    }
}
