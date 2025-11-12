/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.client;

import CS2.luisherrera.app.adapter.in.builder.PatientBuilder;
import CS2.luisherrera.app.domain.model.Patient;

import java.util.Scanner;

/**
 * Clase que actúa como un cliente de interfaz de línea de comandos para
 * que un paciente interactúe con el sistema. Utiliza los constructores para crear
 * objetos de dominio y simula la interacción con los servicios de la aplicación.
 */
public class PatientClient {

    private static final Scanner scanner = new Scanner(System.in);
    private final PatientBuilder patientBuilder;

    

    public PatientClient() {
        this.patientBuilder = new PatientBuilder();
    }

    
    public void showMenu() {
        System.out.println("--- Portal de Pacientes ---");
        System.out.println("1. Registrar un nuevo paciente");
        System.out.println("2. Salir");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Inicia el cliente de pacientes.
     */
    public void start() {
        int option = 0;
        while (option != 2) {
            showMenu();
            try {
                option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        registerPatient();
                        break;
                    case 2:
                        System.out.println("Saliendo del portal de pacientes.");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, intente de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
            }
        }
    }

    /**
     * Proceso para registrar un nuevo paciente.
     */
    private void registerPatient() {
        System.out.println("--- Registrar Nuevo Paciente ---");
        try {
            System.out.print("Ingrese nombre completo: ");
            String fullName = scanner.nextLine();
            System.out.print("Ingrese apellido: ");
            String lastName = scanner.nextLine();
            System.out.print("Ingrese número de teléfono: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Ingrese dirección: ");
            String address = scanner.nextLine();
            System.out.print("Ingrese enfermedad: ");
            String disease = scanner.nextLine();
            System.out.print("Ingrese número de seguridad social: ");
            String socialSecurityNumber = scanner.nextLine();

            Patient patient = patientBuilder.build(fullName, lastName, phoneNumber, address, disease, socialSecurityNumber);
            System.out.println("Paciente creado: " + patient.getName() + " con NSS " + patient.getSocialSecurityNumber());

        

        } catch (Exception e) {
            System.out.println("Error al registrar paciente: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        PatientClient client = new PatientClient();
        client.start();
    }
}