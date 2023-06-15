package com.example.planetzuc;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class buscaplaneta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.planetes);

       View botao1, botao2, botao3;

        botao1 = findViewById(R.id.planetamercurio);


        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(buscaplaneta.this,Apiconex.class);
                startActivity(intent);
            }
        });

        botao2 = findViewById(R.id.planetaterra);


        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(buscaplaneta.this,Terraapi.class);
                startActivity(intent);
            }
        });

        botao3 = findViewById(R.id.planetaurano);


        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(buscaplaneta.this,Uranoapi.class);
                startActivity(intent);
            }
        });


    }}