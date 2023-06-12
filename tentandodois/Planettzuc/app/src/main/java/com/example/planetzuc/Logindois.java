package com.example.planetzuc;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Logindois extends AppCompatActivity {

    EditText username, password;
    Button btn_home;
    PlanetCad CD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logindois);

        username = (EditText) findViewById(R.id.username1);
        password = (EditText) findViewById(R.id.password1);
        btn_home = (Button) findViewById(R.id.btn_home);
        CD = new PlanetCad(this);

        btn_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("")||pass.equals(""))
                    Toast.makeText(Logindois.this, "Por favor preencha todos os campos", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass = CD.checkusernamepassword(user, pass);
                    if(checkuserpass==true){
                        Toast.makeText(Logindois.this, "Login sucedido", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), Usuario.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(Logindois.this, "Senha ou Nome de usuário invalido", Toast.LENGTH_SHORT).show();
                    }
                }
            }

        });
    }
}