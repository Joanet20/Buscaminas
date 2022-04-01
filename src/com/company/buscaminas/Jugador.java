package com.company.buscaminas;

public class Jugador {

    private Tablero tablero;
    private boolean esViu;

    public Jugador (Tablero  tablero){
        this.tablero = tablero;
    }

    public Tablero getTablero() {
        return tablero;
    }
}
