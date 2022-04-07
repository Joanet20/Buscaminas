package com.company.buscaminas;

import com.company.buscaminas.TipusDeCasella.Bandera;
import com.company.buscaminas.TipusDeCasella.EnBlanc;
import com.company.buscaminas.TipusDeCasella.Mina;
import com.company.buscaminas.TipusDeCasella.Numero;

import java.util.ArrayList;
import java.util.Iterator;

public class Casella {

    private int posX;
    private int posY;
    private String nom;
    private boolean destapada;

    public Casella (){

    }

    public Casella(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
        this.destapada = false;
    }



    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public boolean isDestapada(){
        return destapada;
    }

    public void setDestapada(boolean destapada) {
        this.destapada = destapada;
    }

    public void setPosicions(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public String getNom(Casella casella){

        String tipus = "";

        if (casella instanceof Mina){
            tipus = "M";
        } else if (casella instanceof Numero){

        } else if (casella instanceof EnBlanc){
            tipus = "B";
        } else if (casella instanceof Bandera){
            tipus = "F";
        }
        return tipus;
    }
}
