package com.example.korisnik.inspiringpeople;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class InspiringPeople extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inspiring_people);

        //Kod za pozivanje toast-a klikom na gumb

        ImageButton ibCarmack = findViewById(R.id.imgCarmack);
        ibCarmack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.carmackQuote,Toast.LENGTH_LONG).show();
            }
        });

        ImageButton ibLee = findViewById(R.id.imgLee);
        ibLee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.leeQuote,Toast.LENGTH_LONG).show();
            }
        });

        ImageButton ibKatz = findViewById(R.id.imgKatz);
        ibKatz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), R.string.katzQuote,Toast.LENGTH_LONG).show();
            }
        });

        //Scrollable text view

        TextView carmackText = findViewById(R.id.carmackText);
        carmackText.setMovementMethod(new ScrollingMovementMethod());

        TextView leeText = findViewById(R.id.leeText);
        leeText.setMovementMethod(new ScrollingMovementMethod());

        TextView katzText = findViewById(R.id.kantzText);
        katzText.setMovementMethod(new ScrollingMovementMethod());
        }
    }




