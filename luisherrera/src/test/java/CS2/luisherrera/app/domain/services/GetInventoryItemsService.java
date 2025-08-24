/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.Medication;
import CS2.luisherrera.app.domain.model.Procedure;
import CS2.luisherrera.app.domain.ports.GetInventoryItemsPort;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GetInventoryItemsService implements GetInventoryItemsPort {

    private List<Medication> medications = new ArrayList<>();
    private List<Procedure> procedures = new ArrayList<>();

    @Override
    public List<Medication> getAllMedications() {
        System.out.println("Ejecutando servicio de Inventario: Obteniendo todos los medicamentos.");
        return medications;
    }

    @Override
    public List<Procedure> getAllProcedures() {
        System.out.println("Ejecutando servicio de Inventario: Obteniendo todos los procedimientos.");
        return procedures;
    }
}