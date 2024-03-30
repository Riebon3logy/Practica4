package com.mycompany.practica04;

import java.util.ArrayList;

/**
 *
 * @authors Andres Le Gresley - Paul Chavez
 * 
 * Esta clase modela la mesa de juego en la cual los jugadores podran colocar
 * las cartas que se vayan jugando
 * 
 * Version (1.0)
 * 
 **/

public class MesaDeJuego {
    
    //Atributos de la clase
    private ArrayList<CartaLogica> cartasEnMesa;
    private Baraja baraja;

    //Constructor de la mesa de juego
    public MesaDeJuego(Baraja baraja) {
        this.cartasEnMesa = new ArrayList<>(); //ArrayList de cartas jugadas
        this.baraja = baraja;
    }
    
    //Coloca el objeto carta y lo añade al ArrayList
    public void colocarCarta(Jugador jugador, int indice) {
        CartaLogica carta = jugador.colocarCarta(indice);
        if (carta != null) {
            cartasEnMesa.add(carta);
            System.out.println(jugador.getNombre() + " coloca la carta: " + carta);
        }
    }
    
    //Imprime las cartas que se han jugado en la terminal
    public void mostrarCartasEnMesa() {
        System.out.println("Cartas en la mesa:");
        for (CartaLogica carta : cartasEnMesa) {
            System.out.println(carta);
        }
    }
    
    //Reparte cartas en funcion de la cantidad de jugadores
    public void repartirCartas(ArrayList<Jugador> jugadores, int cantidadCartasPorJugador) {
        for (Jugador jugador : jugadores) {
            for (int i = 0; i < cantidadCartasPorJugador; i++) {
                jugador.tomarCartaDeBaraja(baraja);
            }
        }
    }
}
