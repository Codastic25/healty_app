package com.example.td2_mobile_programming;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //variables de mes composants de page que je mets ici pour les avoir en en-tete et les utiliser quand je veux par la suite
        EditText userName = findViewById(R.id.username);//je prends l'id de cet editText pour l'utiliser plus tard
        EditText passWord = findViewById(R.id.password);//je prends l'id de cet editText pour l'utiliser plus tard
        Button loginButton = findViewById(R.id.login_button);//je prends l'id de ce bouton pour l'utiliser plus tard

        loginButton.setOnClickListener(new View.OnClickListener() {//event de mon bouton

                @Override
                public void onClick(View view) {

                    String username = userName.getText().toString().trim();//je récupère le texte de l'editText userName
                    String password = passWord.getText().toString().trim();//je récupère le texte de l'editText passWord

                    if (username.isEmpty() || password.isEmpty()){
                        Toast.makeText(getApplicationContext(), "Please fill your name and password to login", Toast.LENGTH_SHORT).show();
                    } else {

                    Intent intent = new Intent(MainActivity.this, Main2MenuActivity.class);
                    startActivity(intent);
                    }
                }
        });
    }
}