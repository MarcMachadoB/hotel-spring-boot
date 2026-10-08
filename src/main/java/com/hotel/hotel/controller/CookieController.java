package com.hotel.hotel.controller;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CookieController {
    @GetMapping("/crear-cookie")
    public String setCookie(HttpServletResponse response){
        //Crear i afegir la cookie
        Cookie cookie = new Cookie("username", "prova");
        cookie.setMaxAge(60*60*24);
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        response.addCookie(cookie);
        
        return "principal"; //torna al inici

    }


    @GetMapping("/recuperar-cookie")
    public String home(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        System.out.println(cookies[0].getValue());

        return "principal";
    }

}
