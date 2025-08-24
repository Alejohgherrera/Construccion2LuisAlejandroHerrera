/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CS2.luisherrera.app.domain.ports;

import CS2.luisherrera.app.domain.model.Employee;
import java.util.List;

public interface ManageEmployeePort {

    Employee addEmployee(Employee employee);

    Employee updateEmployee(String socialSecurityNumber, Employee employeeDetails);

    void removeEmployee(String socialSecurityNumber);

    List<Employee> getAllEmployees();

    Employee getEmployeeBySocialSecurityNumber(String socialSecurityNumber);
}
