/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.infrastructure.persistence.mapper;

import CS2.luisherrera.app.domain.model.Order;
import CS2.luisherrera.persistence.entities.OrderEntity;
import org.springframework.stereotype.Component;

/**
 * Clase que se encarga de mapear datos entre el modelo de dominio (Order)
 * y la entidad de persistencia (OrderEntity).
 */
@Component
public class OrderMapper {

    /**
     * Convierte un objeto del modelo de dominio a una entidad de persistencia.
     * @param order El objeto del modelo de dominio Order.
     * @return La entidad de persistencia OrderEntity.
     */
    public OrderEntity toEntity(Order order) {
        if (order == null) {
            return null;
        }

        OrderEntity entity = new OrderEntity();
       
        return entity;
    }

    /**
     * Convierte una entidad de persistencia a un objeto del modelo de dominio.
     * @param entity La entidad de persistencia OrderEntity.
     * @return El objeto del modelo de dominio Order.
     */
    public Order toDomain(OrderEntity entity) {
        if (entity == null) {
            return null;
        }

       
        return new Order();
    }
}