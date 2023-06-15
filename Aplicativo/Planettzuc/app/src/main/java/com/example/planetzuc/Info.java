package com.example.planetzuc;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infoplaneta);

        View botao1;

        botao1 = findViewById(R.id.voltar);


        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Info.this,Usuario.class);
                startActivity(intent);
            }
        });

    }}