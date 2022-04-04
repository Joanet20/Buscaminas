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

            case 1:
                numCaselles = 16;

            case 2:
                numCaselles = 24;

            /*default:
                Output.dificultatNoValida();*/
        }

        return numCaselles;

    }
}
