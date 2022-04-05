package com.company.buscaminas;

import java.util.ArrayList;

public class Output {

    public static void dificultatNoValida(){
        System.out.println("La dificultat triada no és vàlida");
    }

    public void displayTablero(ArrayList<Casella> casellas, int casellesPerFila){

        ArrayList<Integer> separa = new ArrayList<>();

        for (int i = 0; i < casellesPerFila; i++){
            separa.add(casellesPerFila * (i+1));
        }

        int cont = -1;

        for (Casella casella : casellas){
            cont ++;
            if (separa.contains(cont)){
                System.out.println();
            }
            System.out.print("[" + casella.getPosX() + "," + casella.getPosY() + "]");
        }
    }
}
