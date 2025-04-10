package com.example.td2_mobile_programming;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //ici je déclare mes fragments qui sont dans le meme container

        FragmentSelectionQuestions questionsFragment = new FragmentSelectionQuestions();
        getSupportFragmentManager().beginTransaction().replace(R.id.FragmentContainerAll, questionsFragment).commit();

        /*
        ici pas besoin de les déclarer puisque j'ai deja des event boutons qui les lie

        FragmentPhysical physiqueFragment = new FragmentPhysical();
        getSupportFragmentManager().beginTransaction().replace(R.id.FragmentContainerAll, physiqueFragment).commit();

        FragmentMentak mentalFragment = new FragmentMentak();
        getSupportFragmentManager().beginTransaction().replace(R.id.FragmentContainerAll, mentalFragment).commit();

        FragmentResult resultFragment = new FragmentResult();
        getSupportFragmentManager().beginTransaction().replace(R.id.FragmentContainerAll, resultFragment).commit();

         */
    }

    //le menu
// Inflater le menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main2_menu, menu);
        return true;
    }

    // Gérer les actions sur les items du menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.homeId) {
            Intent goHomeIntent = new Intent(MainActivity3.this, MainActivity.class);
            startActivity(goHomeIntent);
            return true;
        }

        // Ajoute ici des actions pour d'autres items du menu si nécessaire
        return super.onOptionsItemSelected(item);
    }
}