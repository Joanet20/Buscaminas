package com.company.buscaminas.TipusDeCasella;

import com.company.buscaminas.Casella;

public class Numero extends Casella {

    private int minesColindants;

    public Numero(int posX, int posY) {
        super(posX, posY);
    }

    public Numero(int posX, int posY, int minesColindants) {
        super(posX, posY);
        this.minesColindants = minesColindants;
    }

    public int getMinesColindants(){
        return minesColindants;
    }

    public void sumarMinaColindant(){
        minesColindants++;
    }
}
