package com.david.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.david.backend.entities.Jugador;
import com.david.backend.interfaces.Crud;
import com.david.backend.repos.RepoJugador;

@Service
public class JugadorService implements Crud<Jugador, Integer>{
        private final RepoJugador repo;

    public JugadorService(RepoJugador repo) {
        this.repo = repo;
    }
    @Override
    public void save(Jugador jugador) {
        this.repo.save(jugador);
    }

    @Override
    public Optional<Jugador> findById(int id) {
        return repo.findById(id);
    }

    @Override
    public boolean existsById(Integer id) {
        return repo.existsById(id);
    }

    @Override
    public List<Jugador> findAll() {
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

    public List<Jugador> findAllById(Integer equipoId) {
        return repo.findByEquipoId(equipoId);
    }


    // @Override
    // public Equipo obtenerEquipoDeJugadorPorNombre(String nombre) {
    //     return repo.encontrarEquipoPorNombreJugador(nombre);
    // }

    // @Override
    // public Equipo obtenerEquipoDeJugadorPorId(Integer id) {
    //     return repo.encontrarEquipoPorIdJugador(id);
    // }

}
