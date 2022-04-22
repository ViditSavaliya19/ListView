package com.example.listview.Screen.reycler_screen.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.listview.R;
import com.example.listview.Screen.reycler_screen.controller.MyRvAdapter;

public class Recycler_Screen extends AppCompatActivity {

    private RecyclerView rv_view;
    String[] city ={"Surat","Amreli","Bharuch","Vapi","valsad","navsari","Junagadh","Surat","Amreli","Bharuch","Vapi","valsad","navsari","Junagadh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_screen);
        binding();

        MyRvAdapter adapter =new MyRvAdapter(Recycler_Screen.this,city);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Recycler_Screen.this);
        rv_view.setLayoutManager(layoutManager);
        rv_view.setAdapter(adapter);

    }

    void binding()
    {
        rv_view=findViewById(R.id.rv_view);
    }
}