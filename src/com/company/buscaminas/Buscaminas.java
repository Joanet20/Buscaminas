package com.company.buscaminas;

public class Buscaminas {

    public void jugar (Tablero tablero, Jugador jugador){

        Tablero tabJugador = tablero.omplirTablero();
        Input input = new Input();

        while (jugador.isEsViu()){
            tabJugador.printTablero(tabJugador, tabJugador.getCaselles(), jugador);

            switch (input.triarAccio()){
                case 0:
                    jugador.destaparCasella(tabJugador.getCaselles(), jugador);
                    break;
                case 1:
                    jugador.posarBandera(jugador);
                    break;
                default:
                    Output output = new Output();
                    output.accioInvalida();
                    continue;
            }
        }

        tabJugador.printTablero(tabJugador, tabJugador.getCaselles(), jugador);
    }
}
