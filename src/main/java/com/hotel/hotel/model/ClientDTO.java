package com.hotel.hotel.model;


import java.time.LocalDate;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class ClientDTO {
    private String nom;
    private String cognom;
    private String adresa;
    private String DNI;
    private LocalDate datanaix;
    private Long telefon;
    private String email;
    private LocalDate dataAlta;

    @Enumerated(EnumType.STRING)
    private TipusClient tipusC;

    private Long targeta;

    private String password;

    public ClientDTO() {
    }

    // Getters i Setters

    public ClientDTO(String nom, String cognom, String adresa, String DNI, LocalDate datanaix, Long telefon,
            String email, LocalDate dataAlta, TipusClient tipusC, Long targeta, String password) {
        this.nom = nom;
        this.cognom = cognom;
        this.adresa = adresa;
        this.DNI = DNI;
        this.datanaix = datanaix;
        this.telefon = telefon;
        this.email = email;
        this.dataAlta = dataAlta;
        this.tipusC = tipusC;
        this.targeta = targeta;
        this.password = password;
    }




    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getDatanaix() {
        return datanaix;
    }

    public void setDatanaix(LocalDate datanaix) {
        this.datanaix = datanaix;
    }

    public Long getTelefon() {
        return telefon;
    }

    public void setTelefon(Long telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(LocalDate dataAlta) {
        this.dataAlta = LocalDate.now();
    }

    public TipusClient getTipusC() {
        return tipusC;
    }

    public void setTipusC(TipusClient tipusC) {
        this.tipusC = tipusC;
    }

    public Long getTargeta() {
        return targeta;
    }

    public void setTargeta(Long targeta) {
        this.targeta = targeta;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }




    public String getPassword() {
        return password;
    }




    public void setPassword(String password) {
        this.password = password;
    }

    

    
    
   

    
}