/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.domain.services;
 
import CS2.luisherrera.app.domain.model.User;
import CS2.luisherrera.infrastructure.persistence.repositories.UserRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
 
import java.util.List;
import java.util.Optional;
 
/**
 * Implementación concreta del puerto de entrada (UserService).
 *            
 */
@Service
public class UserServiceImpl implements UserService {
 
    // Puerto de salida (Output Port) inyectado para la persistencia.
    private final UserRepository userRepository;
 
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
 
    /**
     * Guarda un nuevo usuario o actualiza uno existente.
     * @param user El objeto User a guardar.
     * @return El usuario guardado.
     */
    public User save(User user) {
        System.out.println("Guardando usuario: " + user.getName());
        return userRepository.save(user);
    }
 
    /**
     * Busca un usuario por su ID.
     * @param id El ID del usuario.
     * @return Un Optional que contiene el usuario si existe.
     */
    @Override
    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }
 
    /**
     * Recupera todos los usuarios.
     * @return Una lista de todos los usuarios.
     */
    public List<User> findAll() {
        return userRepository.findAll();
    }
 
    /**
     * Elimina un usuario por su ID.
     * @param id El ID del usuario a eliminar.
     */
    public void deleteById(Long id) {
        System.out.println("Eliminando usuario con ID: " + id);
        userRepository.deleteById(id);
    }

    @Override
    public User saveUser(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<User> findAllUsers() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteUser(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
 
