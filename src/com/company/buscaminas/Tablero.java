package com.company.buscaminas;

import com.company.buscaminas.TipusDeCasella.Mina;

import java.util.ArrayList;

public class Tablero {

    private int numCasellesHor;
    private int numCasellesVer;
    private ArrayList<Casella> caselles;

    public Tablero (){

    }

    public Tablero (int numCasellesHor, int numCasellesVer){
        this.numCasellesHor = numCasellesHor;
        this.numCasellesVer = numCasellesVer;
        this.caselles = new ArrayList<>(numCasellesHor * numCasellesVer);
    }

    public Tablero crearTablero(){
        Input input = new Input();
        int dificultat;

        dificultat = input.triarDificultatTablero();

        return new Tablero(dificultat, dificultat);
    }

    public Tablero omplirTablero(){
        Tablero tablero = crearTablero();
        int numMines = 0;

        switch (tablero.getNumCasellesHor()){
            case 8:
                numMines = 10;
                break;

            case 16:
                numMines = 40;
                break;

            case 24:
                numMines = 99;
                break;
        }


        return tablero;
    }

    public void printTablero(){
        Output output = new Output();
        Tablero tablero = omplirTablero();

        output.displayTablero(tablero.getCaselles(), tablero.getNumCasellesHor());
    }


    public int getNumCasellesHor(){
        return numCasellesHor;
    }

    public int getNumCasellesVer(){
        return numCasellesVer;
    }

    public ArrayList<Casella> getCaselles(){
        return caselles;
    }

    public void setCaselles(ArrayList<Casella> caselles){
        this.caselles = caselles;
    }


}
