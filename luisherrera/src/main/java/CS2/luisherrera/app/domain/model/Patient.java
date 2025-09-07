/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    
package CS2.luisherrera.app.domain.model;

import java.util.UUID;
import java.util.Date;
import java.util.Map;

public class Patient {

    private UUID id;
    private String fullName;
    private String socialSecurityNumber;
    private String birthDate; 
    private String address;

    
    public Patient(String fullName, String socialSecurityNumber, String birthDate, String address) {
        this.id = UUID.randomUUID();
        this.fullName = fullName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
        this.address = address;
    }

    public Patient(String name, String socialSecurityNumber) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public String getFullName() { return fullName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }
    
}