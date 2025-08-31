/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.builder;

import CS2.luisherrera.app.adapter.in.validators.SimpleValidator;
import CS2.luisherrera.app.domain.model.ClinicalHistory;
import java.util.Map;

public class ClinicalHistoryBuilder extends SimpleValidator {

    public ClinicalHistory build(String patientSocialSecurityNumber, String recordKey, Map<String, String> recordDetails) throws Exception {
        
        stringValidator("cédula del paciente", patientSocialSecurityNumber);
        stringValidator("clave del registro", recordKey);
        
        if (recordDetails == null || recordDetails.isEmpty()) {
            throw new Exception("Los detalles del registro no pueden estar vacíos.");
        }
        
        System.out.println("Construyendo el objeto ClinicalHistory...");
        
       
        ClinicalHistory history = new ClinicalHistory(patientSocialSecurityNumber);
        history.getHistory().put(recordKey, recordDetails);
        
        return history;
    }
}