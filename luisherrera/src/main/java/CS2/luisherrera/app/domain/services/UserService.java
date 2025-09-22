/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;

import CS2.luisherrera.app.domain.model.User;
import java.util.List;
import java.util.Optional;

/**
 * Interfaz de servicio para la gestión de usuarios.
 * Define las operaciones de negocio para la capa de dominio,
 * manteniendo el acoplamiento bajo y la lógica de negocio pura.
 */
public interface UserService {

    /**
     * Guarda un usuario.
     * @param user El usuario a guardar.
     * @return El usuario guardado con su ID.
     */
    User saveUser(User user);

    /**
     * Busca un usuario por su ID.
     * @param id El ID del usuario.
     * @return Un Optional que puede contener el usuario.
     */
    Optional<User> findById(Long id);

    /**
     * Obtiene una lista de todos los usuarios.
     * @return Una lista de usuarios.
     */
    List<User> findAllUsers();

    /**
     * Elimina un usuario por su ID.
     * @param id El ID del usuario a eliminar.
     */
    void deleteUser(Long id);
}