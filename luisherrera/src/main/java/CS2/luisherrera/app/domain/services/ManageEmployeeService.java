/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.Employee;
import CS2.luisherrera.app.domain.model.emuns.Role;

import java.util.Date;


public class ManageEmployeeService {

   

    public Employee createEmployee(String fullName, String socialSecurityNumber, Date hireDate, Role position) {
        
       
        
        System.out.println("Simulando la creación de un empleado...");
        
       
        return new Employee(fullName, socialSecurityNumber, hireDate, position);
    }
    
    public Employee findEmployeeBySocialSecurityNumber(String socialSecurityNumber) {
        
       
        
        System.out.println("Simulando la búsqueda del empleado con cédula: " + socialSecurityNumber);
        
       
        return new Employee("Simulado", socialSecurityNumber, new Date(), Role.OTHER);
    }
    
    
}