/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CS2.luisherrera.infrastructure.persistence.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Mapeador de paciente para la capa de persistencia de Spring Data JPA.
 * Esta interfaz extiende JpaRepository para obtener operaciones CRUD
 * sin violar las reglas de nomenclatura de la capa de dominio.
 */
@Repository
public interface SpringPatientMapper extends JpaRepository<PatientMapper, Long> {
    
    /**
     * Busca un paciente por su número de seguridad social.
     * Spring Data JPA creará la consulta automáticamente.
     * @param socialSecurityNumber El número de seguridad social del paciente.
     * @return El objeto PatientMapper encontrado, o null si no existe.
     */
    PatientMapper findBySocialSecurityNumber(String socialSecurityNumber);
}