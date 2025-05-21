package com.david.backend.entities;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Arbitro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    // @Column(name = "idArbitro")
    private Integer idArbitro;
    // @Column(name = "FechaNac")
    private Date FechaNac;
    // @Column(name = "Nombre")
    private String Nombre;
    // @Column(name = "Federacion")
    private String Federacion;
    // @Column(name = "Foto")
    private String Foto;

    //relacion con partido
    // @OneToMany(mappedBy = "arbitro", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    // @JsonIgnore
    // private List<Partido> partidos;

    // Constructor vacio
    public Arbitro(){}

    // Constructor con partidos
    // public Arbitro(Integer idArbitro, Date FechaNac, String Nombre, String Federacion,
    // String Foto, List<Partido> partidos) {
    //     this.idArbitro = idArbitro;
    //     this.FechaNac = FechaNac;
    //     this.Nombre = Nombre;
    //     this.Federacion = Federacion;
    //     this.Foto = Foto;
    //     this.partidos = partidos;
    // }
    // Constructor sin partidos
    public Arbitro(Integer idArbitro, Date FechaNac, String Nombre, String Federacion,
    String Foto) {
        this.idArbitro = idArbitro;
        this.FechaNac = FechaNac;
        this.Nombre = Nombre;
        this.Federacion = Federacion;
        this.Foto = Foto;
    }
   

    //getter y setter
    public Integer getIdArbitro() {
        return idArbitro;
    }
    
    public void setIdArbitro(Integer idArbitro) {
        this.idArbitro = idArbitro;
    }
    
    public Date getFechaNac() {
        return FechaNac;
    }
    
    public void setFechaNac(Date FechaNac) {
        this.FechaNac = FechaNac;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getFederacion() {
        return Federacion;
    }
    
    public void setFederacion(String Federacion) {
        this.Federacion = Federacion;
    }
    
    public String getFoto() {
        return Foto;
    }
    
    public void setFoto(String Foto) {
        this.Foto = Foto;
    }
    
    // public List<Partido> getPartidos() {
    //     return partidos;
    // }
    
    // public void setPartidos(List<Partido> partidos) {
    //     this.partidos = partidos;
    // }

    // public void addPartido(Partido partido) {
    //     this.partidos.add(partido);
    // }

    // public void removePartido(Partido partido) {
    //     this.partidos.remove(partido);
    // }
}
