package com.hotel.hotel.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.security.core.Authentication;

import com.hotel.hotel.model.Client;
import com.hotel.hotel.model.EstatHabitacio;
import com.hotel.hotel.model.Factura;
import com.hotel.hotel.model.Habitacio;
import com.hotel.hotel.model.Reserva;
import com.hotel.hotel.model.ReservaDTO;
import com.hotel.hotel.model.Usuari;
import com.hotel.hotel.repository.ReservaRepository;
import com.hotel.hotel.repository.UsuariRepository;
import com.hotel.hotel.repository.ClientRepository;
import com.hotel.hotel.repository.FacturaRepository;
import com.hotel.hotel.repository.HabitacioRepository;


import org.springframework.ui.Model;


@Controller
public class FormulariReservaController {
    private final ReservaRepository reservaRepository;
    private final ClientRepository clientRepository;
    private final HabitacioRepository habitacioRepository;
    private final FacturaRepository facturaRepository;
    private final UsuariRepository usuariRepository;

    public FormulariReservaController(ReservaRepository reservaRepository, ClientRepository clientRepository,
                                      HabitacioRepository habitacioRepository, FacturaRepository facturaRepository, UsuariRepository usuariRepository) {
        this.reservaRepository = reservaRepository;
        this.clientRepository = clientRepository;
        this.habitacioRepository = habitacioRepository;
        this.facturaRepository = facturaRepository;
        this.usuariRepository = usuariRepository;
    }

    public boolean isHabitacioDisponible(Habitacio habitacio, LocalDate dataInici, LocalDate dataFi) {
        List<Reserva> reservesExistents = reservaRepository.findByHabitacio(habitacio);
        
        for (Reserva reserva : reservesExistents) {
            if ((dataInici.isBefore(reserva.getData_fi()) && dataFi.isAfter(reserva.getData_inici()))) {
                return false;  
            }
        }
        return true; 
    }

    @GetMapping("/alta-reserva")
    public String mostrarFormulari(Model model) {
    List<Client> clients = clientRepository.findAll();
    model.addAttribute("clients", clients);

    List<Habitacio> resultats = habitacioRepository.findByEstatNot(EstatHabitacio.OCUPADA);
    model.addAttribute("resultats", resultats);

    model.addAttribute("reserva", new ReservaDTO());

    

    return "client/registrereserva";
    }
    
 
    @PostMapping("/processar-reserva")
    public String processar(@ModelAttribute ReservaDTO reservaDTO, Model model) {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String emailUsuari = authentication.getName();  

    Usuari usuariLogejat = usuariRepository.findByEmail(emailUsuari).orElse(null);
    
    if (usuariLogejat == null) {
        model.addAttribute("error", "User not found.");
        return "client/registrereserva";  
    }
    
    Client client = clientRepository.findByUsuari(usuariLogejat); 
    
    if (client == null) {
        model.addAttribute("error", "Client not found.");
        return "client/registrereserva";  
    }

    Habitacio habitacio = reservaDTO.getHabitacio();
    LocalDate dataInici = reservaDTO.getData_inici();
    LocalDate dataFi = reservaDTO.getData_fi();
    
    if (!isHabitacioDisponible(habitacio, dataInici, dataFi)) {
        model.addAttribute("error", "L'habitació no està disponible en aquesta data.");
        return "redirect:/alta-reserva?error=error";
    }

    Reserva reserva = new Reserva();
    reserva.setClient(client); 
    reserva.setData_reserva(reservaDTO.getData_reserva());
    reserva.setData_inici(dataInici);
    reserva.setData_fi(dataFi);
    reserva.setHabitacio(habitacio);
    reserva.setTipusIVA(reservaDTO.getTipusIVA());
    reserva.setTipusReserva(reservaDTO.getTipusReserva());
    reserva.setPreu_total_reserva(reservaDTO.getPreu_total_reserva());
    reservaRepository.save(reserva);

    habitacio.setEstat(EstatHabitacio.EN_NETEJA);
    habitacioRepository.save(habitacio);

    Factura factura = new Factura();
    factura.setReserva(reserva);
    factura.setData_emissio(LocalDate.now());
    factura.setMetode_pagament(reservaDTO.getMetodePagament());
    factura.setBase_imposable(reservaDTO.getPreu_total_reserva());
    factura.setIVA(reserva.getTipusIVA());
    factura.setTotal(reservaDTO.getPreu_total_reserva());
    facturaRepository.save(factura);

    return "redirect:/alta-reserva";
    }
}