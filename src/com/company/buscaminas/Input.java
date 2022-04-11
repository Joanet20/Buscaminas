package com.company.buscaminas;

import java.util.Scanner;

public class Input {

    public Input (){

    }

    public int triarDificultatTablero(){
        int numCaselles = 0;

        int dificultatTriada;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Tria la dificultat: 0-Principiant, 1-Intermig, 2-Expert");
        dificultatTriada = scanner.nextInt();

        switch (dificultatTriada){
            case 0:
                numCaselles = 8;
                break;

            case 1:
                numCaselles = 16;
                break;

            case 2:
                numCaselles = 24;
                break;

            default:
                Output.dificultatNoValida();
        }

        return numCaselles;

    }

    public int[] pasarCasella(){
        int[] coordenada = new int[2];
        Output output = new Output();

        Scanner sc = new Scanner(System.in);

        output.triarCoordenadaY();
        coordenada[0] = sc.nextInt();

        output.triarCoordenadaX();
        coordenada[1] = sc.nextInt();

        return coordenada;
    }

    public int triarAccio(){
        Output output = new Output();

        int tipoAccio;
        output.accio();

        Scanner sc = new Scanner(System.in);
        tipoAccio = sc.nextInt();

        return tipoAccio;
    }

}
