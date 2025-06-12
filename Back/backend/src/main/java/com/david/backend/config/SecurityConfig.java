package com.david.backend.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authorization.AuthorizationDecision;
import org.springframework.security.authorization.AuthorizationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.intercept.RequestAuthorizationContext;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

@Configuration
public class SecurityConfig {

    @Autowired
    private JwtFilter jwtFilter;

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOriginPatterns(Arrays.asList("http://localhost:4200"));  // origen del frontend Angular
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
        configuration.setAllowedHeaders(Arrays.asList("*"));
        configuration.setAllowCredentials(true);

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

    @Bean
    public AuthenticationManager authenticationManager(
            HttpSecurity http,
            PasswordEncoder passwordEncoder,
            UserDetailsService userDetailsService) throws Exception {

        return http.getSharedObject(AuthenticationManagerBuilder.class)
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder)
                .and().build();
    }

//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         return http
//             .cors(cors -> {})
//             .csrf(csrf -> csrf.disable())
//             .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//             .authorizeHttpRequests(auth -> auth
//     .requestMatchers("/auth/**", "/img/**").permitAll()

//     // Cliente (READ)
//     .requestMatchers("/estadisticas").hasAuthority("READ")

//     // Partido accesible por READ o WRITE
//     .requestMatchers("/partido/lista", "/arbitro/lista", "/evento/guardar").hasAnyAuthority("READ", "WRITE")

//     // VAR (solo WRITE)
//     .requestMatchers("/var", "/navbar-var/**").hasAuthority("WRITE")

//     // Admin (requiere ambos)
//     .requestMatchers("/equipo", "/evento/**", "/jornada", "/jugador", "/tipoEvento")
//     .access(hasBothAuthorities("READ", "WRITE"))

//     .anyRequest().authenticated()
// )



//             .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
//             .build();
// }
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http
        .cors(cors -> {})
        .csrf(csrf -> csrf.disable())
        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        .authorizeHttpRequests(auth -> auth
            // Comentar o eliminar todas las reglas de autorización específicas:
            //.requestMatchers("/auth/**", "/img/**").permitAll()
            //.requestMatchers("/estadisticas").hasAuthority("READ")
            //.requestMatchers("/partido/lista", "/arbitro/lista", "/evento/guardar").hasAnyAuthority("READ", "WRITE")
            //.requestMatchers("/var", "/navbar-var/**").hasAuthority("WRITE")
            //.requestMatchers("/equipo", "/evento/**", "/jornada", "/jugador", "/tipoEvento")
            //.access(hasBothAuthorities("READ", "WRITE"))

            // Permitir acceso a todas las URLs sin autenticación
            .anyRequest().permitAll()
        )
        // Comentar o eliminar el filtro JWT, ya que no es necesario si no hay seguridad
        //.addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
        .build();
}

    private AuthorizationManager<RequestAuthorizationContext> hasBothAuthorities(String... authorities) {
        return (authentication, context) -> {
            boolean hasAll = Arrays.stream(authorities)
                .allMatch(required -> authentication.get().getAuthorities().stream()
                    .anyMatch(granted -> granted.getAuthority().equals(required)));
            return new AuthorizationDecision(hasAll);
        };
    }
}
