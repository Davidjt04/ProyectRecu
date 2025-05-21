package com.david.backend.controllers;
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
import com.david.backend.services.EquipoService;

@RestController
@RequestMapping("/equipo/lista")
public class EquipoRestController {
    private final EquipoService service;

    public EquipoRestController(EquipoService service) {
        this.service = service;
    }

    //se muestran todos los productos
    @GetMapping("/equipo/lista")
    public List<Equipo> lista(){
        //va a sacar una lista de productos 
        return this.service.findAll();
    }

    //borrar
    //en este metodo el verbo debería de ser delete no get
    @GetMapping("/equipo/borrar/{id}")
    public ResponseEntity<Equipo>borrar(@PathVariable Integer id){
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
    @GetMapping("/equipo/editar/{id}")
    public ResponseEntity<Equipo> editar(@PathVariable Integer id) {
    Optional<Equipo> equipoOpt = service.findById(id);
        if (equipoOpt.isPresent()) {
            Equipo equipo = equipoOpt.get();
            return ResponseEntity.ok(equipo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

     //crear
    @PostMapping("/equipo/crear")
    public ResponseEntity<Equipo> crear(){
        //va a crear un producto
        return ResponseEntity.ok(new Equipo());
    }

    //guardar
    @PostMapping("/equipo/guardar")
    public ResponseEntity<Equipo> guardar(@RequestBody Equipo equipo){
        //va a guardar un producto
        if(equipo.getId() == null){
        //    return service.save(arbitro);
            service.save(equipo);
            return ResponseEntity.ok(equipo);
        }else{
            Optional<Equipo> EquipoSinActu = service.findById(equipo.getId());
            //cogemos el objeto del optional 
            Equipo equipoActu = EquipoSinActu.get();
            equipoActu.setNombre(equipo.getNombre());
            equipoActu.setAnioFundacion(equipo.getAnioFundacion());
            equipoActu.setCiudad(equipo.getCiudad());
            equipoActu.setEscudo(equipo.getEscudo());
            equipoActu.setFotoOficial(equipo.getFotoOficial());

            service.save(equipoActu);
            return ResponseEntity.ok(equipoActu);  
        }
            
    }

}
