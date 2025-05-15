package com.david.backend.services;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.david.backend.entities.Jornada;
import com.david.backend.interfaces.Crud;
import com.david.backend.repos.RepoJornada;

@Service
public class JornadaService implements Crud<Jornada, Integer>{
    private final RepoJornada repo;

    public JornadaService(RepoJornada repo) {
        this.repo = repo;
    }

    @Override
    public void save(Jornada jornada) {
        this.repo.save(jornada);
    }

    @Override
    
    public Optional<Jornada> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public boolean existsById(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public List<Jornada> findAll() {
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
