package com.company.buscaminas;

import java.util.ArrayList;

public class Output {

    public static void dificultatNoValida(){
        System.out.println("La dificultat triada no és vàlida");
    }

    public void displayTablero(Casella[][] casellas, int casellesPerFila){

        ArrayList<Integer> separa = new ArrayList<>();

        for (int i = 0; i < casellesPerFila; i++){
            separa.add(casellesPerFila * (i+1));
        }

        for (int i = 0; i < casellas.length; i++){
            for (int j = 0; j < casellas[0].length; j++){
                System.out.println("[" + casellas[i][j].getPosX() + "," + casellas[i][j].getPosY() + "]");
            }

        }
    }
}
