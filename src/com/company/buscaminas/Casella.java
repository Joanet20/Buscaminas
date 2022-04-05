package com.company.buscaminas;

import com.company.buscaminas.TipusDeCasella.Mina;

public class Casella implements CasellaMina, CasellaNumero, CasellaBandera, CasellaEnBlanc {

    private int posX;
    private int posY;

    public Casella (){

    }

    public Casella(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public Casella generarMines(int x, int y){
        int coordenadaX = (int) Math.floor(Math.random()*x);
        int coordenadY = (int) Math.floor(Math.random()*y);

        return new Mina(coordenadaX, coordenadY);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}
