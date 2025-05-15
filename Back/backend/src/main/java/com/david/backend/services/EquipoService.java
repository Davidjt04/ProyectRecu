package com.david.backend.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.david.backend.entities.Equipo;
import com.david.backend.interfaces.Crud;
import com.david.backend.repos.RepoEquipo;

@Service
public class EquipoService implements Crud<Equipo, Integer>{
    private final RepoEquipo repo;

    public EquipoService(RepoEquipo repo) {
        this.repo = repo;
    }

    @Override
    public void save(Equipo equipo) {
        this.repo.save(equipo);
    }

    @Override
    public Optional<Equipo> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public boolean existsById(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public List<Equipo> findAll() {
        return repo.findAll();
    }

    @Override
    public void deleteById(Integer id) {
    if (existsById(id)) {
            repo.deleteById(id);
        }    
    }

    @Override
    public void deleteAll() {
        repo.deleteAll();
    }

}
