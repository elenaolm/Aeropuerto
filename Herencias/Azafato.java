/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema7.Herencias;

import java.util.ArrayList;

/**
 *
 * @author Elena Oliva
 */
class Azafato extends Trabajador {

    private ArrayList<String> idiomas;

    public Azafato(String nombre, String apellidos, String dni, String email, double salario, ArrayList<String> idiomas) {
        super(nombre, apellidos, dni, email, salario);
        this.idiomas = idiomas;
    }

    public ArrayList<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(ArrayList<String> idiomas) {
        this.idiomas = idiomas;
    }
}