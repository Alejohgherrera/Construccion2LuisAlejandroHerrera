/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.Order;
import CS2.luisherrera.app.domain.ports.CreateOrderPort;
import org.springframework.stereotype.Service;
import java.util.Map;

@Service
public class CreateOrderService implements CreateOrderPort {

    @Override
    public Order createOrder(String patientSocialSecurityNumber, String doctorSocialSecurityNumber, String orderType, Map<String, Object> orderDetails) {
        System.out.println("Ejecutando servicio de Creación de Órdenes: Creando orden para el paciente " + patientSocialSecurityNumber);
        return null;
    }
}
