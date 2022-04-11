package com.company.buscaminas;

import com.company.buscaminas.TipusDeCasella.EnBlanc;
import com.company.buscaminas.TipusDeCasella.Mina;
import com.company.buscaminas.TipusDeCasella.Numero;

import java.util.ArrayList;

public class Tablero {

    private int numCasellesHor;
    private int numCasellesVer;
    private Casella[][] caselles;
    private int numMines;

    public Tablero (){

    }

    public Tablero (int numCasellesHor, int numCasellesVer){
        this.numCasellesHor = numCasellesHor;
        this.numCasellesVer = numCasellesVer;
        this.caselles = new Casella[numCasellesHor][numCasellesVer];
    }


    public int getNumMines() {
        return numMines;
    }

    public void setNumMines(int numMines) {
        this.numMines = numMines;
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
                tablero.setNumMines(10);
                break;

            case 16:
                numMines = 40;
                tablero.setNumMines(40);
                break;

            case 24:
                numMines = 99;
                tablero.setNumMines(99);
                break;
        }

        generarMines(tablero.getNumCasellesHor(), tablero.getCaselles(), numMines);
        generarNumero(tablero.getCaselles());
        generarBlancs(tablero.getCaselles());
        omplirCasellesColindants(tablero.getCaselles());

        return tablero;
    }

    public void omplirCasellesColindants(Casella[][] casellas){
        for (int i = 0; i < casellas.length; i++){
            for (int j = 0; j < casellas[0].length; j++){

                int x = casellas[i][j].getPosX();
                int y = casellas[i][j].getPosY();

                if (x-1 >= 0 && y-1 >= 0){
                    casellas[i][j].getCasellesColindants().add(new Casella(x-1, y-1));
                }

                if (y-1 >= 0){
                    casellas[i][j].getCasellesColindants().add(new Casella(x, y-1));
                }

                if (x+1 < casellas.length && y-1 >= 0){
                    casellas[i][j].getCasellesColindants().add(new Casella(x+1, y-1));
                }

                if (x-1 >= 0){
                    casellas[i][j].getCasellesColindants().add(new Casella(x-1, y));
                }

                if (x+1 < casellas.length){
                    casellas[i][j].getCasellesColindants().add(new Casella(x+1, y));
                }

                if (x-1 >= 0 && y+1 < casellas.length){
                    casellas[i][j].getCasellesColindants().add(new Casella(x-1, y+1));
                }

                if (y+1 < casellas.length){
                    casellas[i][j].getCasellesColindants().add(new Casella(x, y+1));
                }

                if (x+1 < casellas.length && y+1 < casellas.length){
                    casellas[i][j].getCasellesColindants().add(new Casella(x+1, y+1));
                }
            }
        }


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

    public void destaparBlancs(Casella casella, Casella[][] casellas){
        int x = casella.getPosX();
        int y = casella.getPosY();

        for (Casella casellaActual : casella.getCasellesColindants()){
            if (casellas[casellaActual.getPosX()][casellaActual.getPosY()] instanceof EnBlanc || casellas[casellaActual.getPosX()][casellaActual.getPosY()] instanceof Numero){
                casellas[casellaActual.getPosX()][casellaActual.getPosY()].setDestapada(true);
            }
        }
    }

    public void printTablero(Tablero tablero, Casella[][] caselles, Jugador jugador){
        Output output = new Output();

        output.displayTablero(tablero.getCaselles(), tablero.getNumCasellesHor(), jugador);
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
