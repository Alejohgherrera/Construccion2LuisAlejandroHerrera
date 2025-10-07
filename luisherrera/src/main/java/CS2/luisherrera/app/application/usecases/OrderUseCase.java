/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.application.usecases;

import CS2.luisherrera.app.domain.model.ClinicalOrder;
import CS2.luisherrera.app.domain.services.CreateOrderService;
import org.springframework.stereotype.Component;

/**
 * Caso de Uso para la creación de una Orden Clínica.
 * Actúa como orquestador entre el controlador (si existe) y el servicio de dominio.
 */
@Component
public class OrderUseCase {

    private final CreateOrderService createOrderService;

    public OrderUseCase(CreateOrderService createOrderService) {
        this.createOrderService = createOrderService;
    }

    /**
     * Crea una nueva orden clínica usando el servicio de dominio.
     *
     * @param patientId ID del paciente.
     * @param description Descripción de la orden.
     * @return La orden clínica recién creada.
     */
    public ClinicalOrder executeCreateOrder(String patientId, String description) {
        // Línea 38 corregida (asumiendo que aquí o en un método auxiliar estaba el error):
        // Nos aseguramos de que la llamada al servicio solo usa dos argumentos.
        return createOrderService.createOrder(patientId, description);
    }
}