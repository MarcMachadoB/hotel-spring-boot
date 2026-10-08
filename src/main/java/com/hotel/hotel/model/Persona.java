package com.hotel.hotel.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nom;
    private String cognom;
    private String adresa;
    private String DNI;
    private LocalDate datanaix;
    private Long telefon;
    private String email;

    @OneToOne
    @JoinColumn(name="user_id", unique = true, nullable = true)
    Usuari usuari;

    public Persona() {
    }

    public Persona(Long id, String nom, String cognom, String adresa, String DNI, LocalDate datanaix, Long telefon,
            String email) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.adresa = adresa;
        this.DNI = DNI;
        this.datanaix = datanaix;
        this.telefon = telefon;
        this.email = email;
    }

    

    public Persona(Long id, String nom, String cognom, String adresa, String DNI, LocalDate datanaix, Long telefon,
            String email, Usuari usuari) {
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
        this.adresa = adresa;
        this.DNI = DNI;
        this.datanaix = datanaix;
        this.telefon = telefon;
        this.email = email;
        this.usuari = usuari;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Usuari getUsuari() {
        return usuari;
    }

    public void setUsuari(Usuari usuari) {
        this.usuari = usuari;
    } 
    
}
