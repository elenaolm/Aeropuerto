/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema7.Herencias;

/**
 *
 * @author Elena Oliva
 */
class Trabajador extends Persona {

    private double salario;

    public Trabajador(String nombre, String apellidos, String dni, String email, double salario) {
        super(nombre, apellidos, dni, email);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
