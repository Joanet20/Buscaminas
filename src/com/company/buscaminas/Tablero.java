package com.company.buscaminas;

import com.company.buscaminas.TipusDeCasella.EnBlanc;
import com.company.buscaminas.TipusDeCasella.Mina;
import com.company.buscaminas.TipusDeCasella.Numero;

import java.util.ArrayList;

public class Tablero {

    private int numCasellesHor;
    private int numCasellesVer;
    private Casella[][] caselles;

    public Tablero (){

    }

    public Tablero (int numCasellesHor, int numCasellesVer){
        this.numCasellesHor = numCasellesHor;
        this.numCasellesVer = numCasellesVer;
        this.caselles = new Casella[numCasellesHor][numCasellesVer];
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

        generarMines(tablero.getNumCasellesHor(), tablero.getCaselles(), numMines);
        generarNumero(tablero.getCaselles());
        generarBlancs(tablero.getCaselles());

        return tablero;
    }

    public void generarMines(int maxim, Casella[][] casellas, int numMines){
        for (int i = 0; i < numMines; i++){
            int coordenadaX = (int) Math.floor(Math.random()*maxim);
            int coordenadY = (int) Math.floor(Math.random()*maxim);

            if (casellas[coordenadaX][coordenadY] == null ||
                    (casellas[coordenadaX][coordenadY].getPosX() != coordenadaX &&
                            casellas[coordenadaX][coordenadY].getPosY() != coordenadY)){
                casellas[coordenadaX][coordenadY] = new Mina(coordenadaX, coordenadY);
            } else {
                i--;
            }
        }
    }

    public void generarNumero(Casella[][] caselles){
        for (int i = 0; i < caselles.length; i++){
            for (int j = 0; j < caselles[0].length; j++){
                if (caselles[i][j] instanceof Mina){

                    if ((i-1) > 0 && (j-1) > 0){
                        if (caselles[i-1][j-1] == null){
                            caselles[i-1][j-1] = new Numero(i-1, j-1, 1);
                        } else if (caselles[i-1][j-1] instanceof Numero){
                            ((Numero) caselles[i-1][j-1]).sumarMinaColindant();
                        }
                    }


                    if ((j-1) > 0){
                        if (caselles[i][j-1] == null){
                            caselles[i][j-1] = new Numero(i, j-1, 1);
                        } else if (caselles[i][j-1] instanceof Numero){
                            ((Numero) caselles[i][j-1]).sumarMinaColindant();
                        }
                    }


                    if ((i+1) < caselles.length && (j-1) > 0){
                        if (caselles[i+1][j-1] == null){
                            caselles[i+1][j-1] = new Numero(i+1, j-1, 1);
                        } else if (caselles[i+1][j-1] instanceof Numero){
                            ((Numero) caselles[i+1][j-1]).sumarMinaColindant();
                        }
                    }


                    if ((i-1) > 0){
                        if (caselles[i-1][j] == null){
                            caselles[i-1][j] = new Numero(i-1, j, 1);
                        } else if (caselles[i-1][j] instanceof Numero){
                            ((Numero) caselles[i-1][j]).sumarMinaColindant();
                        }
                    }



                    if ((i+1) < caselles.length){
                        if (caselles[i+1][j] == null){
                            caselles[i+1][j] = new Numero(i+1, j, 1);
                        } else if (caselles[i+1][j] instanceof Numero){
                            ((Numero) caselles[i+1][j]).sumarMinaColindant();
                        }
                    }


                    if ((i-1) > 0 && (j+1) < caselles[0].length){
                        if (caselles[i-1][j+1] == null){
                            caselles[i-1][j+1] = new Numero(i-1, j+1, 1);
                        } else if (caselles[i-1][j+1] instanceof Numero){
                            ((Numero) caselles[i-1][j+1]).sumarMinaColindant();
                        }
                    }


                    if ((j+1) < caselles[0].length){
                        if (caselles[i][j+1] == null){
                            caselles[i][j+1] = new Numero(i, j+1, 1);
                        } else if (caselles[i][j+1] instanceof Numero){
                            ((Numero) caselles[i][j+1]).sumarMinaColindant();
                        }
                    }


                    if ((i+1) < caselles.length && (j+1) < caselles[0].length){
                        if (caselles[i+1][j+1] == null){
                            caselles[i+1][j+1] = new Numero(i+1, j+1, 1);
                        } else if (caselles[i+1][j+1] instanceof Numero){
                            ((Numero) caselles[i+1][j+1]).sumarMinaColindant();
                        }
                    }

                }
            }
        }
    }

    public void generarBlancs(Casella[][] caselles){
        for (int i = 0; i < caselles.length; i++){
            for (int j = 0; j < caselles[0].length; j++){
                if (caselles[i][j] == null){
                    caselles[i][j] = new EnBlanc(i, j);
                }
            }
        }
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

    public Casella[][] getCaselles(){
        return caselles;
    }

    public void setCaselles(Casella[][] caselles){
        this.caselles = caselles;
    }


}
