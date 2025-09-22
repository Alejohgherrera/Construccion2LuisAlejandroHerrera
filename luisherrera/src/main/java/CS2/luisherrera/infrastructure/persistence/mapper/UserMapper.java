/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.infrastructure.mappers;

import CS2.luisherrera.app.domain.model.User;
import CS2.luisherrera.infrastructure.persistence.entities.UserEntity;

/**
 * Clase estática que actúa como un mapeador (mapper) para convertir
 * objetos entre el modelo de dominio (User) y la entidad de persistencia (UserEntity).
 * Centraliza la lógica de conversión para mantener un código limpio y desacoplado.
 */
public class UserMapper {

    /**
     * Convierte un objeto de la entidad de persistencia a un objeto del modelo de dominio.
     * @param entity La entidad de persistencia de usuario.
     * @return El modelo de dominio de usuario correspondiente.
     */
    public static User toDomain(UserEntity entity) {
        if (entity == null) {
            return null;
        }
        return new User(entity.getId(), entity.getName(), entity.getEmail());
    }

    /**
     * Convierte un objeto del modelo de dominio a un objeto de la entidad de persistencia.
     * @param user El modelo de dominio de usuario.
     * @return La entidad de persistencia de usuario correspondiente.
     */
    public static UserEntity toEntity(User user) {
        if (user == null) {
            return null;
        }
        UserEntity entity = new UserEntity();
        entity.setId(user.getId()); // Se usa para actualizaciones
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        return entity;
    }
}