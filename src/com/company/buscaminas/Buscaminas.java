package com.company.buscaminas;

public class Buscaminas {

    public void jugar (Tablero tablero, Jugador jugador){

        Tablero tabJugador = tablero.omplirTablero();

        while (jugador.isEsViu()){
            tabJugador.printTablero(tabJugador, tabJugador.getCaselles());
            jugador.destaparCasella(tabJugador.getCaselles(), jugador);
        }
    }
}
