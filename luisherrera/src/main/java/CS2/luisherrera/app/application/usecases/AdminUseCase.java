/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.application.usecases;

import CS2.luisherrera.app.domain.model.Employee;
import CS2.luisherrera.app.domain.model.emuns.Role;
import CS2.luisherrera.app.domain.services.ManageEmployeeService;

public class AdminUseCase {

    
    private ManageEmployeeService manageEmployeeService;

    
    public AdminUseCase(ManageEmployeeService manageEmployeeService) {
        this.manageEmployeeService = manageEmployeeService;
    }

    public Employee createEmployee(Employee employee, Role role) throws Exception {
        if (employee == null) {
            throw new IllegalArgumentException("El empleado no puede ser nulo.");
        }
        
        employee.setPosition(role);
        
        return manageEmployeeService.createEmployee(
            employee.getFullName(), 
            employee.getSocialSecurityNumber(), 
            employee.getHireDate(), 
            employee.getPosition());
    }

    public Employee findEmployeeBySocialSecurityNumber(String socialSecurityNumber) throws Exception {
        return manageEmployeeService.findEmployeeBySocialSecurityNumber(socialSecurityNumber);
    }
}