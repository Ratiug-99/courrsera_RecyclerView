package com.ratiug.dev.courrsera_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.ratiug.dev.courrsera_recyclerview.Adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    String[] languagesArray;
    String [] descriptionArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_list);

        languagesArray = getResources().getStringArray(R.array.Programing_languages);
        descriptionArray = getResources().getStringArray(R.array.Programing_discrip);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, languagesArray,descriptionArray);
    }
}