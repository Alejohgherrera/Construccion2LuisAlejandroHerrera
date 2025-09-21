/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.rest.controllers;

import CS2.luisherrera.app.domain.model.Patient;
import CS2.luisherrera.app.domain.services.GetPatientService;
import CS2.luisherrera.app.domain.services.ManagePatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Controlador REST para manejar las solicitudes relacionadas con los pacientes.
 * Expone endpoints para guardar, obtener y consultar pacientes.
 */
@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    private final GetPatientService getPatientService;
    private final ManagePatientService managePatientService;

    @Autowired
    public PatientController(GetPatientService getPatientService, ManagePatientService managePatientService) {
        this.getPatientService = getPatientService;
        this.managePatientService = managePatientService;
    }

    /**
     * Endpoint para obtener todos los pacientes.
     * Método: GET
     * URL: /api/v1/patients
     * @return ResponseEntity con una lista de objetos Patient.
     */
    @GetMapping
    public ResponseEntity<List<Patient>> getAllPatients() {
        List<Patient> patients = managePatientService.findAll();
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }
    
    /**
     * Endpoint para obtener un paciente por su número de seguridad social.
     * Método: GET
     * URL: /api/v1/patients/{socialSecurityNumber}
     * @param socialSecurityNumber El número de seguridad social del paciente.
     * @return ResponseEntity con el objeto Patient si se encuentra,
     * o con un estado de NOT_FOUND si no existe.
     */
    @GetMapping("/{socialSecurityNumber}")
    public ResponseEntity<Patient> getPatient(@PathVariable String socialSecurityNumber) {
        Patient patient = getPatientService.getPatient(socialSecurityNumber);
        if (patient != null) {
            return new ResponseEntity<>(patient, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /**
     * Endpoint para guardar un nuevo paciente.
     * Método: POST
     * URL: /api/v1/patients
     * Cuerpo de la solicitud: JSON con los datos del paciente.
     * @param patient El objeto de dominio Patient a guardar.
     * @return ResponseEntity con el objeto Patient guardado.
     */
    @PostMapping
    public ResponseEntity<Patient> savePatient(@RequestBody Patient patient) {
        Patient savedPatient = managePatientService.save(patient);
        return new ResponseEntity<>(savedPatient, HttpStatus.CREATED);
    }
}