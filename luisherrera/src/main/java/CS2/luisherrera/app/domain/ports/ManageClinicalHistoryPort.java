/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CS2.luisherrera.app.domain.ports;

import CS2.luisherrera.app.domain.model.ClinicalHistory;
import java.util.Map;

public interface ManageClinicalHistoryPort {

    ClinicalHistory getClinicalHistory(String patientSocialSecurityNumber);

    void updateClinicalHistory(String patientSocialSecurityNumber, Map<String, String> newRecord);
}