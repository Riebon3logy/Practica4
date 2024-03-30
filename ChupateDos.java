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

public class ChupateDos {
    
    private ArrayList<Jugador> jugadores;
    private Baraja baraja;
    private MesaDeJuego mesa;

    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        baraja.mezclar();
        
        MesaDeJuego mesa = new MesaDeJuego(baraja);
        
        Jugador jugador = new Jugador ("Andres");
        
        for (int i = 0 ; i < 4 ; i++) {
            jugador.tomarCartaDeBaraja(baraja);
        }
        
        jugador.imprimirMano();
        System.out.println(" ");
        mesa.colocarCarta(jugador, 0);
        mesa.mostrarCartasEnMesa();
        jugador.imprimirMano();
    }
}
