package com.david.backend.entities;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Jornada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idJornada")
    private Integer id;
    @Column(name = "Numero")
    private Integer numero;
    @Column(name = "FechaReferencia")
    private Date fechaReferencia;


    //TODO meter los atributos 
    public Jornada() {
    }
    
    //constructor sin relaciones
    public Jornada(Integer id, Integer numero, Date fechaReferencia) {
        this.id = id;
        this.numero = numero;
        this.fechaReferencia = fechaReferencia;
    }

    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public Integer getNumero() {
        return numero;
    }
    
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public Date getFechaReferencia() {
        return fechaReferencia;
    }
    
    public void setFechaReferencia(Date fechaReferencia) {
        this.fechaReferencia = fechaReferencia;
    }

    // public void setPartidos(List<Partido> partidosDeJornada) {
    //     throw new UnsupportedOperationException("Not supported yet.");
    // }

}

