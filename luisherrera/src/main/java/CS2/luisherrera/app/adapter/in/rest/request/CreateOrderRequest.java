/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.rest.request;

import lombok.Getter;
import lombok.Setter;

/**
 * DTO (Data Transfer Object) para la solicitud de creación de una orden clínica.
 * Este objeto se utiliza para mapear el cuerpo de la solicitud JSON de entrada.
 */
@Getter
@Setter
public class CreateOrderRequest {
    private String patientId;
    private String doctorId;
    private String orderText;
}
