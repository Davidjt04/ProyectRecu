package com.david.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.david.backend.entities.Tipo_Evento;
import com.david.backend.interfaces.Crud;
import com.david.backend.repos.RepoTipo_Evento;

@Service
public class Tipo_EventoService  implements Crud<Tipo_Evento, Integer>{
    private final RepoTipo_Evento repo;

    public Tipo_EventoService(RepoTipo_Evento repo) {
        this.repo = repo;
    }

    @Override
    public void save(Tipo_Evento tipo_evento) {
        this.repo.save(tipo_evento);
    }

    @Override
    public Optional<Tipo_Evento> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public boolean existsById(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public List<Tipo_Evento> findAll() {
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
