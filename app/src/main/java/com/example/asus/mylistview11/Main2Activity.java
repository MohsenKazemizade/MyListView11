package com.example.asus.mylistview11;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ListView list;
    String[] fruitName;
    String[] fruitDescribe;
    int[] fruitImages = {R.drawable.apple, R.drawable.bellpepper, R.drawable.carrot, R.drawable.broccoli, R.drawable.melon, R.drawable.pineaple, R.drawable.strawberry, R.drawable.watermelon, R.drawable.garlic};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        fruitName = res.getStringArray(R.array.titles);
        fruitDescribe = res.getStringArray(R.array.describtion);

        list = (ListView) findViewById(R.id.myList);

        fruitAdapter adapter = new fruitAdapter(this, fruitName, fruitImages, fruitDescribe);
        list.setAdapter(adapter);


        // string array[] is diffrent from string generic <>
        // tahghigh beshe va barae ferestadane arae az chi estefade shavad
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//                String fn = fruitName.get(position);       in eshtebahe va faghat string generic<> metod dare mesle get()
                Intent intent = new Intent(Main2Activity.this, DetailsActivity.class);

                startActivity(intent);
            }
        });

    }
}

class fruitAdapter extends ArrayAdapter<String> {

    private Context context;
    private int[] images;
    private String[] titleArray;
    private String[] describtionArray;

    fruitAdapter(Context c, String[] titles, int imgs[], String[] desc) {
        super(c, R.layout.list_item, R.id.name, titles);
        this.context = c;
        this.images = imgs;
        this.titleArray = titles;
        this.describtionArray = desc;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.list_item, parent, false);
        ImageView fruitimg = (ImageView) row.findViewById(R.id.fruitImage);
        TextView fruittitles = (TextView) row.findViewById(R.id.name);
        TextView fruitdescribtions = (TextView) row.findViewById(R.id.describtion);

        fruitimg.setImageResource(images[position]);
        fruittitles.setText(titleArray[position]);
        fruitdescribtions.setText(describtionArray[position]);


        Typeface typeface = Typeface.createFromAsset(getContext().getAssets(), "Fonts/Raleway-Regular.ttf");
        fruittitles.setTypeface(typeface);
        fruitdescribtions.setTypeface(typeface);

        return row;
    }
}