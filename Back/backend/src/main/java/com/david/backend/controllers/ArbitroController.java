// package com.david.backend.controllers;

// import java.util.Optional;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;

// import com.david.backend.entities.Arbitro;
// import com.david.backend.services.ArbitroService;

// @Controller
// public class ArbitroController {
//     private final ArbitroService service;

//     public ArbitroController(ArbitroService service) {
//         this.service = service;
//     }

//     //entrypoint por defecto 
//     @GetMapping("/")
//     public String index(){
//         return "redirect:/products/lista";
//     }

//     //se muestran todos los productos
//     @GetMapping("/products/lista")
//     public String lista(Model modelo){
//         //va a sacar una lista de productos 
//         modelo.addAttribute("products", service.findAll());
//         return "Product-List";
//     }

//     // //mirar un producto concreto 
//     // @GetMapping("/products/ver/{id}")
//     // public String ver(Model modelo,  @PathVariable Integer id){
//     //     //va a editar un producto
//     //     modelo.addAttribute("product", service.findById(id).get());
//     //     return "Ver-Product";
//     // }

//     //borrar
//     @GetMapping("/products/borrar/{id}")
//     public String borrar(@PathVariable Integer id){
//         //va a borrar un producto
//         if(service.existsById(id)){
//             service.deleteById(id);
//         }
//         return "redirect:/products/lista";
//     }

//     //editar
//     @GetMapping("/products/editar/{id}")
//     public String editar(Model modelo , @PathVariable Integer id){
//         //va a editar un producto
//        if(service.existsById(id)){
//         Optional<Arbitro> producto = service.findById(id);
//         modelo.addAttribute("producto", producto);
//         }
//         return "CreateProduct";
//     }

//     //crear
//     @GetMapping("/products/crear")
//     public String crear(Model modelo){
//         //va a crear un producto
//         modelo.addAttribute("producto", new Arbitro());
//         return "CreateProduct";
//     }

//     //guardar
//     @PostMapping("/products/guardar")
//     public String guardar(@ModelAttribute Arbitro producto){
//         //va a guardar un producto
//         if(producto.getIdArbitro() == null){
//             service.save(producto);
            
//         }else{
//             Optional<Arbitro> ProductoSinActu = service.findById(producto.getIdArbitro());
//             //cogemos el objeto del optional 
//             Arbitro productoActu = ProductoSinActu.get();
//             productoActu.setFechaNac(producto.getFechaNac());
//             productoActu.setNombre(producto.getNombre());
//             productoActu.setFederacion(producto.getFederacion());
//             productoActu.setFoto(producto.getFoto());
//             service.save(productoActu);
//         }
//         return "redirect:/products/lista";
//     }
// }
