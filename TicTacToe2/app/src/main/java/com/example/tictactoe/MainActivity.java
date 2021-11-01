package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //@Override

    //Spielfeld spielfeld;
    TicTacToe TicTacToeSpiel;
    Gui gui;
    int Durchgang;
    Spieler spieler;
    private  Boolean Sieg;
    private int punkte1;
    private int punkte2;
    private int anfangen;


    protected void onCreate (Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Spielfeld spielfeld = new Spielfeld(this);
        TicTacToeSpiel = new TicTacToe();
        gui = new Gui(this);
        //Spieler Spieler1 = new Spieler(1);
        //Spieler Spieler2 = new Spieler(2);
        Durchgang = 0;
        punkte1 = 0;
        punkte2 = 0;
        spieler = new Spieler(1);
        anfangen = 0;
        gui.spielerReihe(1);




    }

    public void neuesFeld(int pFeld){
        int Feld = pFeld;
        String Wort;
        //gui.ButtonArray[1].setBackground(android.R.color.holo_blue_bright);

        /**if (Durchgang == 8){
            gui.Unentschieden();
            gui.ButtonOff();

        }
         **/


        if ((Durchgang + anfangen) % 2 == 0){
            Wort = TicTacToeSpiel.PositionGeklickt(Feld,1);
            gui.ButtonArray[pFeld].setEnabled(false);
            gui.faerben(Feld,1);
            gui.Textfeld(Wort);

            if(anfangen == 0) {
                Stand(1);
                gui.spielerReihe(2);
            }

            else if (anfangen == 1){
                Stand(1);
                gui.spielerReihe(2);

            }
        }
        else if ((Durchgang + anfangen) % 2 == 1){
            Wort = TicTacToeSpiel.PositionGeklickt(Feld,2);
            gui.ButtonArray[pFeld].setEnabled(false);
            gui.faerben(Feld,2);
            gui.Textfeld(Wort);
            //Stand(2);
            if(anfangen == 0){
                Stand(2);
                gui.spielerReihe(1);
            }

            else if(anfangen == 1){
                Stand(2);
                gui.spielerReihe(1);

            }
            //gui.spielerReihe(2);
            //gui.test();


        }

        Durchgang +=1;

    }

    public void Stand(int Spieler){

        Sieg = TicTacToeSpiel.Stand(Spieler);

        if (Sieg) {
            gui.Sieger(Spieler);
            gui.ButtonOff();
            Durchgang = 0;
            if (Spieler == 1){

                punkte1 += 1;
            }

            else if (Spieler == 2){

                punkte2 += 1;

            }

            gui.punkteAnzeigen(punkte1, punkte2);
        }



        else if (Durchgang == 8){
            gui.Unentschieden();
            gui.ButtonOff();
        }



    }

    public void Restart(){

        if(anfangen == 0){
            anfangen = 1;
            gui.spielerReihe(2);
        }

        else if (anfangen == 1){
            anfangen = 0;
            gui.spielerReihe(1);
        }

        Durchgang = 0;
        gui.ButtonOn();
        gui.Neustart();
        TicTacToeSpiel.Neustart();


    }
}