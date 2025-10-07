/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.rest.controllers;

import CS2.luisherrera.app.application.usecases.OrderUseCase;
import CS2.luisherrera.app.domain.model.ClinicalOrder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador REST para manejar las operaciones relacionadas con las Órdenes Clínicas.
 * Se utiliza el patrón Controller -> UseCase.
 */
@RestController
@RequestMapping("/api/orders")
public class ClinicalOrderController {

    private final OrderUseCase orderUseCase;

    public ClinicalOrderController(OrderUseCase orderUseCase) {
        this.orderUseCase = orderUseCase;
    }

    /**
     * DTO (Data Transfer Object) para la solicitud de creación de una Orden Clínica.
     * Contiene solo los datos necesarios (patientId y description).
     */
    private static class ClinicalOrderCreationRequest {
        private String patientId;
        private String description;

        // Getters y Setters
        public String getPatientId() { return patientId; }
        public void setPatientId(String patientId) { this.patientId = patientId; }
        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
    }

    /**
     * Endpoint para crear una nueva orden clínica.
     * CORRECCIÓN: Ahora llama a OrderUseCase.executeCreateOrder() con solo dos argumentos,
     * alineándose con la firma actualizada del caso de uso y del servicio.
     *
     * @param request El cuerpo de la solicitud que contiene los datos de la nueva orden.
     * @return ResponseEntity con la orden creada y el código 201 (Created).
     */
    @PostMapping
    public ResponseEntity<ClinicalOrder> createClinicalOrder(@RequestBody ClinicalOrderCreationRequest request) {
        // La llamada debe reflejar la firma de dos argumentos del Caso de Uso (OrderUseCase).
        ClinicalOrder createdOrder = orderUseCase.executeCreateOrder(
                request.getPatientId(),
                request.getDescription()
        );
        return new ResponseEntity<>(createdOrder, HttpStatus.CREATED);
    }
}
