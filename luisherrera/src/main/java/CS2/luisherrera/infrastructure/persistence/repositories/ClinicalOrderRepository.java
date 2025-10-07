/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CS2.luisherrera.infrastructure.persistence.repositories;

import CS2.luisherrera.app.domain.model.ClinicalOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Interfaz de repositorio de Spring Data JPA para la entidad ClinicalOrder.
 * Permite operaciones CRUD básicas y consultas personalizadas.
 */
@Repository
public interface ClinicalOrderRepository extends JpaRepository<ClinicalOrder, Long> {

    /**
     * Encuentra todas las órdenes clínicas por ID de paciente.
     * @param patientId ID del paciente.
     * @return Lista de ClinicalOrder.
     */
    List<ClinicalOrder> findAllByPatientId(String patientId);
}