package com.example.tictactoe;

import android.net.wifi.p2p.WifiP2pManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Gui {


    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private TextView textView;
    private Button restart;
    private TextView punkte1;
    private TextView punkte2;
    private TextView spielerReihe;

    MainActivity mainActivity;

    Button[] ButtonArray = new Button[9];
    public Gui(MainActivity pmainActivity){

        mainActivity = pmainActivity;

        button1 = (Button) mainActivity.findViewById(R.id.button1);
        button2 = (Button) mainActivity.findViewById(R.id.button2);
        button3 = (Button) mainActivity.findViewById(R.id.button3);
        button4 = (Button) mainActivity.findViewById(R.id.button4);
        button5 = (Button) mainActivity.findViewById(R.id.button5);
        button6 = (Button) mainActivity.findViewById(R.id.button6);
        button7 = (Button) mainActivity.findViewById(R.id.button7);
        button8 = (Button) mainActivity.findViewById(R.id.button8);
        button9 = (Button) mainActivity.findViewById(R.id.button9);
        restart = (Button) mainActivity.findViewById(R.id.Neustart);
        textView = (TextView) mainActivity.findViewById(R.id.textView27);
        punkte1 = (TextView) mainActivity.findViewById(R.id.Punkte1);
        punkte2 = (TextView) mainActivity.findViewById(R.id.Punkte2);
        spielerReihe = (TextView) mainActivity.findViewById(R.id.SpielerReihe);

        ButtonArray[0] = button1;
        ButtonArray[1] = button2;
        ButtonArray[2] = button3;
        ButtonArray[3] = button4;
        ButtonArray[4] = button5;
        ButtonArray[5] = button6;
        ButtonArray[6] = button7;
        ButtonArray[7] = button8;
        ButtonArray[8] = button9;


        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mainActivity.neuesFeld(0);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mainActivity.neuesFeld(1);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mainActivity.neuesFeld(2);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mainActivity.neuesFeld(3);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mainActivity.neuesFeld(4);

            }
        });
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mainActivity.neuesFeld(5);

            }
        });
        button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mainActivity.neuesFeld(6);

            }
        });
        button8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mainActivity.neuesFeld(7);

            }
        });
        button9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                mainActivity.neuesFeld(8);

            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainActivity.Restart();
            }
        });

    }

    public void faerben(int position, int spieler){


       if (spieler == 1){

            //ButtonArray[position].setBackgroundColor();
            ButtonArray[position].setBackgroundResource(android.R.color.holo_blue_light);
            //ButtonArray[position].setEnabled(false);

        }

        else if (spieler == 2){

            ButtonArray[position].setBackgroundResource(android.R.color.holo_orange_light);
            //ButtonArray[position].setEnabled(false);

        }


    }

    public void Textfeld(String Text){

        textView.setText(Text);


    }

    public void Sieger(int Spieler){

        textView.setText("Spieler" + Spieler + "hat gewonnen!");


    }

    public void ButtonOff(){

        for (int i = 0;i<9;i++){

            ButtonArray[i].setEnabled(false);

        }
    }

    public void ButtonOn(){

        for (int i = 0;i<9;i++){

            ButtonArray[i].setEnabled(true);

        }
    }

    public void Neustart(){

        for (int i = 0;i<9;i++){

            ButtonArray[i].setBackgroundResource(android.R.drawable.btn_default);

        }


    }

    public void Unentschieden(){

        textView.setText("Das Spiel endet unentschieden!");

    }

    public void punkteAnzeigen(int ppunkte1, int ppunkte2){

        punkte1.setText(ppunkte1 + "");
        punkte2.setText(ppunkte2 + "");


    }

    public void spielerReihe(int Spieler){

        if (Spieler == 1){

            spielerReihe.setText("Spieler 1 ist an der Reihe!");
        }

        else if (Spieler == 2){

            spielerReihe.setText("Spieler 2 ist an der Reihe!");
        }
    }

    public void test(){

        for(int i = 0;i<10000;i++){

            textView.setText(i+"");

        }

    }


}
