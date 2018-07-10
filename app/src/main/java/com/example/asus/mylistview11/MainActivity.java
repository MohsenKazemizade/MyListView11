package com.example.asus.mylistview11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Bellpepper");
        fruits.add("Carrot");
        fruits.add("Broccoki");
        fruits.add("Melon");
        fruits.add("Pineapple");
        fruits.add("Strawberry");
        fruits.add("Watermelon");
        fruits.add("Garlic");
//        ArrayList<String> describtion = new ArrayList<>();
//
//        describtion.add("Has antioxidants and flavanoids");
//        describtion.add("Has vitamins C and K");
//        describtion.add("Has vitamin B6 and folate");
//        describtion.add("Has vitamins C and K");
//        describtion.add("Has vitamin C and folate");
//        describtion.add("Has nutrients and Beneficial Plant Compounds");
//        describtion.add("Has thiamin and riboflavin");
//        describtion.add("Has manganese and vitamin B6");
//        describtion.add("Has antioxidants and flavanoids");
//        describtion.add("Has antioxidants and flavanoids");


        FruitsAdapter adapter = new FruitsAdapter(this, fruits);

        ListView listFruits  = (ListView)findViewById(R.id.myList);

        listFruits.setAdapter(adapter);
    }
}
