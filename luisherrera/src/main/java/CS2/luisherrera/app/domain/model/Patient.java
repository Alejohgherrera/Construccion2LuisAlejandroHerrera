/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

    
package CS2.luisherrera.app.domain.model;

/**
 * Clase de dominio que representa a un paciente.
 * 
 */
public class Patient {

    private String name;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String disease;
    private String socialSecurityNumber;

    // Constructor para ser utilizado por el PatientBuilder
    public Patient(String name, String lastName, String phoneNumber, String address, String disease, String socialSecurityNumber) {
        this.name = name;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.disease = disease;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Nuevo constructor para ser utilizado por el GetPatientService
    public Patient(String name, String socialSecurityNumber) {
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getDisease() {
        return disease;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getFullName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
