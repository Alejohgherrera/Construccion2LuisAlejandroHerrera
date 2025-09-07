/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.Doctor;
import CS2.luisherrera.app.domain.model.Order;
import CS2.luisherrera.app.domain.model.Patient;
import CS2.luisherrera.app.domain.model.emuns.Role;
import CS2.luisherrera.app.domain.repositories.OrderRepository;


public class CreateOrderService {
    private OrderRepository orderRepository;
    private GetPatientService getPatientService;
    private GetDoctorService getDoctorService;
    private GetServiceTypeService getServiceTypeService;

    public CreateOrderService(OrderRepository orderRepository, GetPatientService getPatientService, GetDoctorService getDoctorService, GetServiceTypeService getServiceTypeService) {
        this.orderRepository = orderRepository;
        this.getPatientService = getPatientService;
        this.getDoctorService = getDoctorService;
        this.getServiceTypeService = getServiceTypeService;
    }

    
    public Order create(String patientId, String doctorId, String service) throws Exception {
  
        Patient patient = getPatientService.getPatient(patientId);
        Doctor doctor = getDoctorService.getDoctor(doctorId);

        if (patient == null) {
            throw new Exception("El paciente no ha sido encontrado");
        }

        if (doctor == null) {
            throw new Exception("El doctor no ha sido encontrado");
        }

        Order order = new Order(patient.getSocialSecurityNumber(), doctor.getSocialSecurityNumber(), service);

        return orderRepository.save(order);
    }
}

