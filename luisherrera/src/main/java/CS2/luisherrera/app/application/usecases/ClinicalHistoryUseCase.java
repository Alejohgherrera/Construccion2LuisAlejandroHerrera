/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.application.usecases;

import CS2.luisherrera.app.domain.model.ClinicalHistory;
import CS2.luisherrera.app.domain.model.Patient;
import CS2.luisherrera.app.domain.services.ManageClinicalHistoryService;
import CS2.luisherrera.app.domain.services.RegisterPatientService;

import java.util.Map;

public class ClinicalHistoryUseCase {

    
    private RegisterPatientService registerPatientService;
    private ManageClinicalHistoryService manageClinicalHistoryService;

    
    public ClinicalHistoryUseCase(RegisterPatientService registerPatientService, ManageClinicalHistoryService manageClinicalHistoryService) {
        this.registerPatientService = registerPatientService;
        this.manageClinicalHistoryService = manageClinicalHistoryService;
    }
    
   
    public ClinicalHistory addRecordToHistory(String patientSocialSecurityNumber, String recordKey, Map<String, String> recordDetails) {
        
        return manageClinicalHistoryService.addRecordToHistory(patientSocialSecurityNumber, recordKey, recordDetails);
    }
    
    
}