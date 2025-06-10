package com.david.backend.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
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

    //configura como se van a autenticar los usuarios
    @Bean
    public AuthenticationManager authenticationManager(HttpSecurity http,
                                             PasswordEncoder passwordEncoder,
                                             UserDetailsService userDetailsService) throws Exception {

        return http.getSharedObject(AuthenticationManagerBuilder.class)
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder)
                .and().build();

    }

@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    return http
        .cors(cors -> {})  // habilita CORS con la nueva sintaxis lambda
        .csrf(csrf -> csrf.disable())
        .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        .authorizeHttpRequests(auth -> auth
    .requestMatchers("/auth/**").permitAll()

            // // Cliente (READ)
            // .requestMatchers("/cliente/**").hasAuthority("READ")
            .requestMatchers("/cliente/partido/lista").hasAuthority("READ")

            // // Admin (WRITE)
            // .requestMatchers("/admin/**").hasAuthority("WRITE")
            // .requestMatchers("/equipo/**", "/evento/**", "/jugador/**", "/jornada/**", "/tipoEvento/**").hasAuthority("WRITE")

            // // VAR (WRITE)
            // .requestMatchers("/var/**", "/navbar-var/**").hasAuthority("WRITE")
    .anyRequest().authenticated()
)

        .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class)
        .build();
}




}
