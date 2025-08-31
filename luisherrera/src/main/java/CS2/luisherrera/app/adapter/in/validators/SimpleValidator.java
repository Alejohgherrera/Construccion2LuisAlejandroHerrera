/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.validators;

public class SimpleValidator {

    public String stringValidator(String fieldName, String value) throws Exception {
        if (value == null || value.trim().isEmpty()) {
            throw new Exception("El campo '" + fieldName + "' no puede estar vacío.");
        }
        return value;
    }

    public long longValidator(String fieldName, String value) throws Exception {
        try {
            return Long.parseLong(stringValidator(fieldName, value));
        } catch (NumberFormatException e) {
            throw new Exception("El campo '" + fieldName + "' debe ser un número entero válido.");
        }
    }

    public double doubleValidator(String fieldName, String value) throws Exception {
        try {
            return Double.parseDouble(stringValidator(fieldName, value));
        } catch (NumberFormatException e) {
            throw new Exception("El campo '" + fieldName + "' debe ser un número decimal válido.");
        }
    }
}