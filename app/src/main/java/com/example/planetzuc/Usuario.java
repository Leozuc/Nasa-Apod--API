package com.example.planetzuc;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Usuario extends AppCompatActivity {

        View botao, botao2, botao3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.usuario);

        botao = findViewById(R.id.info_planeta);


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Usuario.this,Info.class);
                startActivity(intent);
            }
        });

        botao2 = findViewById(R.id.btnuser);


        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Usuario.this,Home.class);
                startActivity(intent);
            }
        });

        botao3 = findViewById(R.id.voltar);


        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Usuario.this,Home.class);
                startActivity(intent);
            }
        });

    }}