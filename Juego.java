package com.mycompany.practica04;

import java.util.*;

/**
 *
 * @authors Andres Le Gresley - Paul Chavez
 *
 * En esta clase se crea la instancia del juego con las clases y metodos que se
 * crearon anteriormente
 *
 * Version (1.0)
 *
 *
 */
public class Juego {
    
    private ChupateDos juego;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("############# Chupate dos card play ############");
        System.out.println("Ingrese la cantidad de jugadores que van a jugar");
        System.out.println("~~~~~~~~~~~~~(Minimo 2 - Maximo 4)~~~~~~~~~~~~~~");
        int cantidadJugadores = sc.nextInt();
        if (cantidadJugadores < 2 || cantidadJugadores > 4) {
            System.out.println("No se puede jugar con " + cantidadJugadores + " jugadores.");
            System.out.println("Saliendo...");
            sc.close();
            return;
        }
        ChupateDos juego = new ChupateDos(cantidadJugadores);
    }
}