package com.hotel.hotel.controller;

import com.hotel.hotel.model.Empleat;
import com.hotel.hotel.model.EmpleatDTO;
import com.hotel.hotel.repository.EmpleatRepository;
import com.hotel.hotel.repository.TascaRepository;
import com.hotel.hotel.repository.UsuariRepository;
import com.hotel.hotel.model.Usuari;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormulariEmpleatController {
    private final EmpleatRepository empleatRepository;
    private final TascaRepository tascaRepository;
    private final UsuariRepository usuariRepository;

    public FormulariEmpleatController(EmpleatRepository empleatRepository, TascaRepository tascaRepository, UsuariRepository usuariRepository) {
        this.empleatRepository = empleatRepository;
        this.tascaRepository = tascaRepository;
        this.usuariRepository = usuariRepository;
    }

    @GetMapping("/alta-empleat")
    public String mostrarFormulari(Model model) {
        model.addAttribute("empleat", new EmpleatDTO());
        model.addAttribute("tasques", tascaRepository.findAll());
        return "admin/registre";
    }

    @PostMapping("/processar-empleat")
    public String processar(@ModelAttribute EmpleatDTO usuari, Model model) {
        Usuari u = new Usuari();
        u.setEmail(usuari.getEmail());
        u.setPassword("12345");  // Contrasenya predeterminada
        u.setActiu(true);
        u.setRol(usuari.getRol());

        usuariRepository.save(u);

        Empleat e = new Empleat();
        e.setTasques(usuari.getTasques());
        e.setNom(usuari.getNom());
        e.setCognom(usuari.getCognom());
        e.setEmail(usuari.getEmail());
        e.setAdresa(usuari.getAdresa());
        e.setTelefon(usuari.getTelefon());
        e.setDNI(usuari.getDNI());
        e.setDatanaix(usuari.getDatanaix());
        e.setLlocfeina(usuari.getLlocfeina());
        e.setContractacio(usuari.getContractacio());
        e.setSalari(usuari.getSalari());
        e.setTipusE(usuari.getTipusE());
        e.setUsuari(u);

        empleatRepository.save(e);
        return "redirect:/alta-empleat";
    }

    @GetMapping("/modificar-empleat/{id}")
    public String mostrarFormulariModificar(@PathVariable Long id, Model model) {
        Empleat empleat = empleatRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Empleat no trobat per ID: " + id));

        EmpleatDTO empleatDTO = new EmpleatDTO();
        empleatDTO.setId(id);
        empleatDTO.setNom(empleat.getNom());
        empleatDTO.setCognom(empleat.getCognom());
        empleatDTO.setEmail(empleat.getEmail());
        empleatDTO.setAdresa(empleat.getAdresa());
        empleatDTO.setTelefon(empleat.getTelefon());
        empleatDTO.setDNI(empleat.getDNI());
        empleatDTO.setDatanaix(empleat.getDatanaix());
        empleatDTO.setLlocfeina(empleat.getLlocfeina());
        empleatDTO.setContractacio(empleat.getContractacio());
        empleatDTO.setSalari(empleat.getSalari());
        empleatDTO.setTipusE(empleat.getTipusE());
        empleatDTO.setTasques(empleat.getTasques());

        model.addAttribute("empleat", empleatDTO);
        model.addAttribute("tasques", tascaRepository.findAll());

        return "admin/modificaempleat"; 
    }

    @PostMapping("/modificar-empleat")
    public String modificarEmpleat(@ModelAttribute EmpleatDTO empleatDTO) {

        System.out.println(empleatDTO);
        Empleat empleat = empleatRepository.findById(empleatDTO.getId())
                .orElseThrow(() -> new IllegalArgumentException("Empleat no trobat per ID: " + empleatDTO.getId()));

        empleat.setNom(empleatDTO.getNom());
        empleat.setCognom(empleatDTO.getCognom());
        empleat.setEmail(empleatDTO.getEmail());
        empleat.setAdresa(empleatDTO.getAdresa());
        empleat.setTelefon(empleatDTO.getTelefon());
        empleat.setDNI(empleatDTO.getDNI());
        empleat.setDatanaix(empleatDTO.getDatanaix());
        empleat.setLlocfeina(empleatDTO.getLlocfeina());
        empleat.setContractacio(empleatDTO.getContractacio());
        empleat.setSalari(empleatDTO.getSalari());
        empleat.setTipusE(empleatDTO.getTipusE());
        empleat.setTasques(empleatDTO.getTasques());

        empleatRepository.save(empleat);

        return "redirect:/empleats";  
    }
}