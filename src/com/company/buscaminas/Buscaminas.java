package com.company.buscaminas;

import com.company.buscaminas.TipusDeCasella.Mina;

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
                    jugador.posarBandera(tabJugador.getCaselles());
                    break;
                case 2:
                    jugador.llevarBandera(tabJugador.getCaselles());
                    break;
                default:
                    Output output = new Output();
                    output.accioInvalida();
                    continue;
            }
        }

        tabJugador.printTablero(tabJugador, tabJugador.getCaselles(), jugador);

        hasGuanyat(tabJugador);
    }

    public void hasGuanyat(Tablero tabJugador){
        int limit = 0;

        for (int i = 0; i < tabJugador.getCaselles().length; i++){
            for (int j = 0; j < tabJugador.getCaselles()[0].length; j++){
                if (tabJugador.getCaselles()[i][j] instanceof Mina && tabJugador.getCaselles()[i][j].isEsBandera()){
                    limit++;
                }
            }
        }

        if (tabJugador.getNumMines() == limit){
            Output output = new Output();
            output.win();
        }

    }
}
