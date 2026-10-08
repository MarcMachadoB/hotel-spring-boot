package com.hotel.hotel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hotel.hotel.model.Empleat;
import com.hotel.hotel.repository.EmpleatRepository;
import com.hotel.hotel.repository.TascaRepository;

@Controller
public class EmpleatController {

    private final EmpleatRepository empleatRepository;
    private final TascaRepository tascaRepository;

    public EmpleatController(EmpleatRepository empleatRepository, TascaRepository tascaRepository) {
        this.empleatRepository = empleatRepository;
        this.tascaRepository = tascaRepository;
    }

    @GetMapping("/empleats")
    public String showEmpleats(Model model) {
        List<Empleat> empleats = empleatRepository.findAll();
        model.addAttribute("empleats", empleats);
        return "empleat/llistat"; 
    }

    @GetMapping("/eliminar-empleat/{id}")
    public String eliminarEmpleat(@PathVariable Long id) {
        empleatRepository.deleteById(id); 
        return "redirect:/empleats"; 
    }

    
}
