/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.infrastructure.persistence.mapper;

import CS2.luisherrera.app.domain.model.Doctor;
import CS2.luisherrera.persistence.entities.DoctorEntity;
import org.springframework.stereotype.Component;

/**
 * Clase que se encarga de mapear datos entre el modelo de dominio (Doctor)
 * y la entidad de persistencia (DoctorEntity).
 */
@Component
public class DoctorMapper {

    /**
     * Convierte un objeto del modelo de dominio a una entidad de persistencia.
     * @param doctor El objeto del modelo de dominio Doctor.
     * @return La entidad de persistencia DoctorEntity.
     */
    public DoctorEntity toEntity(Doctor doctor) {
        if (doctor == null) {
            return null;
        }

        DoctorEntity entity = new DoctorEntity();
        entity.setName(doctor.getFullName());
        entity.setSocialSecurityNumber(doctor.getSocialSecurityNumber());
        entity.setMedicalSpecialization(doctor.getMedicalSpecialization());
        entity.setMedicalLicenseNumber(doctor.getMedicalLicenseNumber());
        return entity;
    }

    /**
     * Convierte una entidad de persistencia a un objeto del modelo de dominio.
     * @param entity La entidad de persistencia DoctorEntity.
     * @return El objeto del modelo de dominio Doctor.
     */
    public Doctor toDomain(DoctorEntity entity) {
        if (entity == null) {
            return null;
        }
        
        return new Doctor(
                entity.getName(),
                entity.getSocialSecurityNumber(),
                null, // La fecha de contratación no se maneja en esta capa
                entity.getMedicalSpecialization(),
                entity.getMedicalLicenseNumber(),
                0.0, // La tarifa de consulta no se maneja en esta capa
                false // Si acepta nuevos pacientes no se maneja en esta capa
        );
    }
}
