/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.rest.controllers;

import CS2.luisherrera.app.infrastructure.security.JwtTokenUtil;
import CS2.luisherrera.app.infrastructure.security.UserDetailsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @PostMapping("/login")
    public String createAuthenticationToken(@RequestParam String username, @RequestParam String password) throws Exception {
        // Autentica usuario
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

        // Carga detalles del usuario (✅ este es UserDetails)
        final UserDetails userDetails = userDetailsService.loadUserByUsername(username);

        // Genera el token (✅ ahora sí correcto)
        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return jwt;
    }
}
