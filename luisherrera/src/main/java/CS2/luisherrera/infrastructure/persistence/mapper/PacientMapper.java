/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.infrastructure.persistence.mapper;

import CS2.luisherrera.app.domain.model.Patient;
import CS2.luisherrera.persistence.entities.PatientEntity;
import org.springframework.stereotype.Component;


@Component
public class PacientMapper {

    
    public PatientEntity toEntity(Patient patient) {
        if (patient == null) {
            return null;
        }

        PatientEntity entity = new PatientEntity();
        entity.setName(patient.getFullName());
        entity.setEmail(patient.getSocialSecurityNumber());
        return entity;
    }

  
    public Patient toDomain(PatientEntity entity) {
        if (entity == null) {
            return null;
        }
        
        return new Patient(entity.getName(), entity.getEmail());
    }
}