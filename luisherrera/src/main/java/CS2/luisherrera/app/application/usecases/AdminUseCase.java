/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.application.usecases;

import CS2.luisherrera.app.domain.model.Doctor;
import CS2.luisherrera.app.domain.model.Nurse;
import CS2.luisherrera.app.domain.services.ManageEmployeeService;

public class AdminUseCase {

    private ManageEmployeeService manageEmployeeService;

    public AdminUseCase(ManageEmployeeService manageEmployeeService) {
        this.manageEmployeeService = manageEmployeeService;
    }

    public void createDoctor(Doctor doctor) throws Exception {
        manageEmployeeService.create(doctor);
    }

    public void createNurse(Nurse nurse) throws Exception {
        manageEmployeeService.create(nurse);
    }
}