package com.company.buscaminas;

public class Casella implements CasellaMina, CasellaNumero, CasellaBandera, CasellaEnBlanc {

    private int posX;
    private int posY;

    public Casella(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public Casella[] crearCasella(){
        Input input = new Input();
        int numCaselles = input.triarDificultatTablero();
        Casella[] caselles = new Casella[numCaselles*2];


        for (int k = 0; k < numCaselles; k++){
            for (int i = 0; i < caselles.length; i++){
                for (int j = 0; i < caselles.length; j++){
                    Casella casella = new Casella(i, j);
                    caselles[k] = casella;
                }
            }
        }
        return caselles;
    }
}
