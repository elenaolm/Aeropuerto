/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema7.Herencias;

/**
 *
 * @author Elena Oliva
 */
public class Piloto extends Trabajador {

    private Rango rango;
    private boolean vuelosInternacionales;

    public Piloto(String nombre, String apellidos, String dni, String email, double salario, Rango rango, boolean vuelosInternacionales) {
        super(nombre, apellidos, dni, email, salario);
        this.rango = rango;
        this.vuelosInternacionales = vuelosInternacionales;
    }

    public Rango getRango() {
        return rango;
    }

    public void setRango(Rango rango) {
        this.rango = rango;
    }

    public boolean isVuelosInternacionales() {
        return vuelosInternacionales;
    }

    public void setVuelosInternacionales(boolean vuelosInternacionales) {
        this.vuelosInternacionales = vuelosInternacionales;
    }
    public enum Rango {
        Alfa, Tango, Aguilar 
    }
}