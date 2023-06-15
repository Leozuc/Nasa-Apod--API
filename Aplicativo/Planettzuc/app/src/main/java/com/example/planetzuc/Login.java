package com.example.planetzuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class Login extends AppCompatActivity {
    View botao, botao1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

         botao = findViewById(R.id.btn_cadastrar);


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Login.this,Cadastro.class);
                startActivity(intent);
            }
        });

         botao1 = findViewById(R.id.btn_login);


        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Login.this,Logindois.class);
                startActivity(intent);
            }
        });

    }}
