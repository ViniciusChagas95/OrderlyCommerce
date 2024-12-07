package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
public class OrderlyCommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderlyCommerceApplication.class, args);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable) // Desabilita CSRF para testes
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Permite acesso público a todos os endpoints
                )
                .httpBasic(httpBasic -> {}); // Habilita autenticação HTTP básica
        return http.build();
    }
}
