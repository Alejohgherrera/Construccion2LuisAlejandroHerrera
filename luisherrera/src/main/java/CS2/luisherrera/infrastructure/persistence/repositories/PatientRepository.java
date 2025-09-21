/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CS2.luisherrera.app.domain.repositories;

import CS2.luisherrera.app.domain.model.Patient;
import java.util.List;
import java.util.Optional;

/**
 * Puerto de salida para la capa de persistencia.
 * Un servicio de dominio se comunicará con esta interfaz para acceder a los datos.
 */
public interface PatientRepository {
    
    /**
     * Guarda un paciente en la base de datos.
     * @param patient El objeto de dominio Patient a guardar.
     * @return El paciente guardado.
     */
    Patient save(Patient patient);
    
    /**
     * Encuentra un paciente por su número de seguridad social.
     * @param socialSecurityNumber El número de seguridad social a buscar.
     * @return Un objeto Optional que contiene el paciente si es encontrado.
     */
    Optional<Patient> findBySocialSecurityNumber(String socialSecurityNumber);

    /**
     * Obtiene una lista de todos los pacientes.
     * @return Una lista de todos los pacientes.
     */
    List<Patient> findAll();
}