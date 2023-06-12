package com.example.planetzuc;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Usuario extends AppCompatActivity {

        View botao, botao2, botao3, botao4;

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

        botao4 = findViewById(R.id.btn_teste);


        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Usuario.this,Apiconex.class);
                startActivity(intent);
            }
        });

    }}
