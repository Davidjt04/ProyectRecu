package com.david.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.david.backend.entities.Evento;
import com.david.backend.interfaces.Crud;
import com.david.backend.repos.RepoArbitro;
import com.david.backend.repos.RepoEvento;

@Service
public class EventoService implements Crud<Evento, Integer> {
    private final RepoEvento repo;
    public EventoService(RepoEvento repo) {
        this.repo = repo;
    }

    @Override
    public void save(Evento evento) {
        this.repo.save(evento);
    }

    @Override
    public Optional<Evento> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public boolean existsById(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public List<Evento> findAll() {
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
