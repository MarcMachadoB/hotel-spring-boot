package com.hotel.hotel.model;

import java.time.LocalDate;

public class ValoracioDTO {
    private Long id;

    private int nota;

    private String comentari;

    private boolean llegit;

    private LocalDate DataCreacio;

    private Usuari usuari; 

    
    public ValoracioDTO(Long id, int nota, String comentari, boolean llegit, LocalDate dataCreacio, Usuari usuari) {
        this.id = id;
        this.nota = nota;
        this.comentari = comentari;
        this.llegit = llegit;
        DataCreacio = dataCreacio;
        this.usuari = usuari;
    }

    public ValoracioDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentari() {
        return comentari;
    }

    public void setComentari(String comentari) {
        this.comentari = comentari;
    }

    public boolean isLlegit() {
        return llegit;
    }

    public void setLlegit(boolean llegit) {
        this.llegit = llegit;
    }

    public LocalDate getDataCreacio() {
        return DataCreacio;
    }

    public void setDataCreacio(LocalDate dataCreacio) {
        DataCreacio = LocalDate.now();
    }

    public Usuari getUsuari() {
        return usuari;
    }

    public void setUsuari(Usuari usuari) {
        this.usuari = usuari;
    }

    

    
}
