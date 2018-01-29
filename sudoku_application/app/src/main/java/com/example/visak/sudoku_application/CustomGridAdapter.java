package com.example.visak.sudoku_application;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by visak on 2018-01-28.
 */

public class CustomGridAdapter extends BaseAdapter {

    private Context context;
    LayoutInflater layoutInflater;
    public ArrayList<ArrayList<Integer>> list;

    public CustomGridAdapter(Context context, ArrayList<ArrayList<Integer>> list){
        this.context = context;
        this.list = list;
        layoutInflater = (LayoutInflater) this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return 81;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null){
            view = layoutInflater.inflate(R.layout.sudoku_grid,null);
        }
        TextView textView = (TextView) view.findViewById(R.id.value);
        textView.setText("");
        return view;
    }
}
