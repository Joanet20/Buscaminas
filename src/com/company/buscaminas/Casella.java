package com.company.buscaminas;

import com.company.buscaminas.TipusDeCasella.EnBlanc;
import com.company.buscaminas.TipusDeCasella.Mina;
import com.company.buscaminas.TipusDeCasella.Numero;

import java.util.ArrayList;
import java.util.Iterator;

public class Casella {

    private int posX;
    private int posY;
    private String nom;

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

    public String getNom(Casella casella){

        String tipus = "";

        if (casella instanceof Mina){
            tipus = "Mina";
        } else if (casella instanceof Numero){
            tipus = "Numero";
        } else if (casella instanceof EnBlanc){
            tipus = "Blanc";
        }
        return tipus;
    }
}
