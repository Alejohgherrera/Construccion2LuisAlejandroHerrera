/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Entidad de dominio que representa una Orden Clínica.
 * Mapeada a la tabla 'clinical_orders' en la base de datos.
 * * Se corrigió el conflicto de mapeo eliminando los atributos 'name' de @Column
 * y permitiendo que Hibernate use la convención de camelCase a snake_case.
 */
@Entity
@Table(name = "clinical_orders")
public class ClinicalOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Ahora mapeará 'patientId' a la columna 'patient_id' automáticamente por convención.
    @Column(nullable = false)
    private String patientId;

    @Column(nullable = false)
    private String description;

    // Ahora mapeará 'creationDate' a la columna 'creation_date' automáticamente por convención.
    @Column(nullable = false)
    private LocalDateTime creationDate;

    // ------------------- CONSTRUCTORES -------------------

    /**
     * Constructor sin argumentos requerido por JPA (Hibernate).
     */
    protected ClinicalOrder() {
        // Requerido por la especificación JPA
    }

    /**
     * Constructor utilizado por el código de negocio para crear una nueva orden.
     * @param patientId ID del paciente asociado.
     * @param description Descripción detallada de la orden.
     */
    public ClinicalOrder(String patientId, String description) {
        this.patientId = patientId;
        this.description = description;
        this.creationDate = LocalDateTime.now(); // Inicializa la fecha de creación
    }
    
    // ------------------- GETTERS Y SETTERS -------------------

    public Long getId() {
        return id;
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

    @Override
    public String toString() {
        return "ClinicalOrder{" +
                "id=" + id +
                ", patientId='" + patientId + '\'' +
                ", description='" + description + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
