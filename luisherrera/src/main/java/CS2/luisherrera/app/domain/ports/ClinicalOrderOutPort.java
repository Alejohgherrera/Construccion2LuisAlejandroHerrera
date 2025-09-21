/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.ports.out;

import CS2.luisherrera.app.domain.model.ClinicalOrder;

/**
 * Puerto de salida (Out Port) para la persistencia de ClinicalOrder.
 * Esta interfaz define el contrato que la capa de infraestructura debe implementar
 * para guardar y gestionar los datos de las órdenes clínicas.
 */
public interface ClinicalOrderOutPort {

    /**
     * Guarda una orden clínica en la base de datos.
     *
     * @param clinicalOrder La orden clínica a ser guardada.
     * @return La orden clínica guardada, posiblemente con un ID asignado.
     */
    ClinicalOrder save(ClinicalOrder clinicalOrder);
}
