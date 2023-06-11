package com.example.planetzuc;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Home extends AppCompatActivity {

    View botao, botao1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        botao = findViewById(R.id.btn_homee);


        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home.this,Usuario.class);
                startActivity(intent);
            }
        });

        botao1 = findViewById(R.id.btn_homeee);


        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Home.this,Usuario.class);
                startActivity(intent);
            }
        });








    }}