package com.example.td2_mobile_programming;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class FragmentSelectionQuestions extends Fragment {

    public FragmentSelectionQuestions() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_selection_questions, container, false);
        Button physic = view.findViewById(R.id.physical);//je prends l'id de ce bouton pour l'utiliser plus tard

        physic.setOnClickListener(new View.OnClickListener() {//event de mon bouton

            @Override
            public void onClick(View view) {

                Intent goPhysicintent = new Intent(getActivity(), FragmentPhysical.class);
                startActivity(goPhysicintent);

            }
        });

        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        // Inflater le menu spécifique pour le fragment
        inflater.inflate(R.menu.activity_main2_menu, menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.homeId) {
            Intent goHomeIntent = new Intent(getActivity(), MainActivity.class);
            startActivity(goHomeIntent);
            return true;
        } else if (id == R.id.assesmentsId) {
            // Gérer l'action "Assessments" pour le fragment
            return true;
        } else if (id == R.id.helpId) {
            // Gérer l'action "Help" pour le fragment
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}