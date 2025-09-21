/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.rest.request;

public class CreateOrderRequest {
    private String patientId;
    private String doctorId;
    private String orderText;

    public String getPatientId() {
        return patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getOrderText() {
        return orderText;
    }
}
