package com.example.visak.sudoku_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.TextView;
import java.util.ArrayList;

public class GameActivity extends AppCompatActivity {

    TextView name;
    GridView gridView;
    ArrayList<ArrayList<Integer>> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        name = (TextView) findViewById(R.id.name);
        gridView = (GridView) findViewById(R.id.grid);
        final CustomGridAdapter customGridAdapter = new CustomGridAdapter(GameActivity.this,list);
        gridView.setAdapter(customGridAdapter);
    }
}
