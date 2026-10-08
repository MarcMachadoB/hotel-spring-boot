package com.hotel.hotel.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.hotel.hotel.model.Valoracio;
import com.hotel.hotel.model.ValoracioDTO;
import com.hotel.hotel.repository.ValoracioRepository;

@Controller
public class ValoracioController {
    private final ValoracioRepository valoracioRepository;

    public ValoracioController (ValoracioRepository valoracioRepository){
        this.valoracioRepository = valoracioRepository;
    }

    @GetMapping("/valoracio")
    public String showValoracions(Model model) {
        List<Valoracio> valoracio = valoracioRepository.findAll();
        model.addAttribute("valoracio", valoracio);
        return "reserva/valoracio"; 
    }

    @GetMapping("/valoracio-admin")
    public String showValoracionsAdmin(Model model) {
        List<Valoracio> valoracio = valoracioRepository.findAll();
        model.addAttribute("valoracio", valoracio);
        return "reserva/infovaloracio"; 
    }

    @GetMapping("/llegit/{id}")
    public String LlegirRessenya(@PathVariable Long id) {
    Valoracio valoracio = valoracioRepository.findById(id).orElse(null);
    
    if (valoracio != null) {
        
        valoracio.setLlegit(true);
        valoracioRepository.save(valoracio);
    }

    return "redirect:/valoracio-admin";
    }

    @PostMapping("/processar-valoracio")
    public String processarValoracions(@ModelAttribute ValoracioDTO valoracioDTO, Model model) {

        Valoracio val = new Valoracio();
        val.setNota(valoracioDTO.getNota());
        val.setComentari(valoracioDTO.getComentari());
        val.setDataCreacio(LocalDate.now());
        val.setUsuari(valoracioDTO.getUsuari());
        val.setLlegit(false);
        
        valoracioRepository.save(val);
        return "redirect:/valoracio"; 
    }



    
}
