/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.builder;

import CS2.luisherrera.app.adapter.in.validators.PersonValidator;
import CS2.luisherrera.app.domain.model.Patient;

public class PatientBuilder {

   
    private PersonValidator personValidator;

    public PatientBuilder() {
        this.personValidator = new PersonValidator();
    }

    public Patient build(String fullName, String socialSecurityNumber) throws Exception {
        
       
        personValidator.validate(fullName, socialSecurityNumber);
        
      
        System.out.println("Construyendo el objeto Patient...");
        
        return new Patient(fullName, socialSecurityNumber, null, null);
    }
}