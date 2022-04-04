package com.company.buscaminas;

import java.util.ArrayList;

public class Output {

    public static void dificultatNoValida(){
        System.out.println("La dificultat triada no és vàlida");
    }

    public void displayTablero(Casella[] casellas, int casellesPerFila){

        ArrayList<Integer> separa = new ArrayList<>();

        for (int i = 0; i < casellesPerFila; i++){
            separa.add(casellesPerFila * (i+1));
        }

        for (int i = 0; i < casellas.length; i++){
            if (separa.contains(i)){
                System.out.println();
            }
            System.out.print("[" + casellas[i].getPosX() + "," + casellas[i].getPosY() + "]");
        }
    }
}
