package com.company.buscaminas.TipusDeCasella;

import com.company.buscaminas.Casella;

public class EnBlanc extends Casella {

    private String nom;

    public EnBlanc(int posX, int posY) {
        super(posX, posY);
        this.nom = "B";
    }
}
