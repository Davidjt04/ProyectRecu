package com.david.backend.entities;


import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.david.backend.config.UserAuthority;
import com.david.backend.repos.UserEntityRepository;

@Service
public class UserEntityService implements UserDetailsService {

    // Repositorio para acceder a los datos de usuario
  private final UserEntityRepository repository;
    private final PasswordEncoder passwordEncoder;

    public UserEntityService(UserEntityRepository repository, PasswordEncoder passwordEncoder) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
    }

    //guarda al usuario normalmente se usa cuadno se registra por primera vez ya que como se ve le estamos dando un rol por defecto
    public UserEntity save(UserRegisterDTO userDTO) {
        UserEntity user = new UserEntity(
                null,
                userDTO.username(),
                passwordEncoder.encode(userDTO.password()),
                userDTO.email(),
                //le asignamos un rol por defecto
                List.of(UserAuthority.READ)
        );
        return this.repository.save(user);
    }
    //se utiliza para encontrar al usuario en la bd en en el proceso de login  para ver si el login es correcto o no es decir si el usuario existe o no 
   @Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    UserEntity user = repository.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado: " + username));
    System.out.println("Usuario cargado: " + user.getUsername() + ", authorities: " + user.getAuthorities());
    return user;
}

}
