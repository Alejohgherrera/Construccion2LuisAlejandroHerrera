/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import java.util.List;
import java.util.ArrayList;

public class HumanResources {

    
    private Employee employee;
    private List<String> assignedDepartments;
    private String specialization;

   
    public HumanResources(Employee employee, List<String> assignedDepartments, String specialization) {
        this.employee = employee;
        this.assignedDepartments = assignedDepartments;
        this.specialization = specialization;
    }

    
    public Employee getEmployee() { return employee; }
    public List<String> getAssignedDepartments() { return assignedDepartments; }
    public String getSpecialization() { return specialization; }

    public void setEmployee(Employee employee) { this.employee = employee; }
    public void setAssignedDepartments(List<String> assignedDepartments) { this.assignedDepartments = assignedDepartments; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
}