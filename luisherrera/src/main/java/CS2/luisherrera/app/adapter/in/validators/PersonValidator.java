/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CS2.luisherrera.app.adapter.in.validators;

public class PersonValidator extends SimpleValidator {

    public void validate(String fullName, String socialSecurityNumber) throws Exception {
        stringValidator("nombre completo", fullName);
        stringValidator("cédula", socialSecurityNumber);
    }
}