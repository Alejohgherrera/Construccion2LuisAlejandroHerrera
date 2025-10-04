/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.infrastructure.persistence.repositories;

import CS2.luisherrera.app.domain.model.Employee;

public interface EmployeeRepository {
    Employee save(Employee employee);
    Employee findBySocialSecurityNumber(String socialSecurityNumber);
   
}