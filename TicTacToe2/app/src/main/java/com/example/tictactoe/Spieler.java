package com.example.tictactoe;

public class Spieler {


    private int Spielernummer;

    public Spieler(int pSpielernummer){

        Spielernummer = pSpielernummer;

    }


    public int get_Spielernummer(){
        return Spielernummer;
    }

    public String Hallo(){

        return "Hallo!";
    }

}
