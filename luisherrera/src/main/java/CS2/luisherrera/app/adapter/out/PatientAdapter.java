/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.out;

import CS2.luisherrera.app.domain.model.Patient;
import CS2.luisherrera.app.domain.repositories.PacienteRepository;
import CS2.luisherrera.infrastructure.persistence.mapper.PacientMapper;
import CS2.luisherrera.infrastructure.persistence.repositories.SpringPacienteRepository;
import CS2.luisherrera.persistence.entities.PatientEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class PatientAdapter implements PacienteRepository {

    private final SpringPacienteRepository springPacienteRepository;
    private final PacientMapper pacientMapper;

    @Autowired
    public PatientAdapter(SpringPacienteRepository springPacienteRepository, PacientMapper pacientMapper) {
        this.springPacienteRepository = springPacienteRepository;
        this.pacientMapper = pacientMapper;
    }

    @Override
    public Optional<Patient> findByEmail(String email) {
        Optional<PatientEntity> entity = springPacienteRepository.findByEmail(email);
        return entity.map(pacientMapper::toDomain);
    }

    @Override
    public Patient save(Patient patient) {
        PatientEntity entity = pacientMapper.toEntity(patient);
        PatientEntity savedEntity = springPacienteRepository.save(entity);
        return pacientMapper.toDomain(savedEntity);
    }
}