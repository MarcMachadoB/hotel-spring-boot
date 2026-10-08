package com.hotel.hotel.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;


public class EmpleatDTO {
    private Long id;
    private List<Tasca> tasques;
    private String nom;
    private String cognom;
    private String adresa;
    private String DNI;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate datanaix;
    private Long telefon;
    private String email;
    private String llocfeina;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate contractacio;
    private double salari;

    @Enumerated(EnumType.STRING)
    private TipusEstat tipusE;

    private String rol;

    public EmpleatDTO() {
    }

    

    public EmpleatDTO(Long id, List<Tasca> tasques, String nom, String cognom, String adresa, String dNI, LocalDate datanaix,
            Long telefon, String email, String llocfeina, LocalDate contractacio, double salari, TipusEstat tipusE,
            String rol) {
        this.id = id;
        this.tasques = tasques;
        this.nom = nom;
        this.cognom = cognom;
        this.adresa = adresa;
        DNI = dNI;
        this.datanaix = datanaix;
        this.telefon = telefon;
        this.email = email;
        this.llocfeina = llocfeina;
        this.contractacio = contractacio;
        this.salari = salari;
        this.tipusE = tipusE;
        this.rol = rol;
    }


    


    public List<Tasca> getTasques() {
        return tasques;
    }

    public void setTasques(List<Tasca> tasques) {
        this.tasques = tasques;
    }

    public String getLlocfeina() {
        return llocfeina;
    }

    public void setLlocfeina(String llocfeina) {
        this.llocfeina = llocfeina;
    }

    public LocalDate getContractacio() {
        return contractacio;
    }

    public void setContractacio(LocalDate contractacio) {
        this.contractacio = contractacio;
    }

    public double getSalari() {
        return salari;
    }

    public void setSalari(double salari) {
        this.salari = salari;
    }

    public TipusEstat getTipusE() {
        return tipusE;
    }

    public void setTipusE(TipusEstat tipusE) {
        this.tipusE = tipusE;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
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

    public void setDNI(String dNI) {
        DNI = dNI;
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



    public String getRol() {
        return rol;
    }



    public void setRol(String rol) {
        this.rol = rol;
    }



    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    @Override
    public String toString() {
        return "EmpleatDTO [id=" + id + ", tasques=" + tasques + ", nom=" + nom + ", cognom=" + cognom + ", adresa="
                + adresa + ", DNI=" + DNI + ", datanaix=" + datanaix + ", telefon=" + telefon + ", email=" + email
                + ", llocfeina=" + llocfeina + ", contractacio=" + contractacio + ", salari=" + salari + ", tipusE="
                + tipusE + ", rol=" + rol + "]";
    }


    


    

}
