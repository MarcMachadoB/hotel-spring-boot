package com.hotel.hotel.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.hotel.hotel.repository.HotelRepository;

import jakarta.servlet.http.HttpSession;

import com.hotel.hotel.model.Hotel;

@Controller
public class HotelController {

    private final HotelRepository hotelRepository;

    public HotelController(HotelRepository hotelRepository){
        this.hotelRepository = hotelRepository;
    }

    @GetMapping("/hotel")
    public String showHotels(Model model) {
        List<Hotel> hotels = hotelRepository.findAll();
        model.addAttribute("hotels", hotels);       
        return "hotel/llistat";
    }


    @GetMapping("/hotel/{id}")
    public String infohotel(@PathVariable Long id, Model model, HttpSession session) { 

        Optional<Hotel> opt = this.hotelRepository.findById(id);    
        if (opt.isPresent()) {
            session.setAttribute("id_hotel", id);
            Hotel hotel = opt.get();
            model.addAttribute("hotel", hotel);
            return "hotel/info";
        }
        return "error";
    }

    @GetMapping("/")
    public String principal(Model model) {     
        return "home";
    }



}
