/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.application.usecases;

import CS2.luisherrera.app.domain.model.Order;
import CS2.luisherrera.app.domain.services.CreateOrderService;

public class OrderUseCase {

    
    private CreateOrderService createOrderService;

   
    public OrderUseCase(CreateOrderService createOrderService) {
        this.createOrderService = createOrderService;
    }

    public Order createOrder(String patientSocialSecurityNumber, String doctorSocialSecurityNumber, String orderType) {
       
        return createOrderService.createOrder(patientSocialSecurityNumber, doctorSocialSecurityNumber, orderType);
    }
}
