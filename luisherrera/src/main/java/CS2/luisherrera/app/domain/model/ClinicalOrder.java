/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

/**
 * Entidad JPA ClinicalOrder.
 * La inclusión de @Entity y @Id resuelve el error "Not a managed type".
 * Esta entidad representa una orden clínica.
 */
@Entity
@Table(name = "clinical_orders")
public class ClinicalOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String patientId;

    private String description;

    private LocalDateTime creationDate;
    
    // Constructor vacío requerido por JPA
    public ClinicalOrder() {
        this.creationDate = LocalDateTime.now();
    }
    
    // Constructor con campos mínimos para facilitar la creación de instancias
    public ClinicalOrder(String patientId, String description, String orderText) {
        this.patientId = patientId;
        this.description = description;
        this.creationDate = LocalDateTime.now();
    }

    // Getters y Setters (Necesarios para que JPA acceda a los campos)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}