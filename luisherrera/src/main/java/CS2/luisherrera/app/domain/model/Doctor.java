/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package CS2.luisherrera.app.domain.model;

import CS2.luisherrera.app.domain.model.emuns.Role;
import java.util.Date;

public class Doctor {

    private Employee employee; 
    private String medicalSpecialization;
    private String medicalLicenseNumber;
    private double consultationFee;
    private boolean isAcceptingNewPatients;

    public Doctor(String fullName, String socialSecurityNumber, Date hireDate, String medicalSpecialization, String medicalLicenseNumber, double consultationFee, boolean isAcceptingNewPatients) {
        this.employee = new Employee(fullName, socialSecurityNumber, hireDate, Role.DOCTOR);
        this.medicalSpecialization = medicalSpecialization;
        this.medicalLicenseNumber = medicalLicenseNumber;
        this.consultationFee = consultationFee;
        this.isAcceptingNewPatients = isAcceptingNewPatients;
    }

   
    public Employee getEmployee() {
        return this.employee;
    }
    
    public String getSocialSecurityNumber() {
        return this.employee.getSocialSecurityNumber();
    }
    
    
    public String getMedicalSpecialization() { return medicalSpecialization; }
    public String getMedicalLicenseNumber() { return medicalLicenseNumber; }
    public double getConsultationFee() { return consultationFee; }
    public boolean isAcceptingNewPatients() { return isAcceptingNewPatients; }

    public void setMedicalSpecialization(String medicalSpecialization) { this.medicalSpecialization = medicalSpecialization; }
    public void setMedicalLicenseNumber(String medicalLicenseNumber) { this.medicalLicenseNumber = medicalLicenseNumber; }
    public void setConsultationFee(double consultationFee) { this.consultationFee = consultationFee; }
    public void setAcceptingNewPatients(boolean isAcceptingNewPatients) { this.isAcceptingNewPatients = isAcceptingNewPatients; }
}