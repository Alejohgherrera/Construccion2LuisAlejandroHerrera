/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Esta clase representa la entidad de usuario, que se mapea a una tabla en la base de datos.
 * Las anotaciones de Jakarta Persistence (JPA) la definen como una entidad.
 */
@Entity
@Table(name = "users") // Se recomienda nombrar la tabla en minúsculas y en plural
public class User {

    /**
     * El ID único para cada usuario. La anotación @Id lo marca como la clave primaria.
     * @GeneratedValue(strategy = GenerationType.IDENTITY) indica que la base de datos
     * generará este valor automáticamente.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * El nombre completo del usuario.
     */
    private String name;

    /**
     * La dirección de correo electrónico del usuario.
     */
    private String email;

    // --- Constructores ---

    /**
     * Constructor predeterminado (requerido por JPA).
     */
    public User() {}

    /**
     * Constructor con todos los campos para crear un nuevo objeto User.
     * @param name El nombre del usuario.
     * @param email La dirección de correo electrónico.
     */
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public User(Long id, String name, String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // --- Getters y Setters ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               '}';
    }
}
