package com.david.backend.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idJugador")
    private Integer id;
    @Column(name = "Nombre")
    private String nombreCompl;
    @Column(name = "Apodo")
    private String apodo;
    @Column(name = "FechaNac")
    private Date fechaNac;
    @Column(name = "Foto")
    private String foto;
    @Column(name = "Dorsal")
    private int dorsal;
    @Column(name = "Posicion")
    private String posicion;
    @Column(name = "Nacionalidad")
    private String nacionalidad;

    //relaciones
    //con equipo
    @ManyToOne
    @JoinColumn(name = "Equipo_idEquipo")
    private Equipo equipo;

    //con evento
    @OneToMany(mappedBy = "jugador", cascade = CascadeType.ALL)
    private List<Evento> eventos;

    //constructor vacio
    public Jugador() {}
    //constructor con relaciones
    public Jugador(Integer id, String nombreCompl, String apodo, Date fechaNac, String foto,
            int dorsal, String posicion, String nacionalidad, Equipo equipo, List<Evento> eventos) {
        this.id = id;
        this.nombreCompl = nombreCompl;
        this.apodo = apodo;
        this.fechaNac = fechaNac;
        this.foto = foto;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
        this.equipo = equipo;
        this.eventos = eventos;
    }
    //constructor sin relaciones
    public Jugador(Integer id, String nombreCompl, String apodo, Date fechaNac, String foto,
            int dorsal, String posicion, String nacionalidad) {
        this.id = id;
        this.nombreCompl = nombreCompl;
        this.apodo = apodo;
        this.fechaNac = fechaNac;
        this.foto = foto;
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.nacionalidad = nacionalidad;
    }

    //getter y setter
    public Integer getId() {
        return id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNombreCompl() {
        return nombreCompl;
    }
    
    public void setNombreCompl(String nombreCompl) {
        this.nombreCompl = nombreCompl;
    }
    
    public String getApodo() {
        return apodo;
    }
    
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    
    public Date getFechaNac() {
        return fechaNac;
    }
    
    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    public String getFoto() {
        return foto;
    }
    
    public void setFoto(String foto) {
        this.foto = foto;
    }
    
    public int getDorsal() {
        return dorsal;
    }
    
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    public String getPosicion() {
        return posicion;
    }
    
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }
    
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public Equipo getEquipo() {
        return equipo;
    }
    
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    
    public List<Evento> getEventos() {
        return eventos;
    }
    
    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
}

