package com.example.listview.Screen.bank_screen.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.listview.R;

public class BankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        String name = getIntent().getStringExtra("name");
        int images = getIntent().getIntExtra("images",0);
        String tollfree = getIntent().getStringExtra("tollFree");
        String bank_balance_no = getIntent().getStringExtra("bbn");

        Toast.makeText(this, name+"\n"+tollfree+"\n"+bank_balance_no, Toast.LENGTH_SHORT).show();
    }
}