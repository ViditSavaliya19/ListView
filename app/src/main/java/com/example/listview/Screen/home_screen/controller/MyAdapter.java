package com.example.listview.Screen.home_screen.controller;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listview.R;
import com.example.listview.Screen.home_screen.view.MainActivity;

public class MyAdapter extends BaseAdapter {
    Activity activity;
    String[] bank;
    int[] images;
    public MyAdapter(MainActivity mainActivity, String[] bank, int[] images) {
        activity = mainActivity;
        this.bank =bank;
        this.images=images;
    }

    @Override
    public int getCount() {
        return bank.length;
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = LayoutInflater.from(activity).inflate(R.layout.item,viewGroup,false);
        TextView txt = view1.findViewById(R.id.txt);
        ImageView img =view1.findViewById(R.id.img);
        txt.setText(bank[i]);
        img.setImageResource(images[i]);

        return view1;
    }
}
