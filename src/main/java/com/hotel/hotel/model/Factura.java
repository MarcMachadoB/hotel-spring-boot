package com.hotel.hotel.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="factures")
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name="reserva_id", nullable = false)
    private Reserva reserva;

    private LocalDate data_emissio;
    private String metode_pagament;
    private double base_imposable;
    private double IVA;
    private double total;

    public Factura() {
    }

    

    public Factura(Long id, Reserva reserva, LocalDate data_emissio, String metode_pagament, double base_imposable,
            double iVA, double total) {
        this.id = id;
        this.reserva = reserva;
        this.data_emissio = data_emissio;
        this.metode_pagament = metode_pagament;
        this.base_imposable = base_imposable;
        IVA = iVA;
        this.total = total;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData_emissio() {
        return data_emissio;
    }

    public void setData_emissio(LocalDate data_emissio) {
        this.data_emissio = data_emissio;
    }

    public String getMetode_pagament() {
        return metode_pagament;
    }

    public void setMetode_pagament(String metode_pagament) {
        this.metode_pagament = metode_pagament;
    }

    public double getBase_imposable() {
        return base_imposable;
    }

    public void setBase_imposable(double base_imposable) {
        this.base_imposable = base_imposable;
    }

    public double getIVA() {
        return IVA;
    }

    public void setIVA(double iVA) {
        IVA = iVA;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }


}
