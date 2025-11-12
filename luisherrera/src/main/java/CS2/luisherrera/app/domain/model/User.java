/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model;

import jakarta.persistence.*;
import java.util.Collections;
import java.util.List;

/**
 * Esta clase representa la entidad de usuario, que se mapea a una tabla en la base de datos.
 * Contiene la información básica de autenticación y de perfil del usuario.
 */
@Entity
@Table(name = "users") ural
public class User {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   
    private String name;

  
    private String email;

  
    private String username;

  
    private String password;

    
    private String role;

  

    public User() {
       
    }

    public User(String name, String email, String username, String password, String role) {
        this.name = name;
        this.email = email;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User(Long id, String name, String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Devuelve una lista con el rol del usuario.
     * Esto permite compatibilidad con los métodos de Spring Security.
     */
    public List<String> getRoles() {
        return Collections.singletonList(role);
    }

    /**
     * Método usado por Spring Security para obtener el ID del usuario.
     */
    public Long getUserId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", email='" + email + '\'' +
               ", username='" + username + '\'' +
               ", role='" + role + '\'' +
               '}';
    }
}
