package com.example.custom;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Sample> values = new ArrayList<>();

    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        values.add(new Sample("bird", "птица", R.drawable.bird));
        values.add(new Sample("rose", "роза", R.drawable.rose));
        values.add(new Sample("horse", "лошадь", R.drawable.horse));
        values.add(new Sample("red_flower", "цветок", R.drawable.red_flower));
        values.add(new Sample("lemon", "лимон", R.drawable.lemon));

        adapter = new MyAdapter(this, R.layout.sample_list, values);
        listView.setAdapter(adapter);

    }
}