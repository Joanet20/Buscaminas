package com.company.buscaminas;

public class Output {

    public static void dificultatNoValida(){
        System.out.println("La dificultat triada no és vàlida");
    }

    public void displayTablero(Casella[] casellas, int casellesPerFila){
        for (int i = 0; i < casellas.length; i++){
            System.out.println();
            System.out.print("[" + casellas[i].getPosX() + " " + casellas[i].getPosY() + "]");

        }
    }
}
