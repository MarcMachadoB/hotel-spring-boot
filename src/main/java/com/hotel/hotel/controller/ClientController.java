package com.hotel.hotel.controller;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hotel.hotel.model.Client;
import com.hotel.hotel.repository.ClientRepository;

@Controller
public class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @GetMapping("/clients")
    public String showClients(Model model) {
        List<Client> clients = clientRepository.findAll();
        System.out.println(clients.size());
        model.addAttribute("clients", clients);
        return "empleat/client/llistat"; 
    }
    //Desar a la base de dades
    @GetMapping("/desar-client")
    public String desar(Model model){

        Client c = new Client();
        clientRepository.save(c);
        return "redirect:/client/llistat";
    }
}