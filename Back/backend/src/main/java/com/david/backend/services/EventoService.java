package com.david.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.david.backend.entities.Evento;
import com.david.backend.repos.RepoEvento;
import com.david.backend.interfaces.Crud;

@Service
public class EventoService implements Crud<Evento, Integer> {
    private final RepoEvento repo;

    public EventoService(RepoEvento repo) {
        this.repo = repo;
    }

    // CRUD
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

    // Personalizados

    public List<Evento> getEventosPorPartido(Long idPartido) {
        return repo.findByPartidoId(idPartido);
    }

    public Long contarEventosPorJugadorYTipo(Integer jugadorId, Integer tipoEventoId) {
        return repo.contarEventosPorJugadorYTipo(jugadorId, tipoEventoId);
    }

    public List<Evento> obtenerEventosPorPartido(Integer partidoId) {
        return repo.obtenerEventosPorPartido(partidoId);
    }

    public List<Evento> findEventosPorJugadorEnPartido(Integer jugadorId, Integer partidoId) {
        return repo.findEventosPorJugadorEnPartido(jugadorId, partidoId);
    }

    public Long contarEventosPorTipoEnPartido(Integer partidoId, Integer tipoEventoId) {
        return repo.contarEventosPorTipoEnPartido(partidoId, tipoEventoId);
    }

    public List<Object[]> getTopJugadoresConMasEventos(Integer tipoEventoId) {
    return repo.topJugadoresConMasEventos(tipoEventoId);
}
}
