package com.hotel.hotel.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.hotel.hotel.model.Tasca;
import com.hotel.hotel.model.TipusEstatTasca;
import com.hotel.hotel.repository.TascaRepository;

@Controller
public class TascaController {

    private final TascaRepository tascaRepository;

    public TascaController(TascaRepository tascaRepository) {
        this.tascaRepository = tascaRepository;
    }

    @GetMapping("/tasques")
    public String showTasques(Model model) {
        List<Tasca> tasques = tascaRepository.findAll();
        model.addAttribute("tasques", tasques);
        return "empleat/tasca/llistat"; 
    }

    @PostMapping("/completar-tasca/{id}")
    public String completarTasca(@PathVariable Long id) {
    Tasca tasca = tascaRepository.findById(id).orElse(null);
    
    if (tasca != null) {
        tasca.setTipusEstat(TipusEstatTasca.COMPLETADA);
        tascaRepository.save(tasca);
    }

    return "redirect:/tasques";
}
}