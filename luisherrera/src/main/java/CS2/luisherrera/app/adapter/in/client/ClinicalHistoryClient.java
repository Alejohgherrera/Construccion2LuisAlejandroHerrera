/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.client;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import CS2.luisherrera.app.adapter.in.builder.ClinicalHistoryBuilder;
import CS2.luisherrera.app.application.usecases.ClinicalHistoryUseCase;

public class ClinicalHistoryClient {

    private static final String MENU = "Ingrese una de las opciones \n 1. para agregar un registro al historial clínico \n 2. para salir";
    private static Scanner reader = new Scanner(System.in);
    private ClinicalHistoryUseCase clinicalHistoryUseCase;
    private ClinicalHistoryBuilder clinicalHistoryBuilder;

    
    public ClinicalHistoryClient(ClinicalHistoryUseCase clinicalHistoryUseCase, ClinicalHistoryBuilder clinicalHistoryBuilder) {
        this.clinicalHistoryUseCase = clinicalHistoryUseCase;
        this.clinicalHistoryBuilder = clinicalHistoryBuilder;
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
                    String patientDocument = readDocumentInfo();
                    String recordKey = readRecordKeyInfo();
                    Map<String, String> recordDetails = readRecordDetails();
                    
                    clinicalHistoryUseCase.addRecordToHistory(patientDocument, recordKey, recordDetails);
                    System.out.println("Registro agregado al historial con exito!");
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

    private String readDocumentInfo() {
        System.out.println("ingrese la cedula del paciente");
        return reader.nextLine();
    }
    
    private String readRecordKeyInfo() {
        System.out.println("ingrese la clave del registro (ej. Consulta 1, Examen de sangre)");
        return reader.nextLine();
    }

    private Map<String, String> readRecordDetails() {
        Map<String, String> details = new HashMap<>();
        System.out.println("Ingrese los detalles del registro (escriba 'fin' para terminar):");
        String line;
        while (true) {
            line = reader.nextLine();
            if (line.equalsIgnoreCase("fin")) {
                break;
            }
            // Suponiendo que los detalles se ingresan como "clave:valor"
            String[] parts = line.split(":", 2);
            if (parts.length == 2) {
                details.put(parts[0].trim(), parts[1].trim());
            } else {
                System.out.println("Formato incorrecto. Use 'clave:valor'.");
            }
        }
        return details;
    }
}