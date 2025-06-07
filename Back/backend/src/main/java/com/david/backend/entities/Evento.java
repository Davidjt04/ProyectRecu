package com.david.backend.entities;

import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Evento {
  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)     
    @Column(name = "idEvento")
    private Integer id;
    @Column(name = "TiempoPartido")
    private String tiempoPartido;

    //relaciones
    //con partido
    @ManyToOne
    @JoinColumn(name = "Partido_idPartido")
    private Partido partido;

    //con jugador
    @ManyToOne
    @JoinColumn(name = "Jugador_idJugador", nullable = true)
    private Jugador jugador;

    //con tipo_evento
    @ManyToOne
    @JoinColumn(name = "Tipo_Evento_idTipo_Evento")
    private Tipo_Evento tipoEvento;

    //constructor vacio
    public Evento(){} 
    //constructor con relaciones    
    public Evento(Integer id, String tiempoPartido, Partido partido, Jugador jugador,
            Tipo_Evento tipoEvento) {
        this.id = id;
        this.tiempoPartido = tiempoPartido;
        this.partido = partido;
        this.jugador = jugador;
        this.tipoEvento = tipoEvento;
    }
    //constructor sin relaciones
    public Evento(Integer id, String tiempoPartido) {
        this.id = id;
        this.tiempoPartido = tiempoPartido;
    }

    //getter y setter
    public Integer getId() {
      return id;
  }
  
  public void setId(Integer id) {
      this.id = id;
  }
  
  public String getTiempoPartido() {
      return tiempoPartido;
  }
  
  public void setTiempoPartido(String tiempoPartido) {
      this.tiempoPartido = tiempoPartido;
  }
  
  public Partido getPartido() {
      return partido;
  }
  
  public void setPartido(Partido partido) {
      this.partido = partido;
  }
  
  public Jugador getJugador() {
      return jugador;
  }
  
  public void setJugador(Jugador jugador) {
      this.jugador = jugador;
  }
  
  public Tipo_Evento getTipoEvento() {
      return tipoEvento;
  }
  
  public void setTipoEvento(Tipo_Evento tipoEvento) {
      this.tipoEvento = tipoEvento;
  }
}
