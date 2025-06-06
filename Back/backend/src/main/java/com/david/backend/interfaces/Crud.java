package com.david.backend.interfaces;

import java.util.List;
import java.util.Optional;

import com.david.backend.entities.Jugador;

public interface Crud<T,Integer>{
    //Arbitro
      //guardar
        public void save(T entity);
        //buscar por id
        public Optional<T> findById(int id);
        //mirar si existe
        public boolean existsById(Integer id);
        //buscar todos
        public List<T> findAll();
        //borrar por id 
        public void deleteById(Integer id) ;
        //borrar todos
        public void deleteAll();

    
}
