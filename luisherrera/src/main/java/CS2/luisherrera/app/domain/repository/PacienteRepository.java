/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.repositories;

import CS2.luisherrera.app.domain.model.Patient;

import java.util.Optional;


public interface PacienteRepository {
    Optional<Patient> findByEmail(String email);
    Patient save(Patient patient);
}