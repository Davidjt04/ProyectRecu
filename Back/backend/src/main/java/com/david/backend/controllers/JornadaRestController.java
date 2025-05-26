package com.david.backend.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.david.backend.entities.Jornada;
import com.david.backend.services.JornadaService;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
// @RequestMapping("/jornada/lista")
public class JornadaRestController {

    private final JornadaService service;
    public JornadaRestController(JornadaService service) {
        this.service = service;
    }

    //se muestran todos los productos
    @GetMapping("/jornada/lista")
    public List<Jornada> lista(){
        //va a sacar una lista de productos 
        return this.service.findAll();
    }

    //borrar
    //en este metodo el verbo debería de ser delete no get
    @GetMapping("/jornada/borrar/{id}")
    public ResponseEntity<Jornada> borrar(@PathVariable Integer id){
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
   @GetMapping("/jornada/editar/{id}")
    public ResponseEntity<Jornada> editar(@PathVariable Integer id) {
    Optional<Jornada> jornadaOpt = service.findById(id);
        if (jornadaOpt.isPresent()) {
            Jornada jornada = jornadaOpt.get();
            return ResponseEntity.ok(jornada);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //crear
    @PostMapping("/jornada/crear")
    public ResponseEntity<Jornada> crear(){
        //va a crear un producto
        return ResponseEntity.ok(new Jornada());
    }

    //guardar
    @PostMapping("/jornada/guardar")
    public ResponseEntity<Jornada> guardar(@RequestBody Jornada jornada){
        //va a guardar un producto
        if(jornada.getId() == null){
        //    return service.save(arbitro);
            service.save(jornada);
            return ResponseEntity.ok(jornada);
        }else{
            Optional<Jornada> jornadaSinActu = service.findById(jornada.getId());
            //cogemos el objeto del optional 
            Jornada jornadaActu = jornadaSinActu.get();
            jornadaActu.setNumero(jornada.getNumero());
            jornadaActu.setFechaReferencia(jornada.getFechaReferencia());

            service.save(jornadaActu);
            return ResponseEntity.ok(jornadaActu);  
        }
            
    }

}
