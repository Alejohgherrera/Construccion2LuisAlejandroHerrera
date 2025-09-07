/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.Doctor;
import CS2.luisherrera.app.domain.repositories.EmployeeRepository;

public class GetDoctorService {

    private EmployeeRepository employeeRepository;

    public GetDoctorService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Doctor getDoctor(String socialSecurityNumber) {
      
        return null; 
    }
}