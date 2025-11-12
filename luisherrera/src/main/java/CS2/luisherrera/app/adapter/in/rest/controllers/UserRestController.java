/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.rest.controllers;

import CS2.luisherrera.app.domain.model.User;
import CS2.luisherrera.app.domain.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * 
 */
@RestController
@RequestMapping("/api/users")
public class UserRestController {

    private final UserService userService;

    // The controller receives the UserService via dependency injection.
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    /**
     * Endpoint to create a new user.
     * POST /api/users
     * @param user The user object to save.
     * @return The saved user with its ID.
     */
    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        User savedUser = userService.saveUser(user);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }

    /**
     * Endpoint to find a user by their ID.
     * GET /api/users/{id}
     * @param id The user's ID.
     * @return The user if found, or a 404 Not Found response.
     */
    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        Optional<User> user = userService.findById(id);
        return user.map(ResponseEntity::ok)
                   .orElseGet(() -> ResponseEntity.notFound().build());
    }

    /**
     * Endpoint to get all users.
     * GET /api/users
     * @return A list of all users.
     */
    @GetMapping
    public ResponseEntity<List<User>> findAllUsers() {
        List<User> users = userService.findAllUsers();
        return ResponseEntity.ok(users);
    }

    /**
     * Endpoint to delete a user by their ID.
     * DELETE /api/users/{id}
     * @param id The ID of the user to delete.
     * @return A 204 No Content response if successful.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
