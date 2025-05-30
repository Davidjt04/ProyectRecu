package com.david.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class corsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                //hace que se aplique el cors a todas las rutas
                registry.addMapping("/**")
                //permite las solicitudes desde ese origen en especifico siendo este el de Angular
                    .allowedOrigins("http://localhost:4200")
                //se definen los verbos que se van a permitir    
                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                //permte encabezados personalizados
                    .allowedHeaders("*")
                    .allowCredentials(true);
            }
        };
    }
}
