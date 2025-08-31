/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.builder;

import CS2.luisherrera.app.adapter.in.validators.SimpleValidator;
import CS2.luisherrera.app.domain.model.Order;

public class OrderBuilder extends SimpleValidator {

    public Order build(String patientSocialSecurityNumber, String doctorSocialSecurityNumber, String orderType) throws Exception {
        
        stringValidator("cedula del paciente", patientSocialSecurityNumber);
        stringValidator("cedula del doctor", doctorSocialSecurityNumber);
        stringValidator("tipo de orden", orderType);
        
        System.out.println("Construyendo el objeto Order...");
        
       
        return new Order(patientSocialSecurityNumber, doctorSocialSecurityNumber, orderType);
    }
}