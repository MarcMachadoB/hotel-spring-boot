package com.hotel.hotel.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="client_id", nullable = false)
    private Client client;

    @ManyToOne
    @JoinColumn(name="habitacio_id", nullable = false)
    private Habitacio habitacio;

    //CascadeType fa que es borri tota la factura si la reserva s'anul·la
    @OneToOne(mappedBy="reserva", cascade = CascadeType.ALL)
    private Factura factura;

    private LocalDate data_reserva;
    private LocalDate data_inici;
    private LocalDate data_fi;

    @Enumerated(EnumType.STRING)
    private TipusReserva tipusReserva;

    private double tipusIVA;
    private double preu_total_reserva;

    public Reserva() {
    }
    
    




    public Reserva(Long id, Client client, Habitacio habitacio, Factura factura, LocalDate data_reserva,
            LocalDate data_inici, LocalDate data_fi, TipusReserva tipusReserva, double tipusIVA,
            double preu_total_reserva) {
        this.id = id;
        this.client = client;
        this.habitacio = habitacio;
        this.factura = factura;
        this.data_reserva = data_reserva;
        this.data_inici = data_inici;
        this.data_fi = data_fi;
        this.tipusReserva = tipusReserva;
        this.tipusIVA = tipusIVA;
        this.preu_total_reserva = preu_total_reserva;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getData_reserva() {
        return data_reserva;
    }

    public void setData_reserva(LocalDate data_reserva) {
        this.data_reserva = data_reserva;
    }

    public LocalDate getData_inici() {
        return data_inici;
    }

    public void setData_inici(LocalDate data_inici) {
        this.data_inici = LocalDate.now();
    }

    public TipusReserva getTipusReserva() {
        return tipusReserva;
    }

    public void setTipusReserva(TipusReserva tipusReserva) {
        this.tipusReserva = tipusReserva;
    }

    public double getTipusIVA() {
        return tipusIVA;
    }

    public void setTipusIVA(double tipusIVA) {
        this.tipusIVA = 0.21;
    }

    

    public Habitacio getHabitacio() {
        return habitacio;
    }

    public void setHabitacio(Habitacio habitacio) {
        this.habitacio = habitacio;
    }

    public Long getId() {
        return id;
    }



    public void setId(Long id) {
        this.id = id;
    }



    public LocalDate getData_fi() {
        return data_fi;
    }

    public void setData_fi(LocalDate data_fi) {
        this.data_fi = data_fi;
    }


    public double getPreu_total_reserva() {
        return preu_total_reserva;
    }



    public void setPreu_total_reserva(double preu_total_reserva) {
        this.preu_total_reserva = preu_total_reserva;
    }

    public Factura getFactura() {
        return factura;
    }






    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    

}
