/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.model.auth;


public class TokenResponse {
    private String token;

    
    public TokenResponse() {
    }

   
    public TokenResponse(String token) {
        this.token = token;
    }

   
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    // Opcional: para depuración
    @Override
    public String toString() {
        return "TokenResponse{" +
                "token='" + token + '\'' +
                '}';
    }
}
