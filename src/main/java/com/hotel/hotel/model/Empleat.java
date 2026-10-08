package com.hotel.hotel.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="empleats")
public class Empleat extends Persona{

    @ManyToMany(mappedBy = "empleats", cascade = CascadeType.ALL)
    private List<Tasca> tasques;
    
    private String llocfeina;
    private LocalDate contractacio;
    private double salari;

    @Enumerated(EnumType.STRING)
    private TipusEstat tipusE;

    public Empleat() {
    }

    public Empleat(String llocfeina, LocalDate contractacio, double salari, TipusEstat tipusE) {
        this.llocfeina = llocfeina;
        this.contractacio = contractacio;
        this.salari = salari;
        this.tipusE = tipusE;
    }

    public Empleat(Long id, String nom, String cognom, String adresa, String DNI, LocalDate datanaix, Long telefon,
            String email, String llocfeina, LocalDate contractacio, double salari, TipusEstat tipusE) {
        super(id, nom, cognom, adresa, DNI, datanaix, telefon, email);
        this.llocfeina = llocfeina;
        this.contractacio = contractacio;
        this.salari = salari;
        this.tipusE = tipusE;
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

    public List<Tasca> getTasques() {
        return tasques;
    }

    public void setTasques(List<Tasca> tasques) {
        this.tasques = tasques;
    }

}
