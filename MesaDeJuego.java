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
 *
 *
 */
public class MesaDeJuego {

    //Atributos de la clase
    private ArrayList<CartaLogica> cartasEnMesa;

    //Constructor de la mesa de juego
    public MesaDeJuego() {
        cartasEnMesa = new ArrayList<>(); //ArrayList de cartas jugadas
    }

    //Coloca el objeto carta y lo añade al ArrayList
    public void agregarCartaAMesa(CartaLogica carta) {
        cartasEnMesa.add(carta);
    }

    //Imprime las cartas que se han jugado en la terminal
    public void mostrarCartasEnMesa() {
        for (CartaLogica carta : cartasEnMesa) {
            System.out.println(carta);
        }
    }

    // Metodo booleano para saber si la mesa esta vacia
    public boolean estaVaciaMesa() {
        return cartasEnMesa.isEmpty();
    }

    // Metodo de acceso a la ultima carta de la mesa
    public CartaLogica getUltimaCarta() {
        if (!estaVaciaMesa()) {
            return cartasEnMesa.get(cartasEnMesa.size() - 1);
        } else {
            return null;
        }
    }

    // Metodo para agregar una carta en la mesa
    public CartaLogica colocarCarta() {
        if (!estaVaciaMesa()) {
            return cartasEnMesa.remove(0);
        } else {
            return null;
        }
    }

    // Metodo para colocar la ultima carta de la mesa en algun lado
    public CartaLogica colocarUltimaCarta() {
        if (!estaVaciaMesa()) {
            return cartasEnMesa.remove(cartasEnMesa.size() - 1);
        } else {
            return null;
        }
    }

    // Metodo de acceso al ArrayList de cartas que hay en la mesa
    public ArrayList<CartaLogica> getMesa() {
        return cartasEnMesa;
    }
}
