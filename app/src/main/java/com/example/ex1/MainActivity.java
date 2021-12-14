package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    TextView label , price;
    ListView listItems;
    ArrayList database = new ArrayList();
    Integer tmp = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        label = findViewById(R.id.label);
        price = findViewById(R.id.price);
        listItems = findViewById(R.id.listItemsId);
    }

    public void updateDatabase(View v){
        ++tmp;
        System.out.println("tmp = " + tmp);
        Map<String , Float> reccord = new HashMap<String , Float>();
        String l = "";
        l = label.getText().toString();
        Float p = Float.parseFloat(
                price.getText().toString()
        );
        System.out.println("label = " + l + " price = " + p);
        reccord.put(l,p);
        System.out.println("recored = " + reccord);
        database.add(reccord);
//        reccord.clear();
        for (int i =0 ; i < database.size(); i++){
            System.out.println("i = " + i + " -- " + database.get(i));
        }
        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1 , database);
        listItems.setAdapter(ad);

    }
}