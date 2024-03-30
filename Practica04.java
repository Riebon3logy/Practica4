package com.mycompany.practica04;

import java.util.ArrayList;

/**
 *
 * @authors Andres Ferrel - Paul Chavez
 * 
 * Esta es la clase principal, en la cual se comienza el juego y se determina la
 * cantidad de jugadores, los puntos y se involucran todas las clases creadas
 * anteriormente
 * 
 * Version (1.0)
 * 
 **/

public class Practica04 {
    
    private ArrayList<Jugador> jugadores;
    private Baraja baraja;

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.mezclar();
        
        Jugador jugador = new Jugador ("Andres");
        
        for (int i = 0 ; i < 4 ; i++) {
            jugador.tomarCartaDeBaraja(baraja);
        }
        
        jugador.imprimirMano();
    }
}