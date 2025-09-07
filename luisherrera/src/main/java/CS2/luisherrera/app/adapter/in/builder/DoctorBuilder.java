/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.builder;

import CS2.luisherrera.app.adapter.in.validators.PersonValidator;
import CS2.luisherrera.app.adapter.in.validators.SimpleValidator;
import CS2.luisherrera.app.domain.model.Doctor;
import java.util.Date;

public class DoctorBuilder extends SimpleValidator {

    private PersonValidator personValidator;

    public DoctorBuilder() {
        this.personValidator = new PersonValidator();
    }
    
    public Doctor build(String fullName, String socialSecurityNumber, String hireDate, String medicalSpecialization, String medicalLicenseNumber, String consultationFee, String isAcceptingNewPatients) throws Exception {

        personValidator.validate(fullName, socialSecurityNumber);
        stringValidator("fecha de contratacion", hireDate);
        stringValidator("especializacion medica", medicalSpecialization);
        stringValidator("numero de licencia medica", medicalLicenseNumber);
        double fee = doubleValidator("tarifa de consulta", consultationFee);
        boolean acceptingPatients = Boolean.parseBoolean(isAcceptingNewPatients);

      
        return new Doctor(fullName, socialSecurityNumber, new Date(), medicalSpecialization, medicalLicenseNumber, fee, acceptingPatients);
    }
}