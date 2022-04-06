package com.company.buscaminas;

import com.company.buscaminas.TipusDeCasella.Mina;

import java.util.ArrayList;
import java.util.Iterator;

public class Casella {

    private int posX;
    private int posY;

    public Casella (){

    }

    public Casella(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }



    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosicions(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }
}
