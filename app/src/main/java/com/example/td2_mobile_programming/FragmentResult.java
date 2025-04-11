package com.example.td2_mobile_programming;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

public class FragmentResult extends Fragment {

    public FragmentResult() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_result, container, false);

        // Récupère le score
        int totalScore = 0;
        if (getArguments() != null) {
            totalScore = getArguments().getInt("mentalScoreAndPhysicScore", 0);
        }

        // Affiche le score dans le TextView
        TextView scoreText = view.findViewById(R.id.finalScoreText);
        scoreText.setText("Score total : " + totalScore);

        return view;
    }
}