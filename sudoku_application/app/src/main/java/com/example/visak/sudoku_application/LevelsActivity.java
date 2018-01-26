package com.example.visak.sudoku_application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class LevelsActivity extends AppCompatActivity {

    Button easy;
    Button medium;
    Button hard;
    int category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);
        Intent intent = getIntent();
        category = intent.getExtras().getInt("category");
        Log.d("Extra Value",""+intent.getExtras().getInt("category"));
        easy = (Button)findViewById(R.id.easy);
        medium = (Button)findViewById(R.id.medium);
        hard = (Button)findViewById(R.id.hard);
    }
}
