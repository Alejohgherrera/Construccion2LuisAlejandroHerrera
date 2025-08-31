/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.builder;

import CS2.luisherrera.app.adapter.in.validators.PersonValidator;
import CS2.luisherrera.app.adapter.in.validators.SimpleValidator;
import CS2.luisherrera.app.domain.model.Employee;

import java.util.Date;

public class EmployeeBuilder extends SimpleValidator {

   
    private PersonValidator personValidator;

    public EmployeeBuilder() {
        this.personValidator = new PersonValidator();
    }

    public Employee build(String fullName, String socialSecurityNumber, String hireDate) throws Exception {
        
        
        personValidator.validate(fullName, socialSecurityNumber);
        
        
        stringValidator("fecha de contratacion", hireDate);
        
      
        System.out.println("Construyendo el objeto Employee...");
        
     
        return new Employee(fullName, socialSecurityNumber, new Date(), null);
    }
}