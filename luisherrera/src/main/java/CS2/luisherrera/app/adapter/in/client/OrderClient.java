/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.client;

import java.util.Scanner;
import CS2.luisherrera.app.adapter.in.builder.OrderBuilder;
import CS2.luisherrera.app.application.usecases.OrderUseCase;
import CS2.luisherrera.app.domain.model.Order;

public class OrderClient {
    private static final String MENU = "Ingrese una de las opciones \n 1. para crear una orden \n 2. para salir";
    private static Scanner reader = new Scanner(System.in);
    private OrderUseCase orderUseCase;
    private OrderBuilder orderBuilder;

    public OrderClient(OrderUseCase orderUseCase, OrderBuilder orderBuilder) {
        this.orderUseCase = orderUseCase;
        this.orderBuilder = orderBuilder;
    }

    public void session() {
        boolean session = true;
        while (session) {
            session = menu();
        }
    }

    private boolean menu() {
        try {
            System.out.println(MENU);
            String option = reader.nextLine();
            switch (option) {
                case "1": {
                    Order order = readOrderInfo();
                   
                    orderUseCase.create(order.getPatientSocialSecurityNumber(), order.getDoctorSocialSecurityNumber(), order.getOrderType());
                    System.out.println("Orden creada con exito!");
                    return true;
                }
                case "2": {
                    System.out.println("Hasta luego \n cerrando sesion");
                    return false;
                }
                default: {
                    System.out.println("Ingrese una opcion valida");
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return true;
        }
    }
    
    private Order readOrderInfo() throws Exception {
        System.out.println("ingrese la cedula del paciente");
        String patientDocument = reader.nextLine();
        System.out.println("ingrese la cedula del doctor");
        String doctorDocument = reader.nextLine();
        System.out.println("ingrese el tipo de orden");
        String orderType = reader.nextLine();
        return orderBuilder.build(patientDocument, doctorDocument, orderType);
    }
}