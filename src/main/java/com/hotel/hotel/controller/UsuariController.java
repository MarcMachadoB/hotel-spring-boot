package com.hotel.hotel.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.hotel.hotel.repository.UsuariRepository;

import org.springframework.ui.Model;

@Controller
public class UsuariController {

    private final UsuariRepository usuariRepository;

    public UsuariController(UsuariRepository  usuariRepository){
        this.usuariRepository = usuariRepository;
    }

    @GetMapping("/login")
    public String showUsuaris(Model model) { 
        return "login";
    }
}