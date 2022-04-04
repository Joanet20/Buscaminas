package com.company.buscaminas;

public class Tablero {

    private int numCasellesHor;
    private int numCasellesVer;
    private Casella[] caselles = new Casella[numCasellesHor + numCasellesVer];

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

    public Tablero omplirTablero(){
        Tablero tablero = crearTablero();
        for (int i = 0; i < tablero.getCaselles().length; i++){
            tablero.getCaselles()[i].crearCasella();
        }
        return tablero;
    }


    public int getNumCasellesHor(){
        return numCasellesHor;
    }

    public int getNumCasellesVer(){
        return numCasellesVer;
    }

    public Casella[] getCaselles(){
        return caselles;
    }

    public void setCaselles(Casella[] caselles){
        this.caselles = caselles;
    }


}
