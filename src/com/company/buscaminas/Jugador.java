package com.company.buscaminas;

import com.company.buscaminas.TipusDeCasella.Bandera;
import com.company.buscaminas.TipusDeCasella.Mina;

import java.util.ArrayList;

public class Jugador {

    private Tablero tablero;
    private boolean esViu;
    private ArrayList<Casella> llistaBanderas = new ArrayList<>();

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

    public ArrayList<Casella> getLlistaBanderas() {
        return llistaBanderas;
    }

    public void destaparCasella(Casella[][] casellas, Jugador jugador){

        Input input = new Input();
        int[] coordenada = input.pasarCasella();

        Casella casellaActual = casellas[coordenada[0]][coordenada[1]];

        if (!casellaActual.isDestapada()){
            casellaActual.setDestapada(true);
            if (casellaActual instanceof Mina){
                jugador.setEsViu(false);
                Output output = new Output();
                output.hasPerdut();
                for (int i = 0; i < casellas.length; i++){
                    for (int j = 0; j < casellas[0].length; j++){
                        if (casellas[i][j] instanceof Mina){
                            casellas[i][j].setDestapada(true);
                        }
                    }
                }
            }
        } else {
            Output output = new Output();
            output.casellaDestapada();
        }

    }


    public void posarBandera(Casella[][] casellas){
        Input input = new Input();
        int[] coordenada = input.pasarCasella();

        if (coordenada[0] == casellas[coordenada[0]][coordenada[1]].getPosX() && coordenada[1] == casellas[coordenada[0]][coordenada[1]].getPosY()){
            casellas[coordenada[0]][coordenada[1]].setEsBandera(true);
        }
    }

    public void llevarBandera(Casella[][] casellas){
        Input input = new Input();
        int[] coordenada = input.pasarCasella();

        if (coordenada[0] == casellas[coordenada[0]][coordenada[1]].getPosX() && coordenada[1] == casellas[coordenada[0]][coordenada[1]].getPosY()){
            casellas[coordenada[0]][coordenada[1]].setEsBandera(false);
        }
    }


}
