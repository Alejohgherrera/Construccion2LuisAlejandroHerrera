/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CS2.luisherrera.app.domain.repositories;

import CS2.luisherrera.app.domain.model.Doctor;
import java.util.Optional;

/**
 * Interfaz del repositorio para las operaciones de persistencia del Doctor.
 * Define los métodos necesarios para acceder y manipular los datos de los doctores.
 */
public interface DoctorRepository {

    /**
     * Busca un doctor por su número de seguridad social.
     * @param socialSecurityNumber El número de seguridad social del doctor.
     * @return Un Optional que contiene el Doctor si es encontrado, o vacío si no.
     */
    Optional<Doctor> findBySocialSecurityNumber(String socialSecurityNumber);

    /**
     * Obtiene una lista de todos los doctores.
     * @return Un Iterable con todos los doctores.
     */
    Iterable<Doctor> findAll();
}
