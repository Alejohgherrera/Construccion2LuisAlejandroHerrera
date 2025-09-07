/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import CS2.luisherrera.app.domain.model.emuns.Role;
import java.util.Date;

public class Nurse {

    private Employee employee;
    private String certification;
    private String shift;

    public Nurse(String fullName, String socialSecurityNumber, Date hireDate, String certification, String shift) {
        this.employee = new Employee(fullName, socialSecurityNumber, hireDate, Role.NURSE);
        this.certification = certification;
        this.shift = shift;
    }
    
    // Getters y Setters
    public Employee getEmployee() {
        return employee;
    }

    public String getCertification() {
        return certification;
    }

    public String getShift() {
        return shift;
    }
}