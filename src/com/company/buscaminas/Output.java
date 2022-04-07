package com.company.buscaminas;

import com.company.buscaminas.TipusDeCasella.Numero;

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
            System.out.println();
            for (int j = 0; j < casellas[0].length; j++){
                System.out.print("[" + casellas[i][j].getNom(casellas[i][j]) + " - " + casellas[i][j].getPosX() + "," + casellas[i][j].getPosY() + "]");
            }

        }
    }

    public void casellaDestapada(){
        System.out.println("Aquesta casella ja està destapada!");
    }
}
