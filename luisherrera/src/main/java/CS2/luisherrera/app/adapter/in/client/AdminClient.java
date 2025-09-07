/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.client;

import java.util.Scanner;
import CS2.luisherrera.app.adapter.in.builder.DoctorBuilder;
import CS2.luisherrera.app.adapter.in.builder.NurseBuilder;
import CS2.luisherrera.app.application.usecases.AdminUseCase;
import CS2.luisherrera.app.domain.model.Doctor;
import CS2.luisherrera.app.domain.model.Nurse;

public class AdminClient {

    private static final String MENU = "Ingrese una de las opciones \n 1. para crear doctor \n 2. para crear enfermero \n 3. para salir";
    private static Scanner reader = new Scanner(System.in);
    private AdminUseCase adminUseCase;
    private DoctorBuilder doctorBuilder;
    private NurseBuilder nurseBuilder;

    public AdminClient(AdminUseCase adminUseCase, DoctorBuilder doctorBuilder, NurseBuilder nurseBuilder) {
        this.adminUseCase = adminUseCase;
        this.doctorBuilder = doctorBuilder;
        this.nurseBuilder = nurseBuilder;
    }

    public void session() {
        boolean session = true;
        while (session) {
            session = menu();
        }
    }

    private boolean menu() {
        try {
            System.out.println(MENU);
            String option = reader.nextLine();
            switch (option) {
                case "1": {
                    Doctor doctor = readDoctorInfo();
                    adminUseCase.createDoctor(doctor);
                    System.out.println("Doctor creado con exito!");
                    return true;
                }
                case "2": {
                    Nurse nurse = readNurseInfo();
                    adminUseCase.createNurse(nurse);
                    System.out.println("Enfermero(a) creado(a) con exito!");
                    return true;
                }
                case "3": {
                    System.out.println("Hasta luego \n cerrando sesion");
                    return false;
                }
                default: {
                    System.out.println("Ingrese una opcion valida");
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return true;
        }
    }
    
    private Doctor readDoctorInfo() throws Exception {
        System.out.println("ingrese el nombre completo del doctor");
        String name = reader.nextLine();
        System.out.println("ingrese la cedula del doctor");
        String document = reader.nextLine();
        System.out.println("ingrese la fecha de contratacion (YYYY-MM-DD)");
        String hireDate = reader.nextLine();
        System.out.println("ingrese la especializacion medica");
        String specialization = reader.nextLine();
        System.out.println("ingrese el numero de licencia medica");
        String license = reader.nextLine();
        System.out.println("ingrese la tarifa de consulta");
        String fee = reader.nextLine();
        System.out.println("esta aceptando nuevos pacientes? (true/false)");
        String accepting = reader.nextLine();
        
        return doctorBuilder.build(name, document, hireDate, specialization, license, fee, accepting);
    }

    private Nurse readNurseInfo() throws Exception {
        System.out.println("ingrese el nombre completo del enfermero(a)");
        String name = reader.nextLine();
        System.out.println("ingrese la cedula del enfermero(a)");
        String document = reader.nextLine();
        System.out.println("ingrese la fecha de contratacion (YYYY-MM-DD)");
        String hireDate = reader.nextLine();
        System.out.println("ingrese la certificacion");
        String certification = reader.nextLine();
        System.out.println("ingrese el turno de trabajo");
        String shift = reader.nextLine();
        
        return nurseBuilder.build(name, document, hireDate, certification, shift);
    }
}