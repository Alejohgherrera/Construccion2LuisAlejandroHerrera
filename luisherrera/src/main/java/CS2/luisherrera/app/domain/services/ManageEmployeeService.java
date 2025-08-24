/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.Employee;
import CS2.luisherrera.app.domain.ports.ManageEmployeePort;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ManageEmployeeService implements ManageEmployeePort {

    private List<Employee> employees = new ArrayList<>();

    @Override
    public Employee addEmployee(Employee employee) {
        System.out.println("Ejecutando servicio de Gestión de Empleados: Añadiendo al empleado " + employee.getFullName());
        employees.add(employee);
        return employee;
    }

    @Override
public Employee updateEmployee(String socialSecurityNumber, Employee employeeDetails) {
        System.out.println("Ejecutando servicio de Gestión de Empleados: Actualizando al empleado con cédula " + socialSecurityNumber);
        return null;
    }

    @Override
    public void removeEmployee(String socialSecurityNumber) {
        System.out.println("Ejecutando servicio de Gestión de Empleados: Eliminando al empleado con cédula " + socialSecurityNumber);
    }

    @Override
    public List<Employee> getAllEmployees() {
        System.out.println("Ejecutando servicio de Gestión de Empleados: Obteniendo todos los empleados.");
        return employees;
    }

    @Override
    public Employee getEmployeeBySocialSecurityNumber(String socialSecurityNumber) {
        System.out.println("Ejecutando servicio de Gestión de Empleados: Obteniendo empleado con cédula " + socialSecurityNumber);
        return null;
    }
}
