package com.example.shauna_yodice.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {
    private Button ClarinetButton;
    private Button AltoButton;
    private Button FluteButton;
    private Button FrenchButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClarinetButton= (Button) findViewById(R.id.ClarinetButton);
        ClarinetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClarinet();
            }
        });

        AltoButton=(Button) findViewById(R.id.AltoButton);
        AltoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAlto();
            }
        });

        FluteButton=(Button) findViewById(R.id.FluteButton);
        FluteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFlute();
            }
        });

        FrenchButton=(Button) findViewById(R.id.FrenchButton);
        FrenchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFrench();
            }
        });

    }

    public void openClarinet(){
        Intent intent= new Intent(this, Clarinet.class);
        startActivity(intent);
    }

    public void openAlto(){
        Intent intent= new Intent(this,Saxophone.class);
        startActivity(intent);
        }

    public void openFlute(){
        Intent intent= new Intent(this, Flute.class);
        startActivity(intent);
    }

    public void openFrench(){
        Intent intent= new Intent(this, FrenchButon.class);
        startActivity(intent);
    }











}
