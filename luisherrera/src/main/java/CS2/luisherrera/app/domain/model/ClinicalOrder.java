/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import java.time.LocalDate;

/**
 * Clinical Order domain model.
 * This class represents a core data entity within the application,
 * independent of any specific technology or framework.
 */
public class ClinicalOrder {

    private Long id;
    private String patientName;
    private String orderType; // e.g., "Lab Test", "Medication", "Imaging"
    private String details;
    private LocalDate creationDate;

    /**
     * Default constructor.
     */
    public ClinicalOrder() {
    }

    /**
     * Parameterized constructor to create a new ClinicalOrder object.
     *
     * @param id           The unique identifier of the order.
     * @param patientName  The name of the patient associated with the order.
     * @param orderType    The type of the clinical order.
     * @param details      Detailed description of the order.
     * @param creationDate The date when the order was created.
     */
    public ClinicalOrder(Long id, String patientName, String orderType, String details, LocalDate creationDate) {
        this.id = id;
        this.patientName = patientName;
        this.orderType = orderType;
        this.details = details;
        this.creationDate = creationDate;
    }

    public ClinicalOrder(String patientId, String doctorId, String orderText) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // --- Getters and Setters ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "ClinicalOrder{" +
                "id=" + id +
                ", patientName='" + patientName + '\'' +
                ", orderType='" + orderType + '\'' +
                ", details='" + details + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}