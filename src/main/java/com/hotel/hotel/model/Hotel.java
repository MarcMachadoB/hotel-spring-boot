package com.hotel.hotel.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotels")


public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String adresa;
    private String ciutat;

    @ManyToOne
    @JoinColumn(name="categoria_id", nullable = false)
    private Categoria categoria;

    @OneToMany(mappedBy = "hotel")
    private List<Habitacio> habitacions;


    public Hotel() {
        this.habitacions = new ArrayList<>();
    }

    public Hotel(Long id, String nom, String adresa, String ciutat, Categoria categoria) {
        this.id = id;
        this.nom = nom;
        this.adresa = adresa;
        this.ciutat = ciutat;
        this.categoria = categoria;
        this.habitacions = new ArrayList<>();
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


    public String getAdresa() {
        return adresa;
    }


    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }


    public String getCiutat() {
        return ciutat;
    }


    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }


    public Categoria getCategoria() {
        return categoria;
    }


    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Habitacio> getHabitacions() {
        return habitacions;
    }

    public void setHabitacions(List<Habitacio> habitacions) {
        this.habitacions = habitacions;
    }

}
