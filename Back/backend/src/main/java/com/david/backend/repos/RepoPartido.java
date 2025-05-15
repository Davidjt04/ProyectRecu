package com.david.backend.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.backend.entities.Partido;

public interface RepoPartido extends JpaRepository<Partido, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario

}
