package com.example.johnberkley.nicholascomboapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    Button rps, clicker, guessing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        rps = (Button) findViewById(R.id.rps);
        clicker = (Button) findViewById(R.id.clicker);
        guessing = (Button) findViewById(R.id.guessing);

        rps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Handler handler = new Handler();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(), RPS.class);
                        startActivity(intent);
                    }
                });
            }
        });

        clicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Handler handler = new Handler();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(), ClickerGame.class);
                        startActivity(intent);
                    }
                });
            }
        });

        guessing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Handler handler = new Handler();
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        Intent intent = new Intent(getApplicationContext(), GuessingGame.class);
                        startActivity(intent);
                    }
                });
            }
        });
    }
}
