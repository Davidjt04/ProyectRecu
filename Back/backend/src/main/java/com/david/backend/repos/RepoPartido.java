package com.david.backend.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.david.backend.entities.Arbitro;
import com.david.backend.entities.Equipo;
import com.david.backend.entities.Jornada;
import com.david.backend.entities.Partido;

public interface RepoPartido extends JpaRepository<Partido, Integer> {
    // cual es el equipo local y visitante de un partido
    @Query("SELECT p.equipoLocal FROM Partido p WHERE p.id = :partidoId")
    Equipo obtenerEquipoLocalPorPartido(@Param("partidoId") Integer partidoId);

    @Query("SELECT p.equipoVisitante FROM Partido p WHERE p.id = :partidoId")
    Equipo obtenerEquipoVisitantePorPartido(@Param("partidoId") Integer partidoId);

    //en que jornada se ha jugado el partido "x"
    @Query("SELECT p.jornada FROM Partido p WHERE p.id = :partidoId")
    Jornada obtenerJornadaPorPartido(@Param("partidoId") Integer partidoId);

    //que arbitro a pitado en el partido "X" 
    @Query("SELECT p.arbitro FROM Partido p WHERE p.id = :partidoId")
    Arbitro obtenerArbitroPorPartido(@Param("partidoId") Integer partidoId);

    //cuantos partidos se han jugado en total ?
    @Query("SELECT COUNT(p) FROM Partido p")
    Long contarTotalPartidos();

}
