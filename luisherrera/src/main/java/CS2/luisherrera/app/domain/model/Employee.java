/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import CS2.luisherrera.app.domain.model.emuns.Role;

import java.util.Date;
import java.util.UUID;

public class Employee { 

    private UUID id;
    private String fullName;
    private String socialSecurityNumber;
    private Date hireDate;
    private Role position;

    public Employee(String fullName, String socialSecurityNumber, Date hireDate, Role position) {
        this.id = UUID.randomUUID();
        this.fullName = fullName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.hireDate = hireDate;
        this.position = position;
    }

    
    public UUID getId() { return id; }
    public String getFullName() { return fullName; }
    public String getSocialSecurityNumber() { return socialSecurityNumber; }
    public Date getHireDate() { return hireDate; }
    public Role getPosition() { return position; }

    public void setPosition(Role position) { this.position = position; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public void setSocialSecurityNumber(String socialSecurityNumber) { this.socialSecurityNumber = socialSecurityNumber; }
    public void setHireDate(Date hireDate) { this.hireDate = hireDate; }
}