package com.company.buscaminas;

import com.company.buscaminas.TipusDeCasella.Mina;

public class Jugador {

    private Tablero tablero;
    private boolean esViu;

    public Jugador (Tablero tablero){
        this.tablero = tablero;
        this.esViu = true;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public boolean isEsViu(){
        return esViu;
    }

    public void setEsViu(boolean esViu) {
        this.esViu = esViu;
    }

    public void destaparCasella(Casella[][] casellas){

        Input input = new Input();
        int[] coordenada = input.pasarCasella();

        Casella casellaActual = casellas[coordenada[0]][coordenada[1]];

        if (!casellaActual.isDestapada()){
            casellaActual.setDestapada(true);
        } else {
            Output output = new Output();
            output.casellaDestapada();
        }

    }
}
