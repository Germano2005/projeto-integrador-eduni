package br.edu.ifsc.fln.projetointegradoreduni.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/home")
public class HomePageController {

    @GetMapping
    public ModelAndView homePage(){
        return new ModelAndView("home");
    }
}
