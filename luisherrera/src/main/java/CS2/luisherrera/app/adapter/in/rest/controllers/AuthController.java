/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.rest.controllers;

import CS2.luisherrera.app.domain.model.auth.AuthCredentials;
import CS2.luisherrera.app.domain.model.auth.TokenResponse;
import CS2.luisherrera.app.domain.model.auth.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador encargado del proceso de autenticación (login).
 */
@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    /**
     * Endpoint para autenticar un usuario y generar un token JWT.
     */
    @PostMapping("/login")
    public ResponseEntity<TokenResponse> login(@RequestBody AuthCredentials credentials) {
        String username = credentials.getUsername();
        String password = credentials.getPassword();

        // ⚙️ Validación simple (en un caso real iría contra la base de datos)
        if ("admin".equals(username) && "1234".equals(password)) {
            String token = jwtUtil.generateToken(username);
            TokenResponse tokenResponse = new TokenResponse();
            tokenResponse.setToken(token);
            return ResponseEntity.ok(tokenResponse);
        } else {
            // ❌ Credenciales incorrectas
            return ResponseEntity.status(401).build();
        }
    }
}
