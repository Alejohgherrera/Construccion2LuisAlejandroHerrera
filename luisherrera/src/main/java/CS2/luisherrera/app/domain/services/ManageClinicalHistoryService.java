/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.ClinicalHistory;
import java.util.HashMap;
import java.util.Map;

public class ManageClinicalHistoryService {

   

   
    public ClinicalHistory addRecordToHistory(String patientSocialSecurityNumber, String recordKey, Map<String, String> recordDetails) {
        
      
        
        System.out.println("Simulando la adición de un registro al historial clínico de: " + patientSocialSecurityNumber);
        
       
        ClinicalHistory history = new ClinicalHistory(patientSocialSecurityNumber);
        history.getHistory().put(recordKey, recordDetails);
        
        return history;
    }
}