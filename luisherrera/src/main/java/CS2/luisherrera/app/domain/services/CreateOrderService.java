/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.Order;
import CS2.luisherrera.app.domain.model.Patient;
import CS2.luisherrera.app.domain.model.Doctor;


public class CreateOrderService {

    

    public Order createOrder(String patientSocialSecurityNumber, String doctorSocialSecurityNumber, String orderType) {
        
        
        
        System.out.println("Se ha creado y guardado la orden de tipo: " + orderType);
        
     
        
        Patient patient = new Patient("Juan Perez", "12345678", null, null);
        Doctor doctor = new Doctor(null, "Medicina General", "1234", 15.0, true);
        Order newOrder = new Order(patient, doctor, orderType);
        
        return newOrder;
    }
}