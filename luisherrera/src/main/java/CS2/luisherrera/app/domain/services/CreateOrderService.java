/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.ClinicalOrder;

import CS2.luisherrera.infrastructure.persistence.repositories.ClinicalOrderRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Servicio de dominio responsable de la lógica de creación de órdenes clínicas.
 */
@Service
public class CreateOrderService {

    private final ClinicalOrderRepository orderRepository;

    public CreateOrderService(ClinicalOrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    /**
     * Crea y guarda una nueva orden clínica.
     *
     * @param patientId El ID del paciente.
     * @param description La descripción de la orden.
     * @return La orden clínica creada y guardada.
     */
    public ClinicalOrder createOrder(String patientId, String description) {
        
        ClinicalOrder newOrder = new ClinicalOrder(patientId, description);

        return orderRepository.save(newOrder);
    }
}