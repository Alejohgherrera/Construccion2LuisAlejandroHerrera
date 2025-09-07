/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CS2.luisherrera.infrastructure.persistence.repositories;

import CS2.luisherrera.persistence.entities.PatientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface SpringPacienteRepository extends JpaRepository<PatientEntity, Long> {

   
    Optional<PatientEntity> findByEmail(String email);
}
