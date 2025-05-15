package com.david.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.david.backend.entities.Arbitro;
import com.david.backend.interfaces.Crud;
import com.david.backend.repos.RepoArbitro;

@Service
public class ArbitroService implements Crud<Arbitro, Integer> {
    private final RepoArbitro repo;

    public ArbitroService(RepoArbitro repo) {
        this.repo = repo;
    }

    @Override
    public void save(Arbitro arbitro) {
        this.repo.save(arbitro);
    }

    @Override
    public Optional<Arbitro> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public boolean existsById(Integer id){
        return repo.existsById(id);
    }

    @Override
    public List<Arbitro> findAll() {
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
