package com.company.buscaminas;

public class Tablero {

    private int numCasellesHor;
    private int numCasellesVer;
    private Casella[] caselles;

    public Tablero (){

    }

    public Tablero (int numCasellesHor, int numCasellesVer){
        this.numCasellesHor = numCasellesHor;
        this.numCasellesVer = numCasellesVer;
        this.caselles = new Casella[numCasellesHor * numCasellesVer];
    }

    public Tablero crearTablero(){
        Input input = new Input();
        int dificultat;

        dificultat = input.triarDificultatTablero();

        return new Tablero(dificultat, dificultat);
    }

    public Tablero omplirTablero(){
        Tablero tablero = crearTablero();
        for (int i = 0; i < tablero.getNumCasellesHor(); i++){
            for (int j = 0; j < tablero.getNumCasellesVer(); j++){
                Casella casella = new Casella(i, j);
                tablero.getCaselles()[i] = casella;
            }
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

    public Casella[] getCaselles(){
        return caselles;
    }

    public void setCaselles(Casella[] caselles){
        this.caselles = caselles;
    }


}
