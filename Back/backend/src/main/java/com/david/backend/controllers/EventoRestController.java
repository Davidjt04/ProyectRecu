package com.david.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.backend.entities.Evento;
import com.david.backend.services.EventoService;

@RestController
@RequestMapping("/evento/lista")
public class EventoRestController {
    private final EventoService service;

    public EventoRestController(EventoService service) {
        this.service = service;
    }

    //se muestran todos los productos
    @GetMapping("/evento/lista")
    public List<Evento> lista(){
        //va a sacar una lista de productos 
        return this.service.findAll();
    }

    //borrar
    //en este metodo el verbo debería de ser delete no get
    @GetMapping("/evento/borrar/{id}")
    public ResponseEntity<Evento> borrar(@PathVariable Integer id){
        //va a borrar un producto
        if(service.existsById(id)){  
          service.deleteById(id);
          //noContent la operacion se hizo bien pero no hay contenido en el cuerpo
            return ResponseEntity.noContent().build(); 
        }
        //noFound no se ha encontrado codigo de error 404
        return ResponseEntity.notFound().build();
    }

     //editar
    @GetMapping("/evento/editar/{id}")
    public ResponseEntity<Evento> editar(@PathVariable Integer id) {
    Optional<Evento> eventoOpt = service.findById(id);
        if (eventoOpt.isPresent()) {
            Evento evento = eventoOpt.get();
            return ResponseEntity.ok(evento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //crear
    @PostMapping("/evento/crear")
    public ResponseEntity<Evento> crear(){
        //va a crear un producto
        return ResponseEntity.ok(new Evento());
    }

    //guardar
    @PostMapping("/evento/guardar")
    public ResponseEntity<Evento> guardar(@ModelAttribute Evento evento){
        //va a guardar un producto
        if(evento.getId() == null){
        //    return service.save(arbitro);
            service.save(evento);
            return ResponseEntity.ok(evento);
        }else{
            Optional<Evento> eventoSinActu = service.findById(evento.getId());
            //cogemos el objeto del optional 
            Evento eventoActu = eventoSinActu.get();
            eventoActu.setTiempoPartido(evento.getTiempoPartido());
            eventoActu.setPartido(evento.getPartido());
            eventoActu.setTipoEvento(evento.getTipoEvento());
            eventoActu.setJugador(evento.getJugador());

            service.save(eventoActu);
            return ResponseEntity.ok(eventoActu);  
        }
            
    }


}
