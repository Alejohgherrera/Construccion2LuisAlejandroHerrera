/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model.auth;

public class AuthCredentials {
    private String username;
    private String password;

    // Constructor vacío (necesario para frameworks como Spring)
    public AuthCredentials() {
    }

    // Constructor con parámetros
    public AuthCredentials(String username, String password) {
        this.username = username;
        this.password = password;
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

    // Opcional: para depuración (no mostrar contraseña)
    @Override
    public String toString() {
        return "AuthCredentials{" +
                "username='" + username + '\'' +
                '}';
    }
}

