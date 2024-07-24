package com.angel.curso.sprigboot.spring_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("message", "Hola estoy pasando valores a la vista");
        model.addAttribute("name", "Angel");
        model.addAttribute("lastname", "Montaño");
        return "details";
    }
}
