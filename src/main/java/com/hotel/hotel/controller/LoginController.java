package com.hotel.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/admin/dashboard")
    public String login(){
    return "admin/dashboard";
    }
    

    @GetMapping("/client/home")
    public String loginclient(){
    return "client/home";
    }

    @GetMapping("/empleat/home")
    public String loginempleat(){
    return "empleat/home";
    }

}
