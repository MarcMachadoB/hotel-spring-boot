package com.hotel.hotel.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hotel.hotel.model.Client;
import com.hotel.hotel.model.ClientDTO;
import com.hotel.hotel.model.Usuari;
import com.hotel.hotel.repository.ClientRepository;
import com.hotel.hotel.repository.UsuariRepository;

import org.springframework.ui.Model;


@Controller
public class FormulariController {
    private final ClientRepository clientRepository;
    private final UsuariRepository usuariRepository;

    public FormulariController(ClientRepository clientRepository, UsuariRepository usuariRepository) {
        this.clientRepository = clientRepository;
        this.usuariRepository = usuariRepository;
    }
    @GetMapping("/alta-client")
    public String mostrarFormulari(Model model) {
        model.addAttribute("client", new ClientDTO());
        return "registre";
    }
    
    @PostMapping("/processar")
    public String processar(@ModelAttribute ClientDTO usuari, Model model) {
        Usuari u = new Usuari();
        u.setEmail(usuari.getEmail());
        u.setPassword(usuari.getPassword());
        u.setActiu(true);
        u.setRol("ROLE_CLIENT");

        usuariRepository.save(u);



        Client c = new Client();
        c.setNom(usuari.getNom());
        c.setCognom(usuari.getCognom());
        c.setEmail(usuari.getEmail());
        c.setAdresa(usuari.getAdresa());
        c.setDNI(usuari.getDNI());
        c.setDatanaix(usuari.getDatanaix());
        c.setDataAlta(LocalDate.now());
        c.setTelefon(usuari.getTelefon());
        c.setTipusC(usuari.getTipusC());
        c.setTargeta(usuari.getTargeta());

        c.setUsuari(u);


        clientRepository.save(c);
        model.addAttribute("client", usuari);
        return "redirect:/alta-client";
    }
}