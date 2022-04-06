package com.company.buscaminas.TipusDeCasella;

import com.company.buscaminas.Casella;
import com.company.buscaminas.CasellaMina;

public class Mina extends Casella implements CasellaMina {

    private String nom;

    public Mina(int posX, int posY) {
        super(posX, posY);
        this.nom = "Mina";
    }

    public Mina(){

    }
}
