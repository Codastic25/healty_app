package com.example.td2_mobile_programming;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class FragmentMentak extends Fragment {


    public FragmentMentak() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // mon objet vue
        View view = inflater.inflate(R.layout.fragment_mentak, container, false);

        //bouton submit pour aller sur le fragment result
        Button goToResult = view.findViewById(R.id.submitMental);


        ArrayList<CheckBox> checkboxMental = new ArrayList<>();

        checkboxMental.add(view.findViewById(R.id.Frequent_feelings_of_sadness_or_hopelessness));
        checkboxMental.add(view.findViewById(R.id.Difficulty_concentrating_or_focusing));
        checkboxMental.add(view.findViewById(R.id.Frequent_mood_swings));
        checkboxMental.add(view.findViewById(R.id.Persistent_anxiety_or_nervousness));
        checkboxMental.add(view.findViewById(R.id.Feeling_overwhelmed_or_unable_to_cope));
        checkboxMental.add(view.findViewById(R.id.Lack_of_interest_in_activities_once_enjoyed));
        checkboxMental.add(view.findViewById(R.id.Sleep_disturbances));
        checkboxMental.add(view.findViewById(R.id.Frequent_irritability));
        checkboxMental.add(view.findViewById(R.id.Positive_social_interactions_or_support));
        checkboxMental.add(view.findViewById(R.id.Practicing_mindfulness_or_relaxation_techniques));
        checkboxMental.add(view.findViewById(R.id.Engaging_in_enjoyable_activities_regularly));

        goToResult.setOnClickListener(v -> {
            int mentalScore = 0;
            for (CheckBox item : checkboxMental) {
                if (item.isChecked()) {
                    mentalScore += 5;
                }
            }

            // On récupère toujours le score physique ici
            int physicalScoreFinal = 0;
            if (getArguments() != null) {
                physicalScoreFinal = getArguments().getInt("physicalScore", 0);
            }

            int totalScore = physicalScoreFinal + mentalScore;

            FragmentResult fragmentResult = new FragmentResult();
            Bundle bundle = new Bundle();
            bundle.putInt("mentalScoreAndPhysicScore", totalScore);
            fragmentResult.setArguments(bundle);

            navigateToFragment(fragmentResult);
        });





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