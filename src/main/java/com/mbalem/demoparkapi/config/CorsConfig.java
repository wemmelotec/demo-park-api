package com.mbalem.demoparkapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Permitir todas as origens (ou especifique origens permitidas)
        config.addAllowedOrigin("*");

        // Permitir todos os métodos HTTP (ou especifique os métodos permitidos)
        config.addAllowedMethod("*");

        // Permitir todos os cabeçalhos (ou especifique os cabeçalhos permitidos)
        config.addAllowedHeader("*");

        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}
