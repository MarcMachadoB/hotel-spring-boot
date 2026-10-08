package com.hotel.hotel.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name="clients")
public class Client extends Persona {
    private LocalDate dataAlta = LocalDate.now();

    @Enumerated(EnumType.STRING)
    private TipusClient tipusC;

    
    private Long targeta;

    public Client(){

    }

    public Client(LocalDate dataAlta, TipusClient tipusC, Long targeta) {
        this.dataAlta = dataAlta;
        this.tipusC = tipusC;
        this.targeta = targeta;
    }

    public Client(Long id, String nom, String cognom, String adresa, String DNI, LocalDate datanaix, Long telefon,
            String email, LocalDate dataAlta, TipusClient tipusC, Long targeta) {
        super(id, nom, cognom, adresa, DNI, datanaix, telefon, email);
        this.dataAlta = dataAlta;
        this.tipusC = tipusC;
        this.targeta = targeta;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(LocalDate dataAlta) {
        this.dataAlta = dataAlta;
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

    



}
