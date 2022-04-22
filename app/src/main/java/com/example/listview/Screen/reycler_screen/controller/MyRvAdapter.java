package com.example.listview.Screen.reycler_screen.controller;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listview.R;
import com.example.listview.Screen.reycler_screen.view.Recycler_Screen;

public class MyRvAdapter extends RecyclerView.Adapter<MyRvAdapter.ViewData> {

    Activity activity;
    String[] city;

    public MyRvAdapter(Recycler_Screen recycler_screen, String[] city) {

        activity = recycler_screen;
        this.city = city;
    }

    @NonNull
    @Override
    public ViewData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(activity).inflate(R.layout.item_rv,parent,false);
        return new ViewData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewData holder, int position) {
            holder.txt.setText(city[position]);
    }

    @Override
    public int getItemCount() {
        return city.length;
    }

    class ViewData extends RecyclerView.ViewHolder {
        TextView txt;
        public ViewData(@NonNull View itemView) {
            super(itemView);

            txt = itemView.findViewById(R.id.txt);
        }
    }
}
