package com.david.backend.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.david.backend.entities.Equipo;
import com.david.backend.entities.Jugador;
import com.david.backend.services.JugadorService;

@RestController
@RequestMapping("/jugador/lista")
public class JugadorRestController {
    private final JugadorService service;
    public JugadorRestController(JugadorService service) {
        this.service = service;
    }

    //se muestran todos los productos
    @GetMapping("/jugador/lista")
    public List<Jugador> lista(){
        //va a sacar una lista de productos 
        return this.service.findAll();
    }
    //borrar
    //en este metodo el verbo debería de ser delete no get
    @GetMapping("/jugador/borrar/{id}")
    public ResponseEntity<Jugador> borrar(@PathVariable Integer id){
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
   @GetMapping("/jugador/editar/{id}")
    public ResponseEntity<Jugador> editar(@PathVariable Integer id) {
    Optional<Jugador> jugadorOpt = service.findById(id);
        if (jugadorOpt.isPresent()) {
            Jugador jugador = jugadorOpt.get();
            return ResponseEntity.ok(jugador);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    //crear
    @PostMapping("/jugador/crear")
    public ResponseEntity<Jugador> crear(){
        //va a crear un producto
        return ResponseEntity.ok(new Jugador());
    }

    //guardar
    @PostMapping("/jugador/guardar")
    public ResponseEntity<Jugador> guardar(@RequestBody Jugador jugador){
        //va a guardar un producto
        if(jugador.getId() == null){
        //    return service.save(arbitro);
            service.save(jugador);
            //actualizo la lista de equipo
            // Equipo equipo = jugador.getEquipo();
            // if(equipo.getJugadores() == null){
            //     equipo.setJugadores(new ArrayList<>());
            // }
            // equipo.getJugadores().add(jugador);

            return ResponseEntity.ok(jugador);
        }else{
            Optional<Jugador> jugadorSinActu = service.findById(jugador.getId());
            //cogemos el objeto del optional 
            Jugador jugadorActu = jugadorSinActu.get();
            jugadorActu.setNombreCompl(jugador.getNombreCompl());
            jugadorActu.setApodo(jugador.getApodo());
            jugadorActu.setFechaNac(jugador.getFechaNac());
            jugadorActu.setFoto(jugador.getFoto());
            jugadorActu.setDorsal(jugador.getDorsal());
            jugadorActu.setPosicion(jugador.getPosicion());
            jugadorActu.setNacionalidad(jugador.getNacionalidad());
            jugadorActu.setEquipo(jugador.getEquipo());

            //actualizo la lista de equipo
            // Equipo equipo = jugador.getEquipo();
            // if(equipo.getJugadores() == null){
            //     equipo.setJugadores(new ArrayList<>());
            //     equipo.getJugadores().add(jugadorActu);
            // }else{
            //     equipo.getJugadores().add(jugadorActu);
            // }
            
            
            service.save(jugadorActu);  
            return ResponseEntity.ok(jugadorActu);  
        }
            
    }


}
