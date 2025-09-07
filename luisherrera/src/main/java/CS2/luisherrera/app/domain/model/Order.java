/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import java.util.Date;
import java.util.UUID;

public class Order {

    private UUID id;
    private String patientSocialSecurityNumber; 
    private String doctorSocialSecurityNumber;   
    private String orderType;
    private Date creationDate;

    
    public Order(String patientSocialSecurityNumber, String doctorSocialSecurityNumber, String orderType) {
        this.id = UUID.randomUUID();
        this.patientSocialSecurityNumber = patientSocialSecurityNumber;
        this.doctorSocialSecurityNumber = doctorSocialSecurityNumber;
        this.orderType = orderType;
        this.creationDate = new Date();
    }
    
    
    public String getPatientSocialSecurityNumber() { return patientSocialSecurityNumber; }
    public String getDoctorSocialSecurityNumber() { return doctorSocialSecurityNumber; }
    public String getOrderType() { return orderType; }
    
    
}