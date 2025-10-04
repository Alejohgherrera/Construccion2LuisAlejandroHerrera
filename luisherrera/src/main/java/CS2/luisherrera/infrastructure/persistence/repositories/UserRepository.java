/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.infrastructure.persistence.repositories;

import CS2.luisherrera.app.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interfaz de repositorio para la entidad User.
 * Proporciona métodos CRUD para operaciones de base de datos.
 * Spring Data JPA crea automáticamente la implementación en tiempo de ejecución.
 *
 * @param <User> La entidad con la que trabaja este repositorio.
 * @param <Long> El tipo de dato de la clave primaria de la entidad User.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Spring Data JPA proporciona automáticamente los siguientes métodos:
    // save(), findById(), findAll(), deleteById(), etc.
    // Puedes agregar métodos personalizados aquí si es necesario (por ejemplo, findByEmail).
}
