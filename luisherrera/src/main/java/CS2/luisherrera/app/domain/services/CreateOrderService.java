/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.ClinicalOrder;
import org.springframework.stereotype.Service;

/**
 * Servicio de dominio que encapsula la lógica de negocio para
 * la creación de órdenes clínicas.
 */
@Service
public class CreateOrderService {

    // En un sistema real, aquí iría la inyección de dependencias
    // para los repositorios de persistencia.
    // private final ClinicalOrderRepository orderRepository;

    // public CreateOrderService(ClinicalOrderRepository orderRepository) {
    //     this.orderRepository = orderRepository;
    // }

    /**
     * Crea una nueva orden clínica.
     *
     * @param patientId El ID del paciente.
     * @param doctorId El ID del doctor.
     * @param orderText El texto de la orden.
     * @return La orden clínica creada con un ID único.
     */
    public ClinicalOrder createClinicalOrder(String patientId, String doctorId, String orderText) {
        // La lógica de negocio para crear la orden
        // (validaciones, etc.) se encuentra aquí.
        ClinicalOrder newOrder = new ClinicalOrder(patientId, doctorId, orderText);

        // Guardar la orden en la base de datos (comentado por ahora)
        // return orderRepository.save(newOrder);

        // Retornamos la orden recién creada para la demostración.
        return newOrder;
    }
}