package com.hotel.hotel.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class TascaDTO {
    private Long id;
    private String descripcio;
    private LocalDate data_creacio;
    private LocalDate data_execucio;
    private List<Empleat> empleats;

    @Enumerated(EnumType.STRING)
    private TipusEstatTasca tipusEstat;

    public TascaDTO() {
    }

    public TascaDTO(Long id, String descripcio, LocalDate data_creacio, LocalDate data_execucio, List<Empleat> empleats,
            TipusEstatTasca tipusEstat) {
        this.id = id;
        this.descripcio = descripcio;
        this.data_creacio = data_creacio;
        this.data_execucio = data_execucio;
        this.empleats = empleats;
        this.tipusEstat = tipusEstat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public LocalDate getData_creacio() {
        return data_creacio;
    }

    public void setData_creacio(LocalDate data_creacio) {
        this.data_creacio = data_creacio;
    }

    public LocalDate getData_execucio() {
        return data_execucio;
    }

    public void setData_execucio(LocalDate data_execucio) {
        this.data_execucio = data_execucio;
    }

    public List<Empleat> getEmpleats() {
        return empleats;
    }

    public void setEmpleats(List<Empleat> empleats) {
        this.empleats = empleats;
    }

    public TipusEstatTasca getTipusEstat() {
        return tipusEstat;
    }

    public void setTipusEstat(TipusEstatTasca tipusEstat) {
        this.tipusEstat = tipusEstat;
    }

    



    
}
