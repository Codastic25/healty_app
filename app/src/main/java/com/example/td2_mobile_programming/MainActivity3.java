package com.example.td2_mobile_programming;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        // Ajouter le fragment dynamiquement
        if (savedInstanceState == null) {
            // Créer le fragment
            FragmentSelectionQuestions questionsFragment = new FragmentSelectionQuestions();
            //FragmentPhysical physicFragment = new FragmentPhysical();

            // Démarrer la transaction de fragment
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.FragmentSelectQuestions, questionsFragment);
            //transaction.replace(R.id.les_pb_physiques, physicFragment);
            transaction.commit();
        }
    }

    //le menu

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
            Intent goHomeIntent = new Intent(MainActivity3.this, MainActivity.class);//on revient à la page home
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