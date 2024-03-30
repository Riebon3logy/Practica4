package com.mycompany.practica04;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @authors Andres Le Gresley - Paul Chavez
 * 
 * Esta clase crea una baraja usando ArrayList de tipo carta para poder crear
 * todas las cartas necesarias que componen una baraja española.
 * 
 * Version (1.0)
 * 
 **/

public class Baraja {

    //Atributo ArrayList de tipo CartaLogica el cual almacenara todas las cartas
    private ArrayList<CartaLogica> baraja;

    //Constructor de la clase
    public Baraja() {
        baraja = new ArrayList<>();
        String[] suits = {"Oros", "Copas", "Espadas", "Bastos"};
        String[] values = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Sota", "Caballo", "Rey"};

        for (String suit : suits) {
            for (String value : values) {
                baraja.add(new CartaLogica(suit, value));
            }
        }
    }
    
    //Metodo para mezclar las cartas
    public void mezclar() {
        Collections.shuffle(baraja);
    }
    
    //Metodo para poder disponer de las cartas
    public ArrayList<CartaLogica> getBaraja() {
        return baraja;
    }

    // Imprimir las cartas en la baraja usando lambda
    public void imprimirCartas () {
        getBaraja().forEach(CartaLogica -> System.out.println(CartaLogica));
    }
}
