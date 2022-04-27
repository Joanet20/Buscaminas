package com.company.buscaminas.TipusDeCasella;

import com.company.buscaminas.Casella;

public class Bandera extends Casella {

    private String nom;

    public Bandera(int posX, int posY) {
        super(posX, posY);
        this.nom = "F";
    }
}
