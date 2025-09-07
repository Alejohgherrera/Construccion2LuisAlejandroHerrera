/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.builder;

import CS2.luisherrera.app.adapter.in.validators.PersonValidator;
import CS2.luisherrera.app.adapter.in.validators.SimpleValidator;
import CS2.luisherrera.app.domain.model.Nurse;
import java.util.Date;

public class NurseBuilder extends SimpleValidator {
    
    private PersonValidator personValidator;

    public NurseBuilder() {
        this.personValidator = new PersonValidator();
    }
    
    public Nurse build(String fullName, String socialSecurityNumber, String hireDate, String certification, String shift) throws Exception {
        
        personValidator.validate(fullName, socialSecurityNumber);
        stringValidator("fecha de contratacion", hireDate);
        stringValidator("certificacion", certification);
        stringValidator("turno", shift);
        
        System.out.println("Generando enfermera...");
        
        return new Nurse(fullName, socialSecurityNumber, new Date(), certification, shift);
    }
}