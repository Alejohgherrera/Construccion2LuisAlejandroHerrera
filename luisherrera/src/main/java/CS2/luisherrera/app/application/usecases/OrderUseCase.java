/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.application.usecases;

import CS2.luisherrera.app.domain.model.ClinicalOrder;
import org.springframework.stereotype.Service;

/**
 * Implementación del caso de uso de órdenes.
 * Contiene la lógica de negocio para crear y manipular órdenes.
 * Es el "núcleo" de la aplicación.
 */
@Service
public class OrderUseCase {

    // Simulación de un servicio de persistencia (puerto de salida)
    //private final OrderRepository orderRepository;

    // Puedes inyectar un repositorio aquí cuando esté implementado.
    //public OrderUseCase(OrderRepository orderRepository) {
    //    this.orderRepository = orderRepository;
    //}

    /**
     * Crea una nueva orden clínica.
     *
     * @param patientId El ID del paciente.
     * @param doctorId El ID del doctor.
     * @param orderText El texto de la orden.
     * @return La orden clínica creada, con un ID único.
     */
    public ClinicalOrder createClinicalOrder(String patientId, String doctorId, String orderText) {
        // En una aplicación real, la lógica iría aquí:
        // 1. Validar los datos de entrada
        // 2. Crear una nueva entidad de dominio
        ClinicalOrder newOrder = new ClinicalOrder(patientId, doctorId, orderText);

        // 3. Persistir la entidad usando el repositorio
        // Order createdOrder = orderRepository.save(newOrder);

        // Por ahora, solo devolvemos la orden para simular el proceso
        return newOrder;
    }
}