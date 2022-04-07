package com.company.buscaminas;

import com.company.buscaminas.TipusDeCasella.Bandera;
import com.company.buscaminas.TipusDeCasella.Mina;
import com.company.buscaminas.TipusDeCasella.Numero;

import java.util.ArrayList;

public class Output {

    public static void dificultatNoValida(){
        System.out.println("La dificultat triada no és vàlida");
    }

    public void displayTablero(Casella[][] casellas, int casellesPerFila, Jugador jugador){

        ArrayList<Integer> separa = new ArrayList<>();
        String flag = "T";

        for (int i = 0; i < casellesPerFila; i++){
            separa.add(casellesPerFila * (i+1));
        }

        System.out.println("T-Tapada, B-En blanc, M-Mina, F-Bandera");
        for (int i = 0; i < casellas.length; i++){
            System.out.println();
            for (int j = 0; j < casellas[0].length; j++){
                if (!casellas[i][j].isDestapada()){
                    flag = "T";
                    for (Casella bandera : jugador.getLlistaBanderas()){
                        if (bandera.getPosX() == casellas[i][j].getPosX() &&
                                bandera.getPosY() == casellas[i][j].getPosY()){
                            flag = "F";
                        }
                    }
                    System.out.print("[" + flag + "]");
                } else {
                    if (casellas[i][j] instanceof Numero){
                        System.out.print("[" + ((Numero) casellas[i][j]).getMinesColindants() + "]");
                    } else {
                        System.out.print("[" + casellas[i][j].getNom(casellas[i][j]) + "]");
                    }

                }

            }

        }
        System.out.println();
    }

    public void casellaDestapada(){
        System.out.println("Aquesta casella ja està destapada!");
    }

    public void triarCoordenadaX(){
        System.out.println("Tria una coordenada X");
    }

    public void triarCoordenadaY(){
        System.out.println("Tria una coordenada Y");
    }

    public void hasPerdut(){
        System.out.println("Has perdut");
    }

    public void accio(){
        System.out.println("Vols destapar una casella o posar una bandera? 0-Destapar, 1-Posar bandera");
    }

    public void accioInvalida(){
        System.out.println("La acció triada no és valida!");
    }
}
