package com.company.buscaminas;

public class Main {

    public static void main(String[] args) {


        Buscaminas buscaminas = new Buscaminas();
        Tablero tablero = new Tablero();
        Jugador jugador = new Jugador(tablero);

        buscaminas.jugar(tablero,jugador);
    }
}