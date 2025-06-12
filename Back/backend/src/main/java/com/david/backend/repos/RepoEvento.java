package com.david.backend.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.david.backend.entities.Evento;

public interface RepoEvento extends JpaRepository<Evento, Integer>{
    //cuantos eventos de un tipo tiene un jugador en concreto
    @Query("SELECT COUNT(e) FROM Evento e WHERE e.jugador.id = :jugadorId AND e.tipoEvento.id = :tipoEventoId")
    Long contarEventosPorJugadorYTipo(@Param("jugadorId") Integer jugadorId, @Param("tipoEventoId") Integer tipoEventoId);

    //que eventos tiene el partido "x"
    @Query("SELECT e FROM Evento e WHERE e.partido.id = :partidoId")
    List<Evento> obtenerEventosPorPartido(@Param("partidoId") Integer partidoId);

    
    List<Evento> findByPartidoId(Long partidoId);

    //Obtener todos los eventos de un jugador en un partido
    @Query("SELECT e FROM Evento e WHERE e.jugador.id = :jugadorId AND e.partido.id = :partidoId")
    List<Evento> findEventosPorJugadorEnPartido(@Param("jugadorId") Integer jugadorId, @Param("partidoId") Integer partidoId);

    //2. Contar eventos de cierto tipo por partido
    @Query("SELECT COUNT(e) FROM Evento e WHERE e.partido.id = :partidoId AND e.tipoEvento.id = :tipoEventoId")
    Long contarEventosPorTipoEnPartido(@Param("partidoId") Integer partidoId, @Param("tipoEventoId") Integer tipoEventoId);

    @Query("SELECT e.jugador.nombreCompl, COUNT(e) " +
       "FROM Evento e " +
       "WHERE e.tipoEvento.id = :tipoEventoId " +
       "GROUP BY e.jugador.id, e.jugador.nombreCompl " +
       "ORDER BY COUNT(e) DESC")
    List<Object[]> topJugadoresConMasEventos(@Param("tipoEventoId") Integer tipoEventoId);
}  
