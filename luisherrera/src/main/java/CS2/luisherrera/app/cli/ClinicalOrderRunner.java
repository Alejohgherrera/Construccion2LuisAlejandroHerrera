/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.cli;

import CS2.luisherrera.app.domain.model.ClinicalOrder;
import CS2.luisherrera.app.domain.services.ClinicalOrderService; // <<--- ¡IMPORTANTE! Se corrigió la ruta del Service
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * Componente CLI que se ejecuta después de que Spring inicializa la aplicación.
 * Proporciona un menú interactivo para gestionar las Órdenes Clínicas.
 */
@Component
public class ClinicalOrderRunner implements CommandLineRunner {

    private final ClinicalOrderService clinicalOrderService;
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Inyección de dependencias (constructor). Spring ahora inyectará
     * la instancia de ClinicalOrderService que se definió con @Service
     * en el paquete correcto.
     * @param clinicalOrderService El servicio de dominio.
     */
    public ClinicalOrderRunner(ClinicalOrderService clinicalOrderService) {
        this.clinicalOrderService = clinicalOrderService;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n=======================================================");
        System.out.println("--- Sistema de Gestión de Órdenes Clínicas (CLI) ---");
        System.out.println("=======================================================");

        // Inicializa datos de prueba si la base de datos está vacía.
        initializeDemoData();

        int option;
        do {
            showMenu();
            try {
                if (scanner.hasNextInt()) {
                    option = scanner.nextInt();
                    scanner.nextLine(); // Consumir nueva línea
                    processOption(option);
                } else {
                    System.out.println("\n[ERROR] Entrada inválida. Por favor, ingrese un número.");
                    scanner.nextLine();
                    option = -1; // Mantener el bucle
                }
            } catch (Exception e) {
                System.out.println("\n[ERROR] Ocurrió un error inesperado: " + e.getMessage());
                scanner.nextLine();
                option = -1;
            }
        } while (option != 0);

        System.out.println("\nSaliendo del sistema. ¡Adiós!");
        scanner.close();
    }

    private void showMenu() {
        System.out.println("\n-----------------------------------------------------");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Crear nueva orden clínica");
        System.out.println("2. Ver todas las órdenes clínicas");
        System.out.println("3. Buscar orden por ID");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }

    private void processOption(int option) {
        switch (option) {
            case 1:
                createOrderInteractive();
                break;
            case 2:
                listAllOrders();
                break;
            case 3:
                findOrderByIdInteractive();
                break;
            case 0:
                break;
            default:
                System.out.println("\n[ADVERTENCIA] Opción no reconocida. Intente de nuevo.");
        }
    }

    private void createOrderInteractive() {
        System.out.println("\n--- Creando Nueva Orden ---");
        System.out.print("Ingrese ID del paciente (ej: PAT-003): ");
        String patientId = scanner.nextLine();
        System.out.print("Ingrese descripción de la orden (ej: Glucosa en ayunas): ");
        String description = scanner.nextLine();

        if (!patientId.trim().isEmpty() && !description.trim().isEmpty()) {
            // El constructor con 2 String funciona ahora gracias a la corrección anterior
            ClinicalOrder newOrder = new ClinicalOrder(patientId, description);
            ClinicalOrder savedOrder = clinicalOrderService.createOrder(newOrder);
            System.out.println("\n[ÉXITO] Orden creada y guardada con ID: " + savedOrder.getId());
        } else {
            System.out.println("\n[ERROR] El ID del paciente y la descripción no pueden estar vacíos.");
        }
    }

    private void listAllOrders() {
        System.out.println("\n--- Listado de Todas las Órdenes Clínicas ---");
        List<ClinicalOrder> orders = clinicalOrderService.findAllOrders();
        if (orders.isEmpty()) {
            System.out.println("[INFO] No hay órdenes clínicas registradas.");
        } else {
            orders.forEach(order -> System.out.println(
                "#" + order.getId() +
                " | Paciente: " + order.getPatientId() +
                " | Descripción: " + order.getDescription()
            ));
        }
    }

    private void findOrderByIdInteractive() {
        System.out.println("\n--- Buscar Orden por ID ---");
        System.out.print("Ingrese el ID de la orden a buscar: ");
        try {
            // Lee el ID como String y lo convierte a Long
            Long id = Long.parseLong(scanner.nextLine()); 

            Optional<ClinicalOrder> order = clinicalOrderService.findOrderById(id);
            if (order.isPresent()) {
                System.out.println("\n[ÉXITO] Orden encontrada: " + order.get());
            } else {
                System.out.println("\n[ADVERTENCIA] No se encontró ninguna orden con el ID: " + id);
            }
        } catch (NumberFormatException e) {
            System.out.println("\n[ERROR] ID debe ser un número entero válido.");
        }
    }

    /**
     * Inicializa datos de prueba.
     */
    private void initializeDemoData() {
        // Solo inicializa si la tabla está vacía para no duplicar en cada reinicio
        if (clinicalOrderService.findAllOrders().isEmpty()) {
            clinicalOrderService.createOrder(new ClinicalOrder("PAT-001", "Hemograma completo urgente."));
            clinicalOrderService.createOrder(new ClinicalOrder("PAT-002", "Radiografía de tórax frontal y lateral."));
            System.out.println("[INFO] Se cargaron 2 órdenes de ejemplo en la base de datos.");
        }
    }
}