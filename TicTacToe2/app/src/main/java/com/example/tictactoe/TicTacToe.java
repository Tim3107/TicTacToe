package com.example.tictactoe;


import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TicTacToe {

    int[] Positionen = new int[9];
    //private int[][] SiegFelder = new int [8][3];

    public TicTacToe(){
        //SiegFelder[][]
    }



    public String PositionGeklickt (int Position, int spieler){
        Positionen[Position] = spieler;
        String Wort = "";

        for(int i=0;i<9;i++){
            Wort += "i" + Positionen[i];

        }




        return Wort;
    }
    public boolean Stand(int Spieler){

        if (Spieler == Positionen[0] && Spieler == Positionen[1] && Spieler == Positionen[2]){

            return true;
        }

        else if (Spieler == Positionen[3] && Spieler == Positionen[4] && Spieler == Positionen[5]){

            return true;
        }

        else if (Spieler == Positionen[6] && Spieler == Positionen[7] && Spieler == Positionen[8]){

            return true;
        }

        else if (Spieler == Positionen[0] && Spieler== Positionen[3] && Spieler == Positionen[6]){

            return true;
        }

        else if (Spieler == Positionen[1] && Spieler == Positionen[4] && Spieler== Positionen[7]){

            return true;
        }

        else if (Spieler == Positionen[2] && Spieler == Positionen[5] && Spieler== Positionen[8]){

            return true;
        }

        else if (Spieler == Positionen[0] && Spieler == Positionen[4] && Spieler == Positionen[8]){

            return true;
        }

        else if (Spieler == Positionen[2] && Spieler == Positionen[4] && Spieler == Positionen[6]){

            return true;
        }

        else{

            return false;
        }

    }

    public void Neustart(){

        for (int i = 0;i<9;i++){

            Positionen[i] = 0;

        }



    }
}

