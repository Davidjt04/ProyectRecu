package com.david.backend.config;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Es un filtro que intercepta cada petición HTTP antes de llegar a tus controladores.
@Component
public class JwtFilter extends OncePerRequestFilter{
    private static final Logger log = LoggerFactory.getLogger(JwtFilter.class);

    @Autowired
    private JwtTokenProvider tokenProvider;

    @Autowired
    private UserDetailsService userService;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //coje el token del header
        String token = this.extractToken(request);

        if(this.tokenProvider.isValidToken(token)){

            String username = this.tokenProvider.getUsernameFromToken(token);
            UserDetails user = this.userService.loadUserByUsername(username);

            Authentication auth = new UsernamePasswordAuthenticationToken(
            user,       // el objeto UserDetails completo
            null,       // credenciales (null porque ya autenticado)
            user.getAuthorities());

            SecurityContextHolder.getContext().setAuthentication(auth);
            log.info("Autenticación seteada: " + auth.getAuthorities());

        }

        filterChain.doFilter(request, response);
    }

    private String extractToken(HttpServletRequest request){
        String bearerToken = request.getHeader("Authorization");
        if (StringUtils.hasLength(bearerToken) && bearerToken.startsWith("Bearer")){
            return bearerToken.substring("Bearer ".length());
        }
        return null;
    }
}
