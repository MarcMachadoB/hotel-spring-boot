package com.hotel.hotel.model;

import java.time.LocalDate;

public class FacturaDTO {
    private Long id;
    private Long reservaId;
    private LocalDate data_emissio;
    private String metode_pagament;
    private double base_imposable;
    private double IVA;
    private double total;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getReservaId() {
        return reservaId;
    }

    public void setReservaId(Long reservaId) {
        this.reservaId = reservaId;
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

    public void setIVA(double IVA) {
        this.IVA = IVA;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}