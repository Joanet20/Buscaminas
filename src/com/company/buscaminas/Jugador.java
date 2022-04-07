package com.company.buscaminas;

public class Jugador {

    private Tablero tablero;
    private boolean esViu;

    public Jugador (Tablero tablero){
        this.tablero = tablero;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void destaparCasella(Casella casella){
        if (!casella.isDestapada()){
            casella.setDestapada(true);
        } else {
            Output output = new Output();
            output.casellaDestapada();
        }
    }
}
