/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema7.Herencias;

/**
 *
 * @author Elena Oliva
 */
public class Test {

    public static void main(String[] args) {
        Pasajero pasajero = new Pasajero("John", "Doe", "12345678A", "johndoe@email.com", "123456789");
        Piloto piloto = new Piloto("Jane", "Doe", "87654321B", "janedoe@email.com", 50000, Piloto.Rango.Aguilar, true);
        Vuelo vuelo = new Vuelo("Kiev", "Sevilla", piloto);
        vuelo.addPasajero(pasajero);

        System.out.println("Pasajeros en el vuelo: ");
        vuelo.mostrarPasajeros();
    }
}
