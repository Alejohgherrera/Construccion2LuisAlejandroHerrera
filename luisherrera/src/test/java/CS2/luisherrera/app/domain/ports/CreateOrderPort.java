/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CS2.luisherrera.app.domain.ports;

import CS2.luisherrera.app.domain.model.Order;
import java.util.Map;

public interface CreateOrderPort {

    Order createOrder(String patientSocialSecurityNumber, String doctorSocialSecurityNumber, String orderType, Map<String, Object> orderDetails);
}