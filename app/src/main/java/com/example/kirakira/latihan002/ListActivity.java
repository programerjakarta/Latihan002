package com.example.kirakira.latihan002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    String[] password = {"kom1","kom2","kom3","kom4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        getSupportActionBar().setTitle("List SuperPass");
    }

    @Override
    protected void onResume() {
        super.onResume();

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,password);
//        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.activity_list,password);
        ListView listview = (ListView) findViewById(R.id.listView);
        listview.setAdapter(adapter);
    }
}
