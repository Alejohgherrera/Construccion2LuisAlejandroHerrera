/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class Order {

    private String orderNumber;
    private String patientId;
    private String doctorId;
    private Date creationDate;

    private List<Medication> medicationItems;
    private List<Procedure> procedureItems;
    private List<DiagnosticAid> diagnosticAidItems;

    
    public Order(String orderNumber, String patientId, String doctorId, Date creationDate) {
        this.orderNumber = orderNumber;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.creationDate = creationDate;
        this.medicationItems = new ArrayList<>();
        this.procedureItems = new ArrayList<>();
        this.diagnosticAidItems = new ArrayList<>();
    }

   
    public String getOrderNumber() { return orderNumber; }
    public String getPatientId() { return patientId; }
    public String getDoctorId() { return doctorId; }
    public Date getCreationDate() { return creationDate; }
    public List<Medication> getMedicationItems() { return medicationItems; }
    public List<Procedure> getProcedureItems() { return procedureItems; }
    public List<DiagnosticAid> getDiagnosticAidItems() { return diagnosticAidItems; }

   
    public void setOrderNumber(String orderNumber) { this.orderNumber = orderNumber; }
    public void setPatientId(String patientId) { this.patientId = patientId; }
    public void setDoctorId(String doctorId) { this.doctorId = doctorId; }
    public void setCreationDate(Date creationDate) { this.creationDate = creationDate; }
    public void setMedicationItems(List<Medication> medicationItems) { this.medicationItems = medicationItems; }
    public void setProcedureItems(List<Procedure> procedureItems) { this.procedureItems = procedureItems; }
    public void setDiagnosticAidItems(List<DiagnosticAid> diagnosticAidItems) { this.diagnosticAidItems = diagnosticAidItems; }
}