/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.Patient;

public class RegisterPatientService {

    

    public Patient registerPatient(Patient patient) {
        
       
        
        System.out.println("Simulando el registro del paciente: " + patient.getFullName());
        
        
        return patient;
    }
}