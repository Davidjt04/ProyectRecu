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

import com.david.backend.entities.Arbitro;
import com.david.backend.entities.Equipo;
import com.david.backend.entities.Jornada;
import com.david.backend.entities.Partido;
import com.david.backend.services.ArbitroService;
import com.david.backend.services.EquipoService;
import com.david.backend.services.JornadaService;
import com.david.backend.services.PartidoService;

import jakarta.transaction.Transactional;

@RestController
@Transactional
// @RequestMapping("/partido/lista")
public class PartidoRestController {
    private final PartidoService service;
    // private final ArbitroService arbiservice;
    // private final EquipoService equipoService;
    // private final JornadaService jornadaService;

    public PartidoRestController(PartidoService service, ArbitroService arbiservice,EquipoService equipoService,JornadaService jornadaService) {
        this.service = service;
        // this.arbiservice = arbiservice;
        // this.equipoService = equipoService;
        // this.jornadaService = jornadaService;

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
          System.out.println("borrado");
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
        return ResponseEntity.ok(new Partido());//me tiene que coger el constructor con todas las relaciones 
    }

    //guardar
    @PostMapping("/partido/guardar")
    public ResponseEntity<Partido> guardar(@RequestBody Partido partido){
        //va a guardar un producto
        if(partido.getId() == null){
        //    return service.save(arbitro);
            service.save(partido);

            //actualizo la list de partidos de arbitro 
            // Arbitro arbitro = partido.getArbitro();
            // Arbitro arbitro = arbiservice.findById(partido.getArbitro().getIdArbitro()).get();
            // arbitro.addPartido(partido);
            // arbiservice.save(arbitro);
            
            // //actualizo la list de equipo local y visitante
            // Equipo equipoLocal = equipoService.findById(partido.getEquipoLocal().getId()).get();
            // equipoLocal.addPartidoLocal(partido);
            // equipoService.save(equipoLocal);     
            
            
            // Equipo equipoVisitante= equipoService.findById(partido.getEquipoVisitante().getId()).get();
            // equipoVisitante.addPartidoVisitante(partido);
            // equipoService.save(equipoVisitante);     


            // //actualizo la list de partidos de la jornada


            // Jornada jornada = jornadaService.findById(partido.getJornada().getId()).get();
            // jornada.addPartido(partido);
            // jornadaService.save(jornada);


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

            // //rellenando las variables de las diferentes relaciones
            // //Arbitro
            // Arbitro arbitro = arbiservice.findById(partido.getArbitro().getIdArbitro()).get();
            // arbitro.addPartido(partido);
            // arbiservice.save(arbitro);

            // //EquipoLocal
            //  Equipo equipoLocal = equipoService.findById(partido.getEquipoLocal().getId()).get();
            // equipoLocal.addPartidoLocal(partido);
            // equipoService.save(equipoLocal);  

            // //EquipoVisitante
            // Equipo equipoVisitante= equipoService.findById(partido.getEquipoVisitante().getId()).get();
            // equipoVisitante.addPartidoVisitante(partido);
            // equipoService.save(equipoVisitante);  

            // //Jornada
            // Jornada jornada = jornadaService.findById(partido.getJornada().getId()).get();
            // jornada.addPartido(partido);
            // jornadaService.save(jornada);

            service.save(partidoActu);
            return ResponseEntity.ok(partidoActu);  
        }
            
    }

}
