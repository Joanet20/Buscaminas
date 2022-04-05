package com.company.buscaminas;

import com.company.buscaminas.TipusDeCasella.Mina;

import java.util.ArrayList;
import java.util.Iterator;

public class Casella implements CasellaMina, CasellaNumero, CasellaBandera, CasellaEnBlanc {

    private int posX;
    private int posY;

    public Casella (){

    }

    public Casella(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public Casella generarMines(int x, int y, ArrayList<Casella> casellas, int i){
        int coordenadaX = (int) Math.floor(Math.random()*x);
        int coordenadY = (int) Math.floor(Math.random()*y);

        for (Casella casella : casellas){
            Casella mina = new Mina(coordenadaX, coordenadY);
            if (casella.getPosX() == mina.getPosX() && casella.getPosY() == mina.getPosY()){
                System.out.println("Repe");
                i--;
            }
        }

        return new Mina(coordenadaX, coordenadY);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}
