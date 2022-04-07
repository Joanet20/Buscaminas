package com.company.buscaminas.TipusDeCasella;

import com.company.buscaminas.Casella;
import com.company.buscaminas.CasellaEnBlanc;

public class EnBlanc extends Casella {

    private String nom;

    public EnBlanc(int posX, int posY) {
        super(posX, posY);
        this.nom = "B";
    }
}
