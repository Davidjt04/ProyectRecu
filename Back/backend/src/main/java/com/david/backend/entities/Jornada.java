package com.david.backend.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

     @OneToMany(mappedBy = "jornada", cascade = CascadeType.ALL)
    private List<Partido> partidos;

    //TODO meter los atributos 
    public Jornada() {
    }
    //constructor con relaciones
    public Jornada(Integer id, Integer numero, Date fechaReferencia, List<Partido> partidos) {
        this.id = id;
        this.numero = numero;
        this.fechaReferencia = fechaReferencia;
        this.partidos = partidos;
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

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }
}

