 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import java.util.HashMap;
import java.util.Map;

public class ClinicalHistory {

    private String patientSocialSecurityNumber;
    private Map<String, Map<String, String>> history;

   
    public ClinicalHistory() {
        this.history = new HashMap<>();
    }

    
    public ClinicalHistory(String patientSocialSecurityNumber) {
        this.patientSocialSecurityNumber = patientSocialSecurityNumber;
        this.history = new HashMap<>();
    }

    
    public String getPatientSocialSecurityNumber() {
        return patientSocialSecurityNumber;
    }

    public Map<String, Map<String, String>> getHistory() {
        return history;
    }

    
    public void setPatientSocialSecurityNumber(String patientSocialSecurityNumber) {
        this.patientSocialSecurityNumber = patientSocialSecurityNumber;
    }

    public void setHistory(Map<String, Map<String, String>> history) {
        this.history = history;
    }
}
