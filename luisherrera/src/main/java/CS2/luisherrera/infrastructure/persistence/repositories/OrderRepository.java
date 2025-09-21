/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CS2.luisherrera.app.domain.repositories;

import CS2.luisherrera.app.domain.model.Order;

/**
 * Interfaz del repositorio para las operaciones de persistencia de las Órdenes.
 * Define los métodos necesarios para guardar una nueva orden.
 */
public interface OrderRepository {

    /**
     * Guarda una nueva orden médica en la base de datos.
     * @param order La orden a guardar.
     * @return La orden guardada con su ID generado.
     */
    Order save(Order order);
}
