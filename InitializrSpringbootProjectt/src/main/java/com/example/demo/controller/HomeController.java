/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author UAH
 */
@Controller
public class HomeController {
    
    @GetMapping("/")
    public String goHome(Model model) {
        model.addAttribute("titulo", "página de inicio");
        return "inicio";
    }
    
    @GetMapping("/iniciosesion")
    public String goiniciosesion(Model model) {
        return "iniciosesion";
    }
    
    @GetMapping("/menuresponsable")
    public String gomenuresponsable(Model model) {
        return "menuresponsable";
    }
    
    
}
