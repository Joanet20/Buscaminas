package com.company.buscaminas;

public class Tablero {

    private int numCasellesHor;
    private int numCasellesVer;
    private Casella[] caselles;

    public Tablero (int numCasellesHor, int numCasellesVer){
        this.numCasellesHor = numCasellesHor;
        this.numCasellesVer = numCasellesVer;
    }

    public Tablero crearTablero(){
        Input input = new Input();
        int dificultat;

        dificultat = input.triarDificultatTablero();

        return new Tablero(dificultat, dificultat);
    }

    public void omplirTablero(){

    }


}
