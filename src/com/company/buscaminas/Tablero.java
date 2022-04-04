package com.company.buscaminas;

public class Tablero {

    private int numCasellesHor;
    private int numCasellesVer;
    private Casella[] caselles;

    public Tablero (int numCasellesHor, int numCasellesVer){
        this.numCasellesHor = numCasellesHor;
        this.numCasellesVer = numCasellesVer;
        this.caselles = new Casella[numCasellesHor + numCasellesVer];
    }

    public static Tablero crearTablero(){
        Input input = new Input();
        int dificultat;

        dificultat = input.triarDificultatTablero();

        return new Tablero(dificultat, dificultat);
    }

    public static Tablero omplirTablero(){
        Tablero tablero = crearTablero();
        System.out.println(tablero.getCaselles().length);
        for (int i = 0; i < tablero.getCaselles().length; i++){
            tablero.getCaselles()[i].crearCasella();
            System.out.println(tablero.getCaselles()[i]);
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
