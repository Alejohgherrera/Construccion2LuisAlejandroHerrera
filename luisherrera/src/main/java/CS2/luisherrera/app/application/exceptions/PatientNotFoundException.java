/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.application.exceptions;

/**
 * Excepción personalizada para manejar el caso en que un paciente no es encontrado.
 * Esto ayuda a la capa de servicio a comunicar errores de negocio específicos.
 */
public class PatientNotFoundException extends RuntimeException {

    public PatientNotFoundException(String message) {
        super(message);
    }
}
