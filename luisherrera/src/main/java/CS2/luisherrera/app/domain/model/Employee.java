/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import java.util.Date;

public abstract class Employee extends Person {

   
    private String role;

  
    public Employee() {
        super();
    }

    
    public Employee(String socialSecurityNumber, String fullName, String email, String phoneNumber, Date dateOfBirth, String address, String role) {
        super(socialSecurityNumber, fullName, email, phoneNumber, dateOfBirth, address);
        this.role = role;
    }

 
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}