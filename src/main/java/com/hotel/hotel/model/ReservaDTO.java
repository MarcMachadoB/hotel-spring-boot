package com.hotel.hotel.model;

import java.time.LocalDate;

public class ReservaDTO {
    Client client; 
    Habitacio habitacio; 
    LocalDate data_reserva;
    LocalDate data_inici;
            
    LocalDate data_fi; 
    TipusReserva tipusReserva; 
    double tipusIVA;
    double preu_total_reserva;
    private String metodePagament;

    public ReservaDTO() {
    }
    public ReservaDTO(Client client, Habitacio habitacio, LocalDate data_reserva, LocalDate data_inici,
            LocalDate data_fi, TipusReserva tipusReserva, double tipusIVA, double preu_total_reserva, String metodePagament) {

        this.client = client;
        this.habitacio = habitacio;
        this.data_reserva = data_reserva;
        this.data_inici = data_inici;
        this.data_fi = data_fi;
        this.tipusReserva = tipusReserva;
        this.tipusIVA = 0.21;
        this.preu_total_reserva = preu_total_reserva;
        this.metodePagament = metodePagament;
    }

    

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public Habitacio getHabitacio() {
        return habitacio;
    }
    public void setHabitacio(Habitacio habitacio) {
        this.habitacio = habitacio;
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
        this.data_inici = data_inici;
    }
    public LocalDate getData_fi() {
        return data_fi;
    }
    public void setData_fi(LocalDate data_fi) {
        this.data_fi = data_fi;
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
        this.tipusIVA = tipusIVA;
    }
    public double getPreu_total_reserva() {
        return preu_total_reserva;
    }
    public void setPreu_total_reserva(double preu_total_reserva) {
        this.preu_total_reserva = preu_total_reserva;
    }
    public String getMetodePagament() {
        return metodePagament;
    }
    public void setMetodePagament(String metodePagament) {
        this.metodePagament = metodePagament;
    }

    
    
    
}
