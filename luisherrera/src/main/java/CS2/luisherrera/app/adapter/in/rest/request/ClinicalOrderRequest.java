/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.rest.request;

/**
 * Clase que representa el cuerpo de la solicitud (request body)
 * para crear una nueva orden clínica.
 *
 * Se utiliza para mapear los datos JSON de la solicitud HTTP.
 */
public class ClinicalOrderRequest {
    private String patientId;
    private String doctorId;
    private String orderText;

    // Getters y setters para acceder a los campos
    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getOrderText() {
        return orderText;
    }

    public void setOrderText(String orderText) {
        this.orderText = orderText;
    }
}
