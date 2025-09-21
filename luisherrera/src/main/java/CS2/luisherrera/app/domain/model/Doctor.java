/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package CS2.luisherrera.app.domain.model;

/**
 * Modelo de dominio para un doctor.
 * Esta clase es el objeto de negocio, es independiente de la persistencia.
 */
public class Doctor {
    private String fullName;
    private String socialSecurityNumber;
    private String medicalSpecialization;
    private String medicalLicenseNumber;

    public Doctor(String fullName, String socialSecurityNumber, String medicalSpecialization, String medicalLicenseNumber) {
        this.fullName = fullName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.medicalSpecialization = medicalSpecialization;
        this.medicalLicenseNumber = medicalLicenseNumber;
    }

    public Doctor(String name, String socialSecurityNumber, Object object, String medicalSpecialization, String medicalLicenseNumber, double d, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters y Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getMedicalSpecialization() {
        return medicalSpecialization;
    }

    public void setMedicalSpecialization(String medicalSpecialization) {
        this.medicalSpecialization = medicalSpecialization;
    }

    public String getMedicalLicenseNumber() {
        return medicalLicenseNumber;
    }

    public void setMedicalLicenseNumber(String medicalLicenseNumber) {
        this.medicalLicenseNumber = medicalLicenseNumber;
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Employee getEmployee() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
