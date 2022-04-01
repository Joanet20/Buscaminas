package com.company.buscaminas;

public class Tablero {

    private int numCasellesHor;
    private int getNumCasellesVer;
    private Casella[] caselles;

    public Tablero (int numCasellesHor, int getNumCasellesVer){
        this.numCasellesHor = numCasellesHor;
        this.getNumCasellesVer = getNumCasellesVer;
    }

    public void crearTablero(){
        Input input = new Input();
        int dificultat;

        dificultat = input.triarDificultatTablero();

        Tablero tablero = new Tablero(dificultat, dificultat);
    }
}
