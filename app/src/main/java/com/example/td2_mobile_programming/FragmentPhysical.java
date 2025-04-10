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
import android.widget.RadioButton;

import java.util.ArrayList;

public class FragmentPhysical extends Fragment {

    private ArrayList<CheckBox> CheckboxPhysic;

    public FragmentPhysical() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // mon objet vue
        View view = inflater.inflate(R.layout.fragment_physical, container, false);
        ArrayList<CheckBox> checkboxPhysic = new ArrayList<>();

        checkboxPhysic.add(view.findViewById(R.id.Severe_difficulty_breathing));
        checkboxPhysic.add(view.findViewById(R.id.Severe_chest_pain));
        checkboxPhysic.add(view.findViewById(R.id.Extreme_fatigue));
        checkboxPhysic.add(view.findViewById(R.id.Confusion_or_disorientation));
        checkboxPhysic.add(view.findViewById(R.id.Loss_of_consciousness));
        checkboxPhysic.add(view.findViewById(R.id.Persistent_high_fever));
        checkboxPhysic.add(view.findViewById(R.id.Dry_cough));
        checkboxPhysic.add(view.findViewById(R.id.Sore_throat));
        checkboxPhysic.add(view.findViewById(R.id.Loss_of_sense_of_taste_or_smell));
        checkboxPhysic.add(view.findViewById(R.id.Headache));
        checkboxPhysic.add(view.findViewById(R.id.Muscle_or_joint_pain));
        checkboxPhysic.add(view.findViewById(R.id.Runny_or_stuffy_nose));
        checkboxPhysic.add(view.findViewById(R.id.Nausea_or_vomiting));
        checkboxPhysic.add(view.findViewById(R.id.Diarrhea));
        checkboxPhysic.add(view.findViewById(R.id.Chills_or_shivers));
        checkboxPhysic.add(view.findViewById(R.id.Abdominal_pain));
        checkboxPhysic.add(view.findViewById(R.id.Skin_rash));
        checkboxPhysic.add(view.findViewById(R.id.Red_irritated_eyes));
        checkboxPhysic.add(view.findViewById(R.id.Difficulty_sleeping));
        checkboxPhysic.add(view.findViewById(R.id.Maintaining_regular_physical_activity));
        checkboxPhysic.add(view.findViewById(R.id.Eating_balanced_diet));
        checkboxPhysic.add(view.findViewById(R.id.Staying_hydrated));
        checkboxPhysic.add(view.findViewById(R.id.Getting_adequate_sleep));

        //bouton submit
        Button goToMental = view.findViewById(R.id.submitPhysique);



        //conditions et ajout du score final






        //aller sur le fragment mental
        goToMental.setOnClickListener(v -> {
                    int finalScore = calculateScore();
                    Bundle args = new Bundle();
                    args.putInt("Score", finalScore);
                    FragmentMentak fragmentMental = new FragmentMentak();
                    fragmentMental.setArguments(args);
                    navigateToFragment(fragmentMental);
                }

                );



        // Retourner la vue
        return view;



    }


    private int calculateScore (){

        int finalScore =0;

        for (CheckBox item : CheckboxPhysic) {
            if (item.isChecked()) {
                finalScore += 5;//calcul du final score, +5 à chaque item séléctionné
            }
        }
        return finalScore;
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