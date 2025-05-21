package com.david.backend.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.david.backend.entities.Arbitro;
import com.david.backend.services.ArbitroService;


@RestController
// @RequestMapping("/arbitro/lista")
public class ArbitroRestController {
    private final ArbitroService service;

    public ArbitroRestController(ArbitroService service) {
        this.service = service;
    }

    //se muestran todos los productos
    @GetMapping("/arbitro/lista")
    public List<Arbitro> lista(){
        //va a sacar una lista de productos 
        return this.service.findAll();
    }

    //borrar
    //en este metodo el verbo debería de ser delete no get
    @GetMapping("/arbitro/borrar/{id}")
    public ResponseEntity<Arbitro> borrar(@PathVariable Integer id){
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
   @GetMapping("/arbitro/editar/{id}")
    public ResponseEntity<Arbitro> editar(@PathVariable Integer id) {
    Optional<Arbitro> arbitroOpt = service.findById(id);
        if (arbitroOpt.isPresent()) {
            Arbitro arbitro = arbitroOpt.get();
            return ResponseEntity.ok(arbitro);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //crear
    @PostMapping("/arbitro/crear")
    public ResponseEntity<Arbitro> crear(){
        //va a crear un producto
        return ResponseEntity.ok(new Arbitro());
    }

    //guardar
    @PostMapping("/arbitro/guardar")
    public ResponseEntity<Arbitro> guardar(@RequestBody Arbitro arbitro){
        //va a guardar un producto
        if(arbitro.getIdArbitro() == null){
        //    return service.save(arbitro);
            service.save(arbitro);
            return ResponseEntity.ok(arbitro);
        }else{
            
            Optional<Arbitro> ProductoSinActu = service.findById(arbitro.getIdArbitro());
            //cogemos el objeto del optional 
            Arbitro productoActu = ProductoSinActu.get();
            productoActu.setFechaNac(arbitro.getFechaNac());
            productoActu.setNombre(arbitro.getNombre());
            productoActu.setFederacion(arbitro.getFederacion());
            productoActu.setFoto(arbitro.getFoto());

            //meter los partidos asociados 
            service.save(productoActu);
            return ResponseEntity.ok(productoActu);  
        }
            
    }
}
