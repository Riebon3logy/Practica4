package com.mycompany.practica04;

import java.util.ArrayList;

/**
 *
 * @authors Andres Ferrel - Paul Chavez
 * 
 * Esta clase modela al jugador, el cual podra recibir cartas de la baraja
 * y jugar cartas en la mesa de juego
 * 
 * Version (1.0)
 * 
 **/

public class Jugador {
    
    //Atributos privados de la clase
    private String nombre;
    private ArrayList<CartaLogica> mano;
    
    //Constructor de la clase
    public Jugador(String nombre) {
        this.nombre = nombre; //Se le asigna un nombre al jugador
        this.mano = new ArrayList<>();  //Se crea la mano del jugador
    }
    
    //Metodo para tomar una carta de la baraja
    public void tomarCartaDeBaraja(Baraja baraja) {
        CartaLogica carta = baraja.darCarta();
            if (carta != null) {
                mano.add(carta);
            }
    }

    //Metodo para colocar una carta escogida por el jugador
    public CartaLogica colocarCarta(int indice) {
        if (indice < 0 || indice >= mano.size()) {
            System.out.println("Carta no valida.");
        }
        return mano.remove(indice);
    }
    
    //Getters de la clase
    public String getNombre() {
        return nombre;
    }

    public ArrayList<CartaLogica> getMano() {
        return mano;
    }
    
    //Setters de la clase
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMano(ArrayList<CartaLogica> mano) {
        this.mano = mano;
    }
    
    //Metodo que muestra toda la mano del jugador
    public void imprimirMano() {
        System.out.println("Mano de " + nombre + ":");
            for (CartaLogica carta : mano) {
                System.out.println(carta);
            }
    }
    
    //Metodo toString sobreescrito para el nombre del jugador
    @Override
    public String toString() {
        return nombre;
    }
}