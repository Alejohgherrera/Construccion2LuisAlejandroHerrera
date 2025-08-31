/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.validators;

public class InvoiceValidator extends SimpleValidator {

    public String patientSocialSecurityNumberValidator(String value) throws Exception {
        return stringValidator("cedula del paciente", value);
    }
    
    public String doctorSocialSecurityNumberValidator(String value) throws Exception {
        return stringValidator("cedula del doctor", value);
    }
    
    public String productNameValidator(String value) throws Exception {
        return stringValidator("nombre del producto/servicio", value);
    }
    
    public double amountValidator(String value) throws Exception {
        return doubleValidator("precio de la factura", value);
    }
}