/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.Patient;
import CS2.luisherrera.app.domain.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Servicio de dominio para la lógica de negocio de los pacientes.
 * Se encarga de manejar las operaciones de guardar y obtener pacientes.
 */
@Service
public class ManagePatientService {

    private final PatientRepository patientRepository;

    @Autowired
    public ManagePatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    /**
     * Guarda un nuevo paciente en la base de datos.
     * @param patient El objeto de dominio Patient a guardar.
     * @return El paciente guardado.
     */
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    /**
     * Obtiene una lista de todos los pacientes.
     * @return Una lista de objetos de dominio Patient.
     */
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    public List<Patient> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Patient save(Patient patient) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}