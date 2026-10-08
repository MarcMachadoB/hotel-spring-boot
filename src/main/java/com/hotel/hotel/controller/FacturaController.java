package com.hotel.hotel.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hotel.hotel.model.Factura;
import com.hotel.hotel.repository.FacturaRepository;

@Controller
public class FacturaController {

    private final FacturaRepository facturaRepository;

    public FacturaController(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    @GetMapping("/factures")
    public String showFactures(Model model) {
        List<Factura> factures = facturaRepository.findAll();
        model.addAttribute("factures", factures);
        return "factura/llistat"; 
    }

    @GetMapping("/factures/{id}")
    public String showFacturesClient(@PathVariable Long id, Model model) {
        Optional<Factura> opt = this.facturaRepository.findById(id);
        if (opt.isPresent()){
            Factura factura = opt.get();
            model.addAttribute("factura", factura);
            return "factura/info"; 
            
        }
        return "error";
    }


}