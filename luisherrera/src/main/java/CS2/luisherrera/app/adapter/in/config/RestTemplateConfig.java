/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Clase de configuración para definir beans de la aplicación.
 * Aquí se crea una instancia de RestTemplate que será gestionada
 * por el contenedor de Spring.
 */
@Configuration
public class RestTemplateConfig {

    /**
     * Define un bean de tipo RestTemplate.
     * Spring usará este método para crear la instancia de RestTemplate
     * cada vez que se necesite en otra clase (por ejemplo, en OrderClient).
     * @return Una nueva instancia de RestTemplate.
     */
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
