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

        View view = inflater.inflate(R.layout.fragment_selection_questions, container, false);
        Button physic = view.findViewById(R.id.physical);

        physic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentPhysical fragmentPhysical = new FragmentPhysical();
                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragmentContainerView, fragmentPhysical);
                transaction.commit();
            }
        });


        // Inflate the layout for this fragment
        return view;
    }
}