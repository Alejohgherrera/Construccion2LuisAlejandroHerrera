/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.Employee;
import CS2.luisherrera.app.domain.model.Doctor;
import CS2.luisherrera.app.domain.model.Nurse;
import CS2.luisherrera.app.domain.model.emuns.Role;
import CS2.luisherrera.infrastructure.persistence.repositories.EmployeeRepository;

public class ManageEmployeeService {

    private EmployeeRepository employeeRepository;

    public ManageEmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

   
    public Employee create(Object employee) throws Exception {
        if (employee instanceof Doctor) {
            Doctor doctor = (Doctor) employee;
            return employeeRepository.save(doctor.getEmployee()); 
        } else if (employee instanceof Nurse) {
            Nurse nurse = (Nurse) employee;
            return employeeRepository.save(nurse.getEmployee()); 
        } else {
            throw new Exception("Tipo de empleado no soportado.");
        }
    }
}