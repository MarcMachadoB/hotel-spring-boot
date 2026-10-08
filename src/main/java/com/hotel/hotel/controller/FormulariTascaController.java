package com.hotel.hotel.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hotel.hotel.model.Empleat;
import com.hotel.hotel.model.Tasca;
import com.hotel.hotel.model.TascaDTO;
import com.hotel.hotel.repository.EmpleatRepository;
import com.hotel.hotel.repository.TascaRepository;

@Controller
public class FormulariTascaController {
    private final TascaRepository tascaRepository;
    private final EmpleatRepository empleatRepository;

    public FormulariTascaController(TascaRepository tascaRepository, EmpleatRepository empleatRepository) {
        this.tascaRepository = tascaRepository;
        this.empleatRepository = empleatRepository;
    }
    @GetMapping("/alta-tasca")
    public String mostrarFormulari(Model model) {
        model.addAttribute("tasques", tascaRepository.findAll());
        model.addAttribute("tasca", new TascaDTO());
        model.addAttribute("dataCreacio", LocalDate.now()); 
        List<Empleat> empleats = empleatRepository.findAll();
        model.addAttribute("empleats", empleats);
        return "empleat/tasca/registretasca";
    }
    
    @PostMapping("/processar-tasca")
    public String processar(@ModelAttribute TascaDTO tascaDTO, Model model) {
        //inicialitza la tasca
    Tasca t;
        //Comprovacio de si existeix o no tasca
    if (tascaDTO.getId() != null && tascaRepository.existsById(tascaDTO.getId())) {
        t = tascaRepository.findById(tascaDTO.getId()).orElseThrow(); //si tasca existeix, la rescata de la base de dades
        t.setEmpleats(tascaDTO.getEmpleats());
    } else {
        //Si no existeix tasca, es crea una nova
        t = new Tasca();
        t.setDescripcio(tascaDTO.getDescripcio());
        t.setData_creacio(LocalDate.now());
        t.setData_execucio(tascaDTO.getData_execucio());
        t.setEmpleats(tascaDTO.getEmpleats());
        t.setTipusEstat(tascaDTO.getTipusEstat());
    }

    tascaRepository.save(t);
    return "redirect:/alta-tasca";
}
}