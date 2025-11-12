/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services; // <<-- DEBE SER 'services', no 'model'

import CS2.luisherrera.app.domain.model.ClinicalOrder;
import CS2.luisherrera.infrastructure.persistence.repositories.ClinicalOrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Servicio de dominio para la lógica de negocio de ClinicalOrder.
 * Maneja las interacciones con el repositorio de datos.
 */
@Service
public class ClinicalOrderService {

    private final ClinicalOrderRepository clinicalOrderRepository;

    // Inyección de dependencias del repositorio.
    public ClinicalOrderService(ClinicalOrderRepository clinicalOrderRepository) {
        this.clinicalOrderRepository = clinicalOrderRepository;
    }

    /**
     * Guarda una nueva orden clínica en la base de datos.
     * @param order La entidad ClinicalOrder a guardar.
     * @return La orden guardada (incluyendo el ID generado).
     */
    @Transactional
    public ClinicalOrder createOrder(ClinicalOrder order) {
        // Aquí podrías agregar lógica de validación antes de guardar
        return clinicalOrderRepository.save(order);
    }

    /**
     * Busca todas las órdenes clínicas existentes.
     * @return Una lista de todas las órdenes.
     */
    @Transactional(readOnly = true)
    public List<ClinicalOrder> findAllOrders() {
        //  se usaría paginación, pero para el CLI, se listan todas.
        return clinicalOrderRepository.findAll();
    }

    /**
     * Busca una orden clínica por su ID.
     * @param id El ID de la orden.
     * @return Un Optional que contiene la orden si se encuentra, o vacío si no.
     */
    @Transactional(readOnly = true)
    public Optional<ClinicalOrder> findOrderById(Long id) {
        return clinicalOrderRepository.findById(id);
    }

    
}