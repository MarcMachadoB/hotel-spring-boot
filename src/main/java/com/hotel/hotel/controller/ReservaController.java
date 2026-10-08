package com.hotel.hotel.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hotel.hotel.model.EstatHabitacio;
import com.hotel.hotel.model.Factura;
import com.hotel.hotel.model.Habitacio;
import com.hotel.hotel.model.Reserva;
import com.hotel.hotel.model.Client;
import com.hotel.hotel.model.Usuari;
import com.hotel.hotel.repository.ReservaRepository;
import com.hotel.hotel.repository.HabitacioRepository;
import com.hotel.hotel.repository.FacturaRepository;
import com.hotel.hotel.repository.UsuariRepository;
import com.hotel.hotel.repository.ClientRepository;

@Controller
public class ReservaController {

    private final ReservaRepository reservaRepository;
    private final HabitacioRepository habitacioRepository;
    private final FacturaRepository facturaRepository;
    private final UsuariRepository usuariRepository;
    private final ClientRepository clientRepository;

    public ReservaController(ReservaRepository reservaRepository, HabitacioRepository habitacioRepository, 
                             FacturaRepository facturaRepository, UsuariRepository usuariRepository,
                             ClientRepository clientRepository) {
        this.reservaRepository = reservaRepository;
        this.habitacioRepository = habitacioRepository;
        this.facturaRepository = facturaRepository;
        this.usuariRepository = usuariRepository;
        this.clientRepository = clientRepository;
    }

    @GetMapping("/reserva")
    public String showReserves(Model model) {
        //Obtenir email de l'usuari loguejat
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String emailUsuari = authentication.getName();  

        //Obtenir usuari loguejat des del repositori
        Usuari usuariLogejat = usuariRepository.findByEmail(emailUsuari).orElse(null);
    
        if (usuariLogejat == null) {
            model.addAttribute("error", "Usuari no trobat.");
            return "error";  
        }
        
        boolean isAdminOrEmpleat = "ROLE_ADMIN".equals(usuariLogejat.getRol()) || "ROLE_EMPLEAT".equals(usuariLogejat.getRol());

        List<Reserva> reserves;

        if (isAdminOrEmpleat) {
            reserves = reservaRepository.findAll();
        } else {

            Client client = clientRepository.findByUsuari(usuariLogejat);
    
            if (client == null) {
                model.addAttribute("error", "Client no trobat.");
                return "error";  
            }

            reserves = reservaRepository.findByClient(client);
        }

        model.addAttribute("reserves", reserves);
        return "reserva/llistat"; 
    }

    @GetMapping("/reserva/{id}")
    public String infohotel(@PathVariable Long id, Model model) {
        Optional<Reserva> opt = this.reservaRepository.findById(id);    
        if (opt.isPresent()) {
            Reserva reserva = opt.get();
            model.addAttribute("reserva", reserva);
            return "reserva/info";
        }
        return "error";
    }

    @GetMapping("/anular/{id}")
    public String anularReserva(@PathVariable Long id) {
        Reserva reserva = reservaRepository.findById(id).orElse(null);
        if (reserva != null) {
            Factura factura = reserva.getFactura();
            if (factura != null) {
                facturaRepository.delete(factura); 
            }

            Habitacio habitacio = reserva.getHabitacio();
            habitacio.setEstat(EstatHabitacio.DISPONIBLE);
            habitacioRepository.save(habitacio);

            reservaRepository.delete(reserva);
        }
        return "redirect:/reserva";
    }

    @GetMapping("/confirmar/{id}")
    public String confirmarReserva(@PathVariable Long id) {
    Reserva reserva = reservaRepository.findById(id).orElse(null);
    
    if (reserva != null) {
        Habitacio habitacio = reserva.getHabitacio();
        
        habitacio.setEstat(EstatHabitacio.OCUPADA);
        habitacioRepository.save(habitacio);
    }

    return "redirect:/reserva";
}

    
}