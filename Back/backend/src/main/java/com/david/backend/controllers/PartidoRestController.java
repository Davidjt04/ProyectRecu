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

import com.david.backend.entities.Partido;
import com.david.backend.services.PartidoService;

@RestController
@RequestMapping("/partido/lista")
public class PartidoRestController {
    private final PartidoService service;
    public PartidoRestController(PartidoService service) {
        this.service = service;
    }

    //se muestran todos los productos
    @GetMapping("/partido/lista")
    public List<Partido> lista(){
        //va a sacar una lista de productos 
        return this.service.findAll();
    }

    //borrar
    //en este metodo el verbo debería de ser delete no get
    @GetMapping("/partido/borrar/{id}")
    public ResponseEntity<Partido> borrar(@PathVariable Integer id){
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
   @GetMapping("/partido/editar/{id}")
    public ResponseEntity<Partido> editar(@PathVariable Integer id) {
    Optional<Partido> partidoOpt = service.findById(id);
        if (partidoOpt.isPresent()) {
            Partido partido = partidoOpt.get();
            return ResponseEntity.ok(partido);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //crear
    @PostMapping("/partido/crear")
    public ResponseEntity<Partido> crear(){
        //va a crear un producto
        return ResponseEntity.ok(new Partido());
    }

    //guardar
    @PostMapping("/partido/guardar")
    public ResponseEntity<Partido> guardar(@ModelAttribute Partido partido){
        //va a guardar un producto
        if(partido.getId() == null){
        //    return service.save(arbitro);
            service.save(partido);
            return ResponseEntity.ok(partido);
        }else{
            Optional<Partido> partidoSinActu = service.findById(partido.getId());
            //cogemos el objeto del optional 
            Partido partidoActu = partidoSinActu.get();
            partidoActu.setFechaPrevista(partido.getFechaPrevista());
            partidoActu.setFechaInicio(partido.getFechaInicio());
            partidoActu.setEstadio(partido.getEstadio());
            partidoActu.setEquipoVisitante(partido.getEquipoVisitante());
            partidoActu.setJornada(partido.getJornada());
            partidoActu.setEquipoLocal(partido.getEquipoLocal());
            partidoActu.setArbitro(partido.getArbitro());

            service.save(partidoActu);
            return ResponseEntity.ok(partidoActu);  
        }
            
    }

}
