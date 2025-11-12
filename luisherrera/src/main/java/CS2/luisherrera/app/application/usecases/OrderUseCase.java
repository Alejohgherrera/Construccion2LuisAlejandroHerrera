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
 * Actúa como orquestador entre el controlador y el servicio de dominio.
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
        
        return createOrderService.createOrder(patientId, description);
    }
}