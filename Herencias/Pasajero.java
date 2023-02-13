/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema7.Herencias;

/**
 *
 * @author Elena Oliva
 */
public class Pasajero extends Persona {

    private String numeroPasaporte;

    public Pasajero(String nombre, String apellidos, String dni, String email, String numeroPasaporte) {
        super(nombre, apellidos, dni, email);
        this.numeroPasaporte = numeroPasaporte;
    }

    public String getNumeroPasaporte() {
        return numeroPasaporte;
    }

    public void setNumeroPasaporte(String numeroPasaporte) {
        this.numeroPasaporte = numeroPasaporte;
    }
}
