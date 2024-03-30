package com.mycompany.practica04;

import java.util.ArrayList;

public class MesaDeJuego {

    private ArrayList<CartaLogica> cartasEnMesa;
    private Baraja baraja;

    public MesaDeJuego(Baraja baraja) {
        this.cartasEnMesa = new ArrayList<>();
        this.baraja = baraja;
    }

    public void colocarCarta(Jugador jugador, int indice) {
        CartaLogica carta = jugador.colocarCarta(indice);
        if (carta != null) {
            cartasEnMesa.add(carta);
            System.out.println(jugador.getNombre() + " coloca la carta: " + carta);
        }
    }

    public void mostrarCartasEnMesa() {
        System.out.println("Cartas en la mesa:");
        for (CartaLogica carta : cartasEnMesa) {
            System.out.println(carta);
        }
    }

    public void repartirCartas(ArrayList<Jugador> jugadores, int cantidadCartasPorJugador) {
        for (Jugador jugador : jugadores) {
            for (int i = 0; i < cantidadCartasPorJugador; i++) {
                jugador.tomarCartaDeBaraja(baraja);
            }
        }
    }
}