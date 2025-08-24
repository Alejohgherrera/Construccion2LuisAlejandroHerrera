/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CS2.luisherrera.app.domain.ports;

import CS2.luisherrera.app.domain.model.Medication;
import CS2.luisherrera.app.domain.model.Procedure;
import java.util.List;

public interface GetInventoryItemsPort {

    List<Medication> getAllMedications();

    List<Procedure> getAllProcedures();
}