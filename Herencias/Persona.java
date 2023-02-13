/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema7.Herencias;

/**
 *
 * @author Elena Oliva
 */
//Aeropuerto SVQ Sevilla
//El aeropuerto de Sevilla quiere implementar un sistema de información para gestionar su día a día y sus vuelos.
//En el aeropuerto necesita gestionar el personal: por un lado están los pilotos, azafatos y pasajeros; y por otro lado están los trabajdores del aeropuerto.
//Los pilotos se caracterizan por un rango (Alpha, Tango o Águila), un sueldo y si realizan vuelos internacionales o no.
//Los azafatos y azafatas también tienen un sueldo y una lista de idiomas que hablan.
//Los pasajeros no tienen un sueldo, pero tienen un número de pasaporte.
//Los trabajadores/as del aeropuerto tienen un sueldo.
//Además, todos los anteriores tienen un nombre, apellidos, dni y mail.
//
//El aeropuerto también pretende gestionar los vuelos. Los vuelos se caracterizan por una ciudad de origen, otra de destino, un/a piloto, una lista de pasajeros que viajan en él y una duración.
//
//Todas las propiedades o atributos deben poder consultarse y modificarse. Además queremos hacer un método para mostrar los pasajeros.
//Habrá que realizar un test creando un vuelo de Kiev a Sevilla con un pasajero que tenga vuestros datos personales.

import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String apellidos;
    private String dni;
    private String email;

    public Persona(String nombre, String apellidos, String dni, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}


