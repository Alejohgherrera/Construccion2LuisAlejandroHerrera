/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ad
 */
package CS2.luisherrera.app.infrastructure;

import CS2.luisherrera.app.domain.model.Employee;
import CS2.luisherrera.app.domain.repositories.EmployeeRepository;
import java.util.HashMap;
import java.util.Map;

public class InMemoryEmployeeRepository implements EmployeeRepository {

    private Map<String, Employee> employees = new HashMap<>();

    @Override
    public Employee save(Employee employee) {
        employees.put(employee.getSocialSecurityNumber(), employee);
        return employee;
    }

    @Override
    public Employee findBySocialSecurityNumber(String socialSecurityNumber) {
        return employees.get(socialSecurityNumber);
    }
}