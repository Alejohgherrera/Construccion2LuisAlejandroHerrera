/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.repositories;

import CS2.luisherrera.app.domain.model.Order;

public interface OrderRepository {
    Order save(Order order);
    
}