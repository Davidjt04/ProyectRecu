package com.david.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.david.backend.entities.Partido;
import com.david.backend.interfaces.Crud;
import com.david.backend.repos.RepoPartido;

@Service
public class PartidoService implements Crud<Partido, Integer>{
    private final RepoPartido repo;

    public PartidoService(RepoPartido repo) {
        this.repo = repo;
    }
    @Override
    public void save(Partido partido) {
        this.repo.save(partido);
    }

    @Override
    public Optional<Partido> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public boolean existsById(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public List<Partido> findAll() {
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
