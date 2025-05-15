package com.david.backend.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.backend.entities.Jugador;

public interface RepoJugador extends JpaRepository<Jugador, Integer>{

}
