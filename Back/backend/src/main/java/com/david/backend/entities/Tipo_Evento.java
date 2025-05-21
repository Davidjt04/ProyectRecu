package com.david.backend.entities;

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
import jakarta.persistence.Table;

@Entity
@Table(name = "tipoevento")
public class Tipo_Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idTipoEvento")
    private Integer id;
    @Column(name = "Nombre")
    private String nombre;

    //Relaciones
    //con evento
    @OneToMany(mappedBy = "tipoEvento", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Evento> eventos;

    //constructor vacio
    public Tipo_Evento() {}
    //constructor con relaciones
    public Tipo_Evento(Integer id, String nombre, List<Evento> eventos) {
        this.id = id;
        this.nombre = nombre;
        this.eventos = eventos;
    }
    //constructor sin relaciones
    public Tipo_Evento(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    // Getters y Setters    
     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

}
