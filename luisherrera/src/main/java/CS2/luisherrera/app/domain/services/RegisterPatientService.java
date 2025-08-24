/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.Patient;
import CS2.luisherrera.app.domain.ports.RegisterPatientPort;
import org.springframework.stereotype.Service;

@Service
public class RegisterPatientService implements RegisterPatientPort {

    @Override
    public Patient registerPatient(Patient patient) {
        System.out.println("Ejecutando servicio de Registro de Paciente: Paciente " + patient.getFullName() + " registrado.");
        return patient;
    }
}
