package com.david.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.david.backend.config.JwtTokenProvider;
import com.david.backend.entities.LoginRequest;
import com.david.backend.entities.LoginResponse;
import com.david.backend.entities.UserEntity;
import com.david.backend.entities.UserEntityService;
import com.david.backend.entities.UserRegisterDTO;

@RestController
public class AuthController {
@Autowired
    private UserEntityService userService;
    @Autowired
    private AuthenticationManager authManager;
    @Autowired
    private JwtTokenProvider jwtTokenProvider;



    @PostMapping("/auth/register")
    public UserEntity save(@RequestBody UserRegisterDTO userDTO){
        return this.userService.save(userDTO);
    }

    @PostMapping("/auth/login")
    //loginRequest es el username y el password enviados desde el frontend
    public LoginResponse login(@RequestBody LoginRequest loginDTO){
        //se crea un objeto de autenfificacion con las credenciales incluidas aunque todavua no esta autenticado 
        Authentication authDTO = new UsernamePasswordAuthenticationToken(loginDTO.username(), loginDTO.password());

        //se recupera el usuario de la bd se verifica que la contraseña este correcta y si todo es correcto  se crea un Authentication con el usuario y sus roles
        //llama al servicio 
        Authentication authentication = this.authManager.authenticate(authDTO);
        //aqui ya obtengo el usuario autenticado
        UserEntity user = (UserEntity) authentication.getPrincipal();
        //se genera el token JWT con el usuario autenticado
        String token = this.jwtTokenProvider.generateToken(authentication);

        //devuelvo el token y roles al front
        return new LoginResponse(user.getUsername(),
                user.getAuthorities().stream().map(GrantedAuthority::getAuthority).toList(),
                token);
    }
}
