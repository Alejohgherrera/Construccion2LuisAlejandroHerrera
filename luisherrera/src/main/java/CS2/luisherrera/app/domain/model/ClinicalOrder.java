/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import java.util.Objects;
import java.util.UUID;

/**
 * Entidad de dominio que representa una orden clínica en el sistema.
 * Es la pieza central del modelo de negocio, independiente de la tecnología.
 */
public class ClinicalOrder {

    private String orderId;
    private String patientId;
    private String doctorId;
    private String orderText;

    /**
     * Constructor de la entidad. Genera un UUID para el orderId.
     * @param patientId El ID del paciente.
     * @param doctorId El ID del doctor.
     * @param orderText El texto descriptivo de la orden.
     */
    public ClinicalOrder(String patientId, String doctorId, String orderText) {
        this.orderId = UUID.randomUUID().toString(); // Genera un ID único.
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.orderText = orderText;
    }

    // Getters para acceder a los datos de la entidad
    public String getOrderId() {
        return orderId;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getOrderText() {
        return orderText;
    }

    @Override
    public String toString() {
        return "ClinicalOrder{" +
               "orderId='" + orderId + '\'' +
               ", patientId='" + patientId + '\'' +
               ", doctorId='" + doctorId + '\'' +
               ", orderText='" + orderText + '\'' +
               '}';
    }
}
