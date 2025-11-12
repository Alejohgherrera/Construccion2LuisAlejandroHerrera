/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Clase de cliente para interactuar con el servicio de órdenes.
 * Utiliza RestTemplate para realizar llamadas a la API de órdenes.
 */
@Service
public class OrderClient {

    private final RestTemplate restTemplate;

    @Value("${api.orders.url}")
    private String ordersApiUrl;

    
    public OrderClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /**
     * Obtiene una orden por su ID.
     * @param orderId El ID de la orden.
     * @return El resultado de la llamada a la API en formato String.
     */
    public String getOrderById(Long orderId) {
        // Concatenamos la URL base con el ID de la orden.
        String url = ordersApiUrl + "/" + orderId;
        return restTemplate.getForObject(url, String.class);
    }
}