package com.example.asus.mylistview11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//
//        ArrayList<String> numbers = new ArrayList<>();
//
//        for (int i = 1; i <= 100; i++) {
//            numbers.add(String.valueOf(i));
//        }
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Strawberry");
        fruits.add("Melon");
        fruits.add("Beroccoky");
        fruits.add("Carrot");
        fruits.add("Garlic");
        fruits.add("Apple");
        fruits.add("Watermelon");
        fruits.add("Pineapple");
        fruits.add("bellpepper");
        /*ArrayList<String> students = new ArrayList<>();
        students.add("Khahani");
        students.add("Javan");
        students.add("Hasani");
        students.add("...");*/

        NumbersAdapter adapter = new NumbersAdapter(this, fruits);

        ListView myList  = (ListView)findViewById(R.id.myList);

        myList.setAdapter(adapter);
    }
}
