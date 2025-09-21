/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.builder;

import CS2.luisherrera.app.domain.model.Doctor;
import CS2.luisherrera.persistence.entities.DoctorEntity;
import org.springframework.stereotype.Component;

@Component
public class DoctorBuilder {

    public static Doctor toDomain(DoctorEntity entity) {
        if (entity == null) {
            return null;
        }

        return new Doctor(
                entity.getName(),
                entity.getSocialSecurityNumber(),
                entity.getMedicalSpecialization(),
                entity.getMedicalLicenseNumber()
        );
    }

    public Doctor build(String fullName, String socialSecurityNumber, String medicalSpecialization, String medicalLicenseNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}