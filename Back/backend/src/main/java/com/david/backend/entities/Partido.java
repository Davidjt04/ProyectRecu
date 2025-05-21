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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "idPartido")
    private Integer id;
    @Column(name = "FechaPrevista")
    private Date fechaPrevista;
    @Column(name = "FechaInicio")
    private Date fechaInicio;
    @Column(name = "Estadio")
    private String estadio;

    //Relaciones
    //con arbitro
    @ManyToOne
    @JoinColumn(name = "Arbitro_idArbitro")
    private Arbitro arbitro;

    //con equipo local y visitante
    @ManyToOne
    @JoinColumn(name = "EquipoLocal")
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name = "EquipoVisitante")
    private Equipo equipoVisitante;

    //con Jornada
    @ManyToOne
    @JoinColumn(name = "Jornada_idJornada")
    private Jornada jornada;

    //con evento
    @OneToMany(mappedBy = "partido", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Evento> eventos;

    // Constructor vacio
    public Partido() {}
    // Constructor con relaciones
    public Partido(Integer id, Date fechaPrevista, Date fechaInicio, String estadio,
            Arbitro arbitro, Equipo equipoLocal, Equipo equipoVisitante, Jornada jornada,
            List<Evento> eventos) {
        this.id = id;
        this.fechaPrevista = fechaPrevista;
        this.fechaInicio = fechaInicio;
        this.estadio = estadio;
        this.arbitro = arbitro;
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.jornada = jornada;
        this.eventos = eventos;
    }
    // Constructor sin relaciones
    public Partido(Integer id, Date fechaPrevista, Date fechaInicio, String estadio) {
        this.id = id;
        this.fechaPrevista = fechaPrevista;
        this.fechaInicio = fechaInicio;
        this.estadio = estadio;
    }
    

     // Getters y Setters
     public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaPrevista() {
        return fechaPrevista;
    }

    public void setFechaPrevista(Date fechaPrevista) {
        this.fechaPrevista = fechaPrevista;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Arbitro getArbitro() {
        return arbitro;
    }

    public void setArbitro(Arbitro arbitro) {
        this.arbitro = arbitro;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }
}
