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
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idEquipo")
    private Integer id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "AnioFundacion")
    private Date anioFundacion;
    @Column(name = "Ciudad")
    private String ciudad;
    @Column(name = "Escudo")
    private String escudo;
    @Column(name = "FotoOficial")
    private String fotoOficial;


    //relaciones 
    //con partido
    @OneToMany(mappedBy = "equipoLocal", cascade = CascadeType.ALL)
    private List<Partido> partidosLocal;

    @OneToMany(mappedBy = "equipoVisitante", cascade = CascadeType.ALL)
    private List<Partido> partidosVisitante;

    //con jugador
    @OneToMany(mappedBy = "equipo", cascade = CascadeType.ALL)
    private List<Jugador> jugadores;

    //constructor vacio
    public Equipo(){}
    //constructor con relaciones
    public Equipo(Integer id, String nombre, Date anioFundacion, String ciudad, String escudo,
            String fotoOficial, List<Partido> partidosLocal, List<Partido> partidosVisitante,
            List<Jugador> jugadores) {
        this.id = id;
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
        this.ciudad = ciudad;
        this.escudo = escudo;
        this.fotoOficial = fotoOficial;
        this.partidosLocal = partidosLocal;
        this.partidosVisitante = partidosVisitante;
        this.jugadores = jugadores;
    }
    //constructor sin relaciones
    public Equipo(Integer id, String nombre, Date anioFundacion, String ciudad, String escudo,
            String fotoOficial) {
        this.id = id;
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
        this.ciudad = ciudad;
        this.escudo = escudo;
        this.fotoOficial = fotoOficial;
    }

    //getter y setter
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
    
    public Date getAnioFundacion() {
        return anioFundacion;
    }
    
    public void setAnioFundacion(Date anioFundacion) {
        this.anioFundacion = anioFundacion;
    }
    
    public String getCiudad() {
        return ciudad;
    }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String getEscudo() {
        return escudo;
    }
    
    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }
    
    public String getFotoOficial() {
        return fotoOficial;
    }
    
    public void setFotoOficial(String fotoOficial) {
        this.fotoOficial = fotoOficial;
    }
    
    public List<Partido> getPartidosLocal() {
        return partidosLocal;
    }
    
    public void setPartidosLocal(List<Partido> partidosLocal) {
        this.partidosLocal = partidosLocal;
    }
    
    public List<Partido> getPartidosVisitante() {
        return partidosVisitante;
    }
    
    public void setPartidosVisitante(List<Partido> partidosVisitante) {
        this.partidosVisitante = partidosVisitante;
    }
    
    public List<Jugador> getJugadores() {
        return jugadores;
    }
    
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }


}
