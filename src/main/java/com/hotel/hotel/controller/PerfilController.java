package com.hotel.hotel.controller;

import java.util.Optional;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.mvc.support.RedirectAttributes; //per a mostrar missatges d'exit o d'error
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel.hotel.model.Client;
import com.hotel.hotel.model.Empleat;
import com.hotel.hotel.model.Usuari;
import com.hotel.hotel.repository.UsuariRepository;
import com.hotel.hotel.repository.ClientRepository;
import com.hotel.hotel.repository.EmpleatRepository;

@Controller
public class PerfilController {

    private UsuariRepository usuariRepository;
    private ClientRepository clientRepository;
    private EmpleatRepository empleatRepository;

    public PerfilController(UsuariRepository usuariRepository, ClientRepository clientRepository, EmpleatRepository empleatRepository){
        this.usuariRepository = usuariRepository;
        this.clientRepository = clientRepository;
        this.empleatRepository = empleatRepository;
    }

    @GetMapping("/perfil")
    public String perfil(Model model) {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String username = authentication.getName();

    System.out.println("Usuari: " + username);

    Optional<Usuari> usuari = usuariRepository.findByEmail(username);
    
    if (usuari.isPresent()) {
        model.addAttribute("usuari", usuari.get());

        // Busca si l'usuari és client o empleat
        Optional<Client> client = clientRepository.findByEmail(username);
        if (client.isPresent()) {
            model.addAttribute("nom", client.get().getNom());
            model.addAttribute("cognom", client.get().getCognom());
            model.addAttribute("telefon", client.get().getTelefon());
        } else {
            Optional<Empleat> empleat = empleatRepository.findByEmail(username);
            if (empleat.isPresent()) {
                model.addAttribute("nom", empleat.get().getNom());
                model.addAttribute("cognom", empleat.get().getCognom());
                model.addAttribute("telefon", empleat.get().getTelefon());
            }
        }
    } else {
        model.addAttribute("error", "Usuari no trobat");
    }

    return "perfil/principal"; // Retorna la vista desitjada
}

    @PostMapping("/canviarContrasenya")
    public String cambiarContrasenya(
    @RequestParam String novaContrasenya,
    @RequestParam String confirmarContrasenya,
    RedirectAttributes redirectAttributes) {

    if (!novaContrasenya.equals(confirmarContrasenya)) {
        redirectAttributes.addFlashAttribute("error", "Les contrasenyes no coincideixen");
        return "redirect:/perfil";
    }

    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String username = authentication.getName();
    Optional<Usuari> usuariOptional = usuariRepository.findByEmail(username);

    if (usuariOptional.isPresent()) {
        Usuari usuari = usuariOptional.get();
        usuari.setPassword(novaContrasenya); 
        usuariRepository.save(usuari);
        redirectAttributes.addFlashAttribute("success", "Contrasenya canviada correctament.");
    } else {
        redirectAttributes.addFlashAttribute("error", "Usuari no trobat.");
    }

    return "redirect:/perfil";
}

@PostMapping("/canviarNom")
public String canviarNom(
    @RequestParam String nouNom,
    RedirectAttributes redirectAttributes) {

    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String username = authentication.getName();

    Optional<Client> clients = clientRepository.findByEmail(username); 

    if (clients.isPresent()) {
        Client client = clients.get();
        client.setNom(nouNom);  
        clientRepository.save(client); 
        redirectAttributes.addFlashAttribute("success", "Nom canviat correctament.");
        return "redirect:/perfil";
    }

    Optional<Empleat> empleats = empleatRepository.findByEmail(username); 

    if (empleats.isPresent()) {
        Empleat empleat = empleats.get();
        empleat.setNom(nouNom);  
        empleatRepository.save(empleat); 
        redirectAttributes.addFlashAttribute("success", "Nom canviat correctament.");
        return "redirect:/perfil";
    }
    redirectAttributes.addFlashAttribute("error", "Usuari no trobat.");
    return "redirect:/perfil";
}

@PostMapping("/canviarCognom")
public String canviarCognom(
    @RequestParam String nouCognom,
    RedirectAttributes redirectAttributes) {

    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String username = authentication.getName();

    Optional<Client> clients = clientRepository.findByEmail(username); 

    if (clients.isPresent()) {
        Client client = clients.get();
        client.setCognom(nouCognom);  
        clientRepository.save(client); 
        redirectAttributes.addFlashAttribute("success", "Nom canviat correctament.");
        return "redirect:/perfil";
    }

    Optional<Empleat> empleats = empleatRepository.findByEmail(username); 

    if (empleats.isPresent()) {
        Empleat empleat = empleats.get();
        empleat.setCognom(nouCognom);  
        empleatRepository.save(empleat); 
        redirectAttributes.addFlashAttribute("success", "Nom canviat correctament.");
        return "redirect:/perfil";
    }
    redirectAttributes.addFlashAttribute("error", "Usuari no trobat.");
    return "redirect:/perfil";
}


@PostMapping("/canviarTelefon")
public String canviarTelefon(
    @RequestParam Long nouTelefon,
    RedirectAttributes redirectAttributes) {

    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String username = authentication.getName();

    Optional<Client> clients = clientRepository.findByEmail(username); 

    if (clients.isPresent()) {
        Client client = clients.get();
        client.setTelefon(nouTelefon);  
        clientRepository.save(client); 
        redirectAttributes.addFlashAttribute("success", "Telèfon canviat correctament.");
        return "redirect:/perfil";
    }

    Optional<Empleat> empleats = empleatRepository.findByEmail(username); 

    if (empleats.isPresent()) {
        Empleat empleat = empleats.get();
        empleat.setTelefon(nouTelefon);  
        empleatRepository.save(empleat); 
        redirectAttributes.addFlashAttribute("success", "Telèfon canviat correctament.");
        return "redirect:/perfil";
    }
    redirectAttributes.addFlashAttribute("error", "Usuari no trobat.");
    return "redirect:/perfil";
}




}