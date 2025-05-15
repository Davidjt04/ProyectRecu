package com.david.backend.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.backend.entities.Equipo;

public interface RepoEquipo extends JpaRepository<Equipo, Integer>{

}
