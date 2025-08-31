/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.application.usecases;

import CS2.luisherrera.app.domain.model.Patient;
import CS2.luisherrera.app.domain.services.ManageClinicalHistoryService;
import CS2.luisherrera.app.domain.services.RegisterPatientService;

public class PatientUseCase {

   
    private RegisterPatientService registerPatientService;
    private ManageClinicalHistoryService manageClinicalHistoryService;

   
    public PatientUseCase(RegisterPatientService registerPatientService, ManageClinicalHistoryService manageClinicalHistoryService) {
        this.registerPatientService = registerPatientService;
        this.manageClinicalHistoryService = manageClinicalHistoryService;
    }

    public Patient registerPatient(Patient patient) {
       
        return registerPatientService.registerPatient(patient);
    }
    
   
}