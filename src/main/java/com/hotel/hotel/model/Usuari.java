package com.hotel.hotel.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="usuari")
public class Usuari {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String password;
    private String rol;
    private Boolean actiu;

    public Usuari(){

    }

    public Usuari(Long id, String email, String password, String rol, Boolean actiu) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.rol = rol;
        this.actiu = true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Boolean isActiu() {
        return actiu;
    }

    public void setActiu(Boolean actiu) {
        this.actiu = actiu;
    }

    

}
