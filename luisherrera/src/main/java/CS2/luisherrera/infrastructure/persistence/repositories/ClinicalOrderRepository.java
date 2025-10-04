/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CS2.luisherrera.infrastructure.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import CS2.luisherrera.app.domain.model.ClinicalOrder; // Importación corregida

@Repository
public interface ClinicalOrderRepository extends JpaRepository<ClinicalOrder, Long> {
}
