/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.Patient;
import CS2.luisherrera.app.domain.repositories.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class GetPatientService {

    private final PacienteRepository pacienteRepository;

    @Autowired
    public GetPatientService(PacienteRepository pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    /**
     * Obtiene un paciente por su correo electrónico.
     * @param email El correo electrónico del paciente.
     * @return El objeto Patient encontrado, o null si no existe.
     */
    public Patient getPatient(String email) {
        Optional<Patient> patient = pacienteRepository.findByEmail(email);
        return patient.orElse(null);
    }
}