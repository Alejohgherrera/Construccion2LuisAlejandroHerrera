/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.Patient;
import CS2.luisherrera.app.domain.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Servicio de dominio para obtener datos de pacientes.
 * Se encarga de la lógica de negocio para buscar pacientes existentes.
 */
@Service
public class GetPatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public GetPatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    /**
     * Obtiene un paciente por su número de seguridad social.
     * @param socialSecurityNumber El número de seguridad social del paciente.
     * @return El objeto de dominio Patient, o null si no se encuentra.
     */
    public Patient getPatient(String socialSecurityNumber) {
        Optional<Patient> patientOptional = patientRepository.findBySocialSecurityNumber(socialSecurityNumber);
        return patientOptional.orElse(null);
    }
}