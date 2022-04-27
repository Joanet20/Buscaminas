package com.company.buscaminas.TipusDeCasella;

import com.company.buscaminas.Casella;

public class Mina extends Casella {

    private String nom;

    public Mina(int posX, int posY) {
        super(posX, posY);
        this.nom = "M";
    }

    public Mina(){

    }
}
