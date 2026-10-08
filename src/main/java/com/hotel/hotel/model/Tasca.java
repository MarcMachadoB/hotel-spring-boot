package com.hotel.hotel.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;


@Entity
@Table(name="tasca")
public class Tasca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Empleat> empleats;

    private String descripcio;
    private LocalDate data_creacio;
    private LocalDate data_execucio;

    @Enumerated(EnumType.STRING)
    private TipusEstatTasca tipusEstat;

    public Tasca() {
    }

    

    public Tasca(Long id, List<Empleat> empleats, String descripcio, LocalDate data_creacio, LocalDate data_execucio,
            TipusEstatTasca tipusEstat) {
        this.id = id;
        this.empleats = empleats;
        this.descripcio = descripcio;
        this.data_creacio = data_creacio;
        this.data_execucio = data_execucio;
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

    public TipusEstatTasca getTipusEstat() {
        return tipusEstat;
    }

    public void setTipusEstat(TipusEstatTasca tipusEstat) {
        this.tipusEstat = tipusEstat;
    }



    public List<Empleat> getEmpleats() {
        return empleats;
    }

    public void setEmpleats(List<Empleat> empleats) {
        this.empleats = empleats;
    }

}
