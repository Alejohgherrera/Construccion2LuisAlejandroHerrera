/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import java.util.Date;

public class Patient extends Person {

  
    private String emergencyContactName;
    private String relationshipWithPatient;
    private String emergencyPhoneNumber;

    
    private String insuranceCompanyName;
    private String policyNumber;
    private boolean isPolicyActive;
    private Date policyExpirationDate;

    
    public Patient() {
        super();
    }

    
    public Patient(String socialSecurityNumber, String fullName, String email, String phoneNumber, Date dateOfBirth, String address,
                   String emergencyContactName, String relationshipWithPatient, String emergencyPhoneNumber,
                   String insuranceCompanyName, String policyNumber, boolean isPolicyActive, Date policyExpirationDate) {
        super(socialSecurityNumber, fullName, email, phoneNumber, dateOfBirth, address);
        this.emergencyContactName = emergencyContactName;
        this.relationshipWithPatient = relationshipWithPatient;
        this.emergencyPhoneNumber = emergencyPhoneNumber;
        this.insuranceCompanyName = insuranceCompanyName;
        this.policyNumber = policyNumber;
        this.isPolicyActive = isPolicyActive;
        this.policyExpirationDate = policyExpirationDate;
    }

   
    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public String getRelationshipWithPatient() {
        return relationshipWithPatient;
    }

    public void setRelationshipWithPatient(String relationshipWithPatient) {
        this.relationshipWithPatient = relationshipWithPatient;
    }

    public String getEmergencyPhoneNumber() {
        return emergencyPhoneNumber;
    }

    public void setEmergencyPhoneNumber(String emergencyPhoneNumber) {
        this.emergencyPhoneNumber = emergencyPhoneNumber;
    }

    public String getInsuranceCompanyName() {
        return insuranceCompanyName;
    }

    public void setInsuranceCompanyName(String insuranceCompanyName) {
        this.insuranceCompanyName = insuranceCompanyName;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public boolean isPolicyActive() {
        return isPolicyActive;
    }

    public void setPolicyActive(boolean policyActive) {
        isPolicyActive = policyActive;
    }

    public Date getPolicyExpirationDate() {
        return policyExpirationDate;
    }

    public void setPolicyExpirationDate(Date policyExpirationDate) {
        this.policyExpirationDate = policyExpirationDate;
    }
}