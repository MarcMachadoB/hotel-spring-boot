package com.hotel.hotel.controller;

import com.hotel.hotel.repository.HabitacioRepository;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller

public class HabitacioController {



 private final HabitacioRepository habitacioRepository;



 public HabitacioController(HabitacioRepository habitacioRepository){

 this.habitacioRepository = habitacioRepository;

 }

 @GetMapping("/resum")

    public String obtenirHabitacionsPerHotel(Model model) {

    List<Object[]> resultats = habitacioRepository.countHabitacionsPerHotel();

    System.out.println(resultats.size());

    model.addAttribute("resultats", resultats);

    return "habitacions/resum"; 

    }

}