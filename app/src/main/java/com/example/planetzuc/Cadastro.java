package com.example.planetzuc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    //Declarando variáveis
    EditText username, password, repassword;
    Button signup;
    TextView signin;
    PlanetCad CD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        repassword = (EditText) findViewById(R.id.repassword);
        signup = (Button) findViewById(R.id.btnsignup);
        signin = (TextView) findViewById(R.id.btnsignin);
        CD = new PlanetCad(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();

                if (user.equals("") || pass.equals("") || repass.equals(""))
                    Toast.makeText(Cadastro.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
                else {
                    if (pass.equals(repass)) {
                        Boolean checkuser = CD.checkusername(user);
                        if (checkuser == false) {
                            Boolean insert = CD.insertData(user, pass);
                            if (insert == true) {
                                Toast.makeText(Cadastro.this, "Registrado com sucesso", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), Logindois.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(Cadastro.this, "Não foi possível registrar", Toast.LENGTH_SHORT).show();
                            }
                        } else {
                            Toast.makeText(Cadastro.this, "Usuário já existente, por favor fazer o login", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(Cadastro.this, "Senhas não compatíveis", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), Logindois.class);
                startActivity(intent);
            }
        });



    }
}