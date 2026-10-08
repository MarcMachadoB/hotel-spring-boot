package com.hotel.hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;


@Entity
@Table(name = "habitacions", uniqueConstraints = {@UniqueConstraint(columnNames = {"numero", "hotel_id"})})
public class Habitacio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private int numero;

    private int capacitat;
    private String descripcio;

    private double preuNitAD;
    private double preuNitMP;

    @Enumerated(EnumType.STRING)
    private TipusHabitacio tipus;

    @Enumerated(EnumType.STRING)
    private EstatHabitacio estat;

    @ManyToOne
    @JoinColumn(name="hotel_id", nullable = false)
    private Hotel hotel;


    public Habitacio() {
    }

    public Habitacio(Long id, int numero, int capacitat, String descripcio, double preuNitAD, double preuNitMP,
            TipusHabitacio tipus, EstatHabitacio estat, Hotel hotel) {
        this.id = id;
        this.numero = numero;
        this.capacitat = capacitat;
        this.descripcio = descripcio;
        this.preuNitAD = preuNitAD;
        this.preuNitMP = preuNitMP;
        this.tipus = tipus;
        this.estat = estat;
        this.hotel = hotel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacitat() {
        return capacitat;
    }

    public void setCapacitat(int capacitat) {
        this.capacitat = capacitat;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public double getPreuNitAD() {
        return preuNitAD;
    }

    public void setPreuNitAD(double preuNitAD) {
        this.preuNitAD = preuNitAD;
    }

    public double getPreuNitMP() {
        return preuNitMP;
    }

    public void setPreuNitMP(double preuNitMP) {
        this.preuNitMP = preuNitMP;
    }

    public TipusHabitacio getTipus() {
        return tipus;
    }

    public void setTipus(TipusHabitacio tipus) {
        this.tipus = tipus;
    }

    public EstatHabitacio getEstat() {
        return estat;
    }

    public void setEstat(EstatHabitacio estat) {
        this.estat = estat;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }


    


}