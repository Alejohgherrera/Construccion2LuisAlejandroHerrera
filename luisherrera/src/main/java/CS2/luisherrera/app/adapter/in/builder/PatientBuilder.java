/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.builder;

import CS2.luisherrera.app.adapter.in.validators.PersonValidator;
import CS2.luisherrera.app.adapter.in.validators.SimpleValidator;
import CS2.luisherrera.app.domain.model.Patient;

/**
 * Clase constructora (Builder) para el modelo de dominio Patient.
 * Se encarga de construir un objeto Patient a partir de datos de entrada,
 * realizando las validaciones necesarias.
 */
public class PatientBuilder extends SimpleValidator {

    private final PersonValidator personValidator;

    public PatientBuilder() {
        this.personValidator = new PersonValidator();
    }

    /**
     * Construye un objeto Patient con los datos proporcionados.
     * @param fullName El nombre completo del paciente.
     * @param lastName El apellido del paciente.
     * @param phoneNumber El número de teléfono del paciente.
     * @param address La dirección del paciente.
     * @param disease La enfermedad que padece el paciente.
     * @param socialSecurityNumber El número de seguridad social del paciente.
     * @return Un objeto Patient construido.
     * @throws Exception Si algún dato de entrada es inválido.
     */
    public Patient build(String fullName, String lastName, String phoneNumber, String address, String disease, String socialSecurityNumber) throws Exception {

        // Validación de datos básicos de la persona
        personValidator.validate(fullName, socialSecurityNumber);
        
        // Validación de cadenas
        stringValidator("apellido", lastName);
        stringValidator("número de teléfono", phoneNumber);
        stringValidator("dirección", address);
        stringValidator("enfermedad", disease);
        
        System.out.println("Construyendo el objeto Patient...");

        // Crear y retornar el objeto Patient
        return new Patient(fullName, lastName, phoneNumber, address, disease, socialSecurityNumber);
    }
}