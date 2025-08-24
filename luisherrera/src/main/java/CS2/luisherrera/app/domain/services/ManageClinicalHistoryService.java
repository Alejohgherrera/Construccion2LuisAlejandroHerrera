/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.ClinicalHistory;
import CS2.luisherrera.app.domain.ports.ManageClinicalHistoryPort;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class ManageClinicalHistoryService implements ManageClinicalHistoryPort {

    @Override
    public ClinicalHistory getClinicalHistory(String patientSocialSecurityNumber) {
        System.out.println("Ejecutando servicio de Historia Clínica: Obteniendo historial para el paciente " + patientSocialSecurityNumber);
        return null;
    }

    @Override
    public void updateClinicalHistory(String patientSocialSecurityNumber, Map<String, String> newRecord) {
        System.out.println("Ejecutando servicio de Historia Clínica: Actualizando historial para el paciente " + patientSocialSecurityNumber);
    }
}