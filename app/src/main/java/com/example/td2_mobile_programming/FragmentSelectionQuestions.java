package com.example.td2_mobile_programming;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentSelectionQuestions extends Fragment {

    public FragmentSelectionQuestions() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // mon objet vue
        View view = inflater.inflate(R.layout.fragment_selection_questions, container, false);

        //bouton resultat pour aller sur le fragment result
        Button res = view.findViewById(R.id.result);
        res.setOnClickListener(v -> navigateToFragment (new FragmentResult()));

        //bouton physique pour aller sur le fragment physique
        Button physique = view.findViewById(R.id.physical);
        physique.setOnClickListener(v -> navigateToFragment (new FragmentPhysical()));

        //bouton mental pour aller sur le fragment mental
        Button mental = view.findViewById(R.id.mental);
        mental.setOnClickListener(v -> navigateToFragment (new FragmentMentak()));


        // Retourner la vue
        return view;
    }

    private void navigateToFragment(Fragment fragment) {
        // Démarrer la transaction
        FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
        // Naviguer vers mon seul fragment container
        transaction.replace(R.id.FragmentContainerAll, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}

