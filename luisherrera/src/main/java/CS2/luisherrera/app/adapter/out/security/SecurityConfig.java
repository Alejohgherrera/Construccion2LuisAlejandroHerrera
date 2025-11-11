/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.out.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * Clase de configuración principal para Spring Security en la capa de Adaptadores.
 * Define:
 * 1. El codificador de contraseñas.
 * 2. La cadena de filtros de seguridad (SecurityFilterChain).
 * 3. La configuración de CORS para permitir peticiones desde el frontend.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    /**
     * Bean para el codificador de contraseñas. Usamos BCrypt.
     * Esto es necesario para el Caso de Uso RegisterUserServiceImpl.
     * @return PasswordEncoder
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    /**
     * Configura la cadena de filtros de seguridad HTTP.
     * - Deshabilita CSRF (típico para APIs REST con tokens).
     * - Permite acceso sin autenticación a /api/users/register y /api/users/login.
     * - Establece la política de sesión como STATELESS.
     * @param http Objeto HttpSecurity para configurar reglas.
     * @return SecurityFilterChain configurado.
     * @throws Exception Si la configuración falla.
     */
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            // Deshabilita CSRF (Cross-Site Request Forgery)
            .csrf(AbstractHttpConfigurer::disable)
            // Configura la autorización de las peticiones
            .authorizeHttpRequests(authorize -> authorize
                // Permitir acceso sin autenticar para registrar un nuevo usuario
                .requestMatchers("/api/users/register").permitAll()
                // Permitir acceso sin autenticar para el inicio de sesión
                .requestMatchers("/api/users/login").permitAll()
                // Cualquier otra solicitud debe estar autenticada
                .anyRequest().authenticated()
            )
            // Configura la gestión de sesiones como sin estado (Stateless)
            // Esencial para APIs REST que usan tokens (JWT)
            .sessionManagement(session -> session
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
            );

        return http.build();
    }

    /**
     * Bean para la configuración de CORS.
     * Esto permite peticiones de frontend (e.g., React, Vue) a esta API.
     * NOTA: En producción, se deben restringir los orígenes permitidos.
     * @return CorsFilter configurado.
     */
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);
        // Permitir todos los orígenes.
        config.addAllowedOrigin("*");
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}