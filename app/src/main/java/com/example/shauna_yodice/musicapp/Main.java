package com.example.shauna_yodice.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {
    private Button ClarinetButton;

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

    }

    public void openClarinet(){
        Intent intent= new Intent()
    }

}
