package com.example.listview.Screen.home_screen.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listview.R;
import com.example.listview.Screen.bank_screen.view.BankActivity;
import com.example.listview.Screen.home_screen.controller.MyAdapter;

public class MainActivity extends AppCompatActivity {

    private GridView list_view;
    String[] bank ={"ICICI","AXIS","IDBI","BOI","SBI","BOB","PNB"};
    String[] toll_free ={"123","8852","54545","2003","98989","858585","74742"};
    String[] bank_balance_no ={"1230","88520","545450","20030","989890","8585850","747420"};
    int[] images ={R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background,R.drawable.ic_launcher_background};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_view=findViewById(R.id.list_view);

        MyAdapter adapter =new MyAdapter(MainActivity.this,bank,images);
        list_view.setAdapter(adapter);



        list_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, ""+bank[i], Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(MainActivity.this, BankActivity.class);
                intent.putExtra("name",bank[i]);
                intent.putExtra("images",images[i]);
                intent.putExtra("tollFree",toll_free[i]);
                intent.putExtra("bbn",bank_balance_no[i]);
                startActivity(intent);
            }
        });


    }
}