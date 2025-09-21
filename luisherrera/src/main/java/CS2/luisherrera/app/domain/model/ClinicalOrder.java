/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Modelo de Dominio que representa una orden clínica.
 * Esta clase también está marcada como una Entidad JPA, mapeada a una tabla de la base de datos.
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class ClinicalOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String patientId;
    private String doctorId;
    private String orderText;
    private LocalDateTime createdAt;

    // Constructor para inicializar los datos de la orden
    public ClinicalOrder(String patientId, String doctorId, String orderText) {
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.orderText = orderText;
        this.createdAt = LocalDateTime.now(); // Se establece la fecha y hora de creación automáticamente
    }
}