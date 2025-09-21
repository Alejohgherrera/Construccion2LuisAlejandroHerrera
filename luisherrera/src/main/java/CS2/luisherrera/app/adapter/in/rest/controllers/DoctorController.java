/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.rest.controllers;

import CS2.luisherrera.app.domain.model.Doctor;
import CS2.luisherrera.app.domain.services.GetDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controlador REST para manejar las solicitudes relacionadas con los doctores.
 * Expone endpoints para consultar información de doctores.
 */
@RestController
@RequestMapping("/api/v1/doctors")
public class DoctorController {

    private final GetDoctorService getDoctorService;

    @Autowired
    public DoctorController(GetDoctorService getDoctorService) {
        this.getDoctorService = getDoctorService;
    }

    /**
     * Endpoint para obtener un doctor por su ID.
     * Método: GET
     * URL: /api/v1/doctors/{doctorId}
     * @param doctorId El ID del doctor a buscar.
     * @return ResponseEntity con el objeto Doctor si se encuentra,
     * o con un estado de NOT_FOUND si no existe.
     */
    @GetMapping("/{doctorId}")
    public ResponseEntity<Doctor> getDoctor(@PathVariable String doctorId) {
        Doctor doctor = getDoctorService.getDoctor(doctorId);
        if (doctor != null) {
            return new ResponseEntity<>(doctor, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}