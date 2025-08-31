/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

public class Nurse {

    private Employee employee;

    private String nursingLicenseNumber;
    private String department;
    private String shift;

   
    public Nurse(Employee employee, String nursingLicenseNumber, String department, String shift) {
        this.employee = employee;
        this.nursingLicenseNumber = nursingLicenseNumber;
        this.department = department;
        this.shift = shift;
    }

   
    public Employee getEmployee() { return employee; }
    public String getNursingLicenseNumber() { return nursingLicenseNumber; }
    public String getDepartment() { return department; }
    public String getShift() { return shift; }

    public void setEmployee(Employee employee) { this.employee = employee; }
    public void setNursingLicenseNumber(String nursingLicenseNumber) { this.nursingLicenseNumber = nursingLicenseNumber; }
    public void setDepartment(String department) { this.department = department; }
    public void setShift(String shift) { this.shift = shift; }
}