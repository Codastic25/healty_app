package com.example.td2_mobile_programming;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class SharedActivity extends AppCompatActivity {

    private int shareScore;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared);
    }
}