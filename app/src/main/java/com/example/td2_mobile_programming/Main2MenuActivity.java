package com.example.td2_mobile_programming;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2MenuActivity extends AppCompatActivity {

    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        /*
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);  // Afficher une flèche pour revenir en arrière
        }

         */

        Button startAssesmentButton = findViewById(R.id.startAssesment);//je prends l'id de ce bouton pour l'utiliser plus tard

        startAssesmentButton.setOnClickListener(new View.OnClickListener() {//event de mon bouton

            @Override
            public void onClick(View view) {
                Intent goActivity3Intent = new Intent(Main2MenuActivity.this, MainActivity3.class);//on va la page 3
                startActivity(goActivity3Intent);
            }
        });
    }

    //------------------------------------------------------------------------------------------------------------------------------------------

    //link avec mon menu (en couleur noir pour le voir)
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main2_menu, menu);
        Toast.makeText(this, "Menu chargé", Toast.LENGTH_SHORT).show(); // Confirmation que le menu est chargé
        return true;
    }

    //les actions sur les items de mon menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        //je met ici les variables de chaque item pour les utiliser ensuite
        int id = item.getItemId();//correspond à l'élément clické (je reprends son id)

        /*
        Je vais comparer avec les id des éléments du menu

        home => R.id.homeId;
        assesment => R.id.assesmentsId;
        help => R.id.helpId;
         */

        if (id == R.id.homeId){
            Intent goHomeIntent = new Intent(Main2MenuActivity.this, MainActivity.class);//on revient à la page home
            startActivity(goHomeIntent);
        }
        /*

        Pas d'autres events pour les autres items du menu

        if (id == R.id.assesmentsId){

        }
        if (id == R.id.helpId){

        }
         */

        return super.onOptionsItemSelected(item);
    }
}