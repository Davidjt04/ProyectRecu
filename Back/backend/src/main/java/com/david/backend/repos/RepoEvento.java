package com.david.backend.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.backend.entities.Evento;

public interface RepoEvento extends JpaRepository<Evento, Integer>{

}
