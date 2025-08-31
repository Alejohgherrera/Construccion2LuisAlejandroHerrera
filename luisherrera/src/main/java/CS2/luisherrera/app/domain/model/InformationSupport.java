/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import java.util.List;
import java.util.ArrayList;

public class InformationSupport {

    
    private Employee employee;
    private String specialization;
    private List<String> assignedSystems;

    
    public InformationSupport(Employee employee, String specialization, List<String> assignedSystems) {
        this.employee = employee;
        this.specialization = specialization;
        this.assignedSystems = assignedSystems;
    }

    
    public Employee getEmployee() { return employee; }
    public String getSpecialization() { return specialization; }
    public List<String> getAssignedSystems() { return assignedSystems; }

    public void setEmployee(Employee employee) { this.employee = employee; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public void setAssignedSystems(List<String> assignedSystems) { this.assignedSystems = assignedSystems; }
}