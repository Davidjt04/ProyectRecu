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

import com.david.backend.entities.Tipo_Evento;
import com.david.backend.services.Tipo_EventoService;

@RestController
@RequestMapping("/tipo_evento/lista")
public class Tipo_eventoRestController {
    private final Tipo_EventoService service;
    public Tipo_eventoRestController(Tipo_EventoService service) {
        this.service = service;
    }

    //se muestran todos los productos
    @GetMapping("/tipo_evento/lista")
    public List<Tipo_Evento> lista(){
        //va a sacar una lista de productos 
        return this.service.findAll();
    }

     //borrar
    //en este metodo el verbo debería de ser delete no get
    @GetMapping("/tipo_evento/borrar/{id}")
    public ResponseEntity<Tipo_Evento> borrar(@PathVariable Integer id){
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
   @GetMapping("/tipo_evento/editar/{id}")
    public ResponseEntity<Tipo_Evento> editar(@PathVariable Integer id) {
    Optional<Tipo_Evento> tipoEventooOpt = service.findById(id);
        if (tipoEventooOpt.isPresent()) {
            Tipo_Evento tipoEvento = tipoEventooOpt.get();
            return ResponseEntity.ok(tipoEvento);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //crear
    @PostMapping("/tipo_evento/crear")
    public ResponseEntity<Tipo_Evento> crear(){
        //va a crear un producto
        return ResponseEntity.ok(new Tipo_Evento());
    }

     //guardar
    @PostMapping("/tipo_evento/guardar")
    public ResponseEntity<Tipo_Evento> guardar(@ModelAttribute Tipo_Evento tipo_evento){
        //va a guardar un producto
        if(tipo_evento.getId() == null){
        //    return service.save(arbitro);
            service.save(tipo_evento);
            return ResponseEntity.ok(tipo_evento);
        }else{
            Optional<Tipo_Evento> ProductoSinActu = service.findById(tipo_evento.getId());
            //cogemos el objeto del optional 
            Tipo_Evento tipoEventoActu = ProductoSinActu.get();
            tipoEventoActu.setNombre(tipo_evento.getNombre());
            service.save(tipoEventoActu);
            return ResponseEntity.ok(tipoEventoActu);  
        }
            
    }


}
