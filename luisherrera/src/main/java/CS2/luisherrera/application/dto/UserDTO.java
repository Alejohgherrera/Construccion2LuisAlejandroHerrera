/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.application.dto;

/**
 * DTO para transferir datos de usuario.
 * Contiene solo los datos necesarios para la capa de presentación,
 * evitando exponer detalles internos de la entidad.
 */
public class UserDTO {
    private Long id;
    private String nombre;
    private String email;

    /**
     * Constructor para crear un DTO de usuario.
     * @param id El ID del usuario.
     * @param nombre El nombre del usuario.
     * @param email El correo electrónico del usuario.
     */
    public UserDTO(Long id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}