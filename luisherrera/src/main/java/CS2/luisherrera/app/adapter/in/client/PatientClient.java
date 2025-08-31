/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.client;

import java.util.Scanner;
import CS2.luisherrera.app.adapter.in.builder.PatientBuilder;
import CS2.luisherrera.app.application.usecases.PatientUseCase;
import CS2.luisherrera.app.domain.model.Patient;

public class PatientClient {

    private static final String MENU = "Ingrese una de las opciones \n 1. para registrar un paciente \n 2. para salir";
    private static Scanner reader = new Scanner(System.in);
    private PatientUseCase patientUseCase;
    private PatientBuilder patientBuilder;

    
    public PatientClient(PatientUseCase patientUseCase, PatientBuilder patientBuilder) {
        this.patientUseCase = patientUseCase;
        this.patientBuilder = patientBuilder;
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
                    Patient patient = readPatientInfo();
                    patientUseCase.registerPatient(patient);
                    System.out.println("Paciente registrado con exito!");
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

    private Patient readPatientInfo() throws Exception {
        System.out.println("ingrese el nombre del paciente");
        String name = reader.nextLine();
        System.out.println("ingrese la cedula del paciente");
        String document = reader.nextLine();
        return patientBuilder.build(name, document);
    }
}