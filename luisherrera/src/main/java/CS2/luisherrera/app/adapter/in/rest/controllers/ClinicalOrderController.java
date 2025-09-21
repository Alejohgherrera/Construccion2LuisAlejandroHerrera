/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.rest.controllers;

import CS2.luisherrera.app.domain.model.ClinicalOrder;
import CS2.luisherrera.app.domain.services.CreateOrderService;
import CS2.luisherrera.app.adapter.in.rest.request.CreateOrderRequest; // Importación correcta del DTO
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

/**
 * Adaptador de entrada que maneja las solicitudes HTTP para
 * la gestión de órdenes clínicas.
 */
@RestController
@RequestMapping("/api/orders")
public class ClinicalOrderController {

    private final CreateOrderService createOrderService;

    @Autowired
    public ClinicalOrderController(CreateOrderService createOrderService) {
        this.createOrderService = createOrderService;
    }

    /**
     * Endpoint para crear una nueva orden clínica.
     *
     * @param request La solicitud DTO que contiene los datos de la orden.
     * @return Una respuesta HTTP que contiene la orden clínica creada.
     */
    @PostMapping
    public ResponseEntity<ClinicalOrder> createOrder(@RequestBody CreateOrderRequest request) {
        // Llama al servicio del dominio con los datos del DTO
        ClinicalOrder newOrder = createOrderService.createClinicalOrder(
                request.getPatientId(),
                request.getDoctorId(),
                request.getOrderText()
        );

        return new ResponseEntity<>(newOrder, HttpStatus.CREATED);
    }
}