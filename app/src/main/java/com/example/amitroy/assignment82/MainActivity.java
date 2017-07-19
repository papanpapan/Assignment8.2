package com.example.amitroy.assignment82;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ListView list;
    String[] name={"Amit Roy","Sumit Mondal","Bidyut Mondal","Palash Gayen","Santanu Pandit","Chanchal Das","Mintu Pada Das"};
    String[] mobile_number={"801320718","9007463481","7278070251","9804328342","9874016020","7278429009","9831138650"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(ListView)findViewById(R.id.list);
        Adapter adapter=new StringAdapter(MainActivity.this,name,mobile_number) ;
        list.setAdapter((ListAdapter) adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,name[position],Toast.LENGTH_SHORT).show();
            }
        });




    }
}
