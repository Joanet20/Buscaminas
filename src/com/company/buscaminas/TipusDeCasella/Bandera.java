package com.company.buscaminas.TipusDeCasella;

import com.company.buscaminas.Casella;
import com.company.buscaminas.CasellaBandera;

public class Bandera extends Casella implements CasellaBandera {
    public Bandera(int posX, int posY) {
        super(posX, posY);
    }
}
