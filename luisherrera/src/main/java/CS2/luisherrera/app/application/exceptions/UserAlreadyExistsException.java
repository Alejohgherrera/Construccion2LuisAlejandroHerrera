/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.application.exceptions;

/**
 * Excepción de la capa de Aplicación para manejar casos donde se intenta registrar un
 * usuario con un nombre de usuario o correo electrónico que ya existe.
 */
public class UserAlreadyExistsException extends RuntimeException {

    /**
     * Constructor que acepta el mensaje de error específico.
     * @param message Mensaje detallando qué campo causó el conflicto (e.g., "Username ya existe").
     */
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}