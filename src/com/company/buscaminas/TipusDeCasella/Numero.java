package com.company.buscaminas.TipusDeCasella;

import com.company.buscaminas.Casella;

public class Numero extends Casella {

    private int minesColindants;

    public Numero(int posX, int posY) {
        super(posX, posY);
    }

    public int getMinesColindants(){
        return minesColindants;
    }
}
