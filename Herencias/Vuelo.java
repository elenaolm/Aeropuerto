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
class Vuelo {

    private String ciudadOrigen;
    private String ciudadDestino;
    private Piloto piloto;
    private ArrayList<Pasajero> pasajeros;
    private int duracion;

    public Vuelo(String ciudadOrigen, String ciudadDestino, Piloto piloto) {
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.piloto = piloto;
        pasajeros = new ArrayList<>();
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void addPasajero(Pasajero pasajero) {
        pasajeros.add(pasajero);
    }

    public void mostrarPasajeros() {
        for (Pasajero pasajero : pasajeros) {
            System.out.println(pasajero.getNombre() + " " + pasajero.getApellidos());
        }
    }
    
    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }

    public ArrayList<Pasajero> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(ArrayList<Pasajero> pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void mostrarPasajeros() {
        System.out.println("Pasajeros del vuelo: ");
        for (Pasajero pasajero : pasajeros) {
            System.out.println(pasajero.getNombre() + " " + pasajero.getApellidos());
        }
    }
}

