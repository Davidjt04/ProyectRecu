package com.david.backend.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.david.backend.entities.Equipo;
import com.david.backend.entities.Jugador;

public interface RepoJugador extends JpaRepository<Jugador, Integer>{
    // Si buscas por nombre completo
    @Query("SELECT j.equipo FROM Jugador j WHERE j.nombreCompl = :nombre")
    Equipo encontrarEquipoPorNombreJugador(@Param("nombre") String nombre);

    // O si tienes el ID del jugador
    @Query("SELECT j.equipo FROM Jugador j WHERE j.id = :id")
    Equipo encontrarEquipoPorIdJugador(@Param("id") Integer id);

    
}
