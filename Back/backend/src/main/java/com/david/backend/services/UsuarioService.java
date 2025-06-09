// package com.david.backend.services;

// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// import com.david.backend.entities.UserEntity;
// import com.david.backend.repos.RepoUser;

// @Service
// public class UsuarioService implements UserDetailsService {
//   @Autowired
//     private RepoUser userRepository;

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         Optional<UserEntity> userOptional = userRepository.findByUsername(username);

//         if (userOptional.isEmpty()) {
//             throw new UsernameNotFoundException("Usuario no encontrado con username: " + username);
//         }

//         return userOptional.get();
//     }
// }
