/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.client;

import CS2.luisherrera.app.adapter.in.builder.DoctorBuilder;
import CS2.luisherrera.app.adapter.in.builder.PatientBuilder;
import CS2.luisherrera.app.domain.model.Doctor;
import CS2.luisherrera.app.domain.model.Patient;

import java.util.Scanner;

/**
 * Clase que actúa como un cliente de interfaz de línea de comandos para
 * la gestión de la clínica. Utiliza los constructores para crear objetos
 * de dominio y simula la interacción con los servicios de la aplicación.
 */
public class AdminClient {

    private static final Scanner scanner = new Scanner(System.in);
    private final PatientBuilder patientBuilder;
    private final DoctorBuilder doctorBuilder;

    // Los servicios reales se inyectarían aquí en una aplicación Spring Boot.
    // Por ejemplo:
    // @Autowired
    // private ManagePatientService managePatientService;
    // @Autowired
    // private ManageDoctorService manageDoctorService;

    public AdminClient() {
        this.patientBuilder = new PatientBuilder();
        this.doctorBuilder = new DoctorBuilder();
    }

    /**
     * Muestra el menú principal al usuario.
     */
    public void showMenu() {
        System.out.println("--- Panel de Administración de la Clínica ---");
        System.out.println("1. Registrar nuevo paciente");
        System.out.println("2. Registrar nuevo doctor");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Inicia el cliente de administración.
     */
    public void start() {
        int option = 0;
        while (option != 3) {
            showMenu();
            try {
                option = Integer.parseInt(scanner.nextLine());
                switch (option) {
                    case 1:
                        registerPatient();
                        break;
                    case 2:
                        registerDoctor();
                        break;
                    case 3:
                        System.out.println("Saliendo del panel de administración.");
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

            // En una aplicación real, se llamaría a un servicio para guardar el paciente.
            // Ejemplo: managePatientService.save(patient);

        } catch (Exception e) {
            System.out.println("Error al registrar paciente: " + e.getMessage());
        }
    }

    /**
     * Proceso para registrar un nuevo doctor.
     */
    private void registerDoctor() {
        System.out.println("--- Registrar Nuevo Doctor ---");
        try {
            System.out.print("Ingrese nombre completo: ");
            String fullName = scanner.nextLine();
            System.out.print("Ingrese número de seguridad social: ");
            String socialSecurityNumber = scanner.nextLine();
            System.out.print("Ingrese especialización médica: ");
            String medicalSpecialization = scanner.nextLine();
            System.out.print("Ingrese número de licencia médica: ");
            String medicalLicenseNumber = scanner.nextLine();

            Doctor doctor = doctorBuilder.build(fullName, socialSecurityNumber, medicalSpecialization, medicalLicenseNumber);
            System.out.println("Doctor creado: " + doctor.getName() + " con licencia " + doctor.getMedicalLicenseNumber());

            // En una aplicación real, se llamaría a un servicio para guardar el doctor.
            // Ejemplo: manageDoctorService.save(doctor);

        } catch (Exception e) {
            System.out.println("Error al registrar doctor: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        AdminClient client = new AdminClient();
        client.start();
    }
}