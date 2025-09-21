/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.out;

import CS2.luisherrera.app.domain.model.Patient;
import CS2.luisherrera.app.domain.repositories.PatientRepository;
import CS2.luisherrera.infrastructure.persistence.mapper.PatientMapper;
import CS2.luisherrera.infrastructure.persistence.mapper.SpringPatientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Adaptador de persistencia que implementa el repositorio de dominio.
 * Se encarga de la comunicación entre la capa de negocio y la base de datos.
 */
@Component
public class PatientAdapter implements PatientRepository {

    private final SpringPatientMapper springPatientMapper;

    @Autowired
    public PatientAdapter(SpringPatientMapper springPatientMapper) {
        this.springPatientMapper = springPatientMapper;
    }

    @Override
    public Patient save(Patient patient) {
        // Convierte el objeto de dominio a una entidad de persistencia
        PatientMapper patientMapper = toEntity(patient);
        // Guarda la entidad usando el repositorio de Spring Data JPA
        PatientMapper savedEntity = springPatientMapper.save(patientMapper);
        // Convierte la entidad guardada de nuevo a un objeto de dominio y lo retorna
        return toDomain(savedEntity);
    }

    @Override
    public Optional<Patient> findBySocialSecurityNumber(String socialSecurityNumber) {
        return Optional.ofNullable(springPatientMapper.findBySocialSecurityNumber(socialSecurityNumber))
                .map(this::toDomain);
    }

    @Override
    public List<Patient> findAll() {
        return springPatientMapper.findAll().stream()
                .map(this::toDomain)
                .collect(Collectors.toList());
    }

    /**
     * Convierte un objeto del modelo de dominio (Patient) a una entidad de persistencia (PatientMapper).
     * @param patient El objeto de dominio Patient a convertir.
     * @return La entidad de persistencia PatientMapper.
     */
    private PatientMapper toEntity(Patient patient) {
        PatientMapper entity = new PatientMapper();
        entity.setName(patient.getName());
        entity.setSocialSecurityNumber(patient.getSocialSecurityNumber());
        return entity;
    }

    /**
     * Convierte una entidad de persistencia (PatientMapper) a un objeto del modelo de dominio (Patient).
     * @param entity La entidad de persistencia PatientMapper a convertir.
     * @return El objeto de dominio Patient.
     */
    private Patient toDomain(PatientMapper entity) {
        return new Patient(entity.getName(), entity.getSocialSecurityNumber());
    }
}