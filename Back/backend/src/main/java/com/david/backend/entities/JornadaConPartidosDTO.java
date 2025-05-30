package com.david.backend.entities;

import java.sql.Date;
import java.util.List;

import com.david.backend.entities.Partido;

public class JornadaConPartidosDTO {
    private Integer id;
    private Integer numero;
    private Date fechaReferencia;
    private List<Partido> partidos;

    // Constructor completo
    public JornadaConPartidosDTO(Integer id, Integer numero, Date fechaReferencia, List<Partido> partidos) {
        this.id = id;
        this.numero = numero;
        this.fechaReferencia = fechaReferencia;
        this.partidos = partidos;
    }

    // Constructor desde entidad Jornada
    public JornadaConPartidosDTO(com.david.backend.entities.Jornada jornada, List<Partido> partidos) {
        this.id = jornada.getId();
        this.numero = jornada.getNumero();
        this.fechaReferencia = jornada.getFechaReferencia();
        this.partidos = partidos;
    }

    // Getters y Setters
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
