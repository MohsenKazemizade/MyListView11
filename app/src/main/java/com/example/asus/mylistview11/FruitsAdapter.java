package com.example.asus.mylistview11;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FruitsAdapter extends ArrayAdapter<String> {

    public FruitsAdapter(@NonNull Context context, @NonNull List<String> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        int[] fruits_img =
                {R.drawable.apple,
                        R.drawable.bellpepper,
                        R.drawable.carrot,
                        R.drawable.broccoli,
                        R.drawable.melon,
                        R.drawable.pineaple,
                        R.drawable.strawberry,
                        R.drawable.watermelon,
                        R.drawable.garlic};
//        Resources res ;
//        String[] fruits_describtion = res.getStringArray(R.array.describtion);
        TextView nameFruits = (TextView) convertView.findViewById(R.id.name);
        ImageView imgFruits = (ImageView) convertView.findViewById(R.id.fruitImage);
        TextView desFruits = (TextView) convertView.findViewById(R.id.describtion);
        String fruitName = getItem(position);
        for (int i = 0; i < fruits_img.length; i++) {
            if (position == i) {
                imgFruits.setImageResource(fruits_img[i]);
            }
        }

//        String fruitdes;
//        for (int i = 0; i < fruits_describtion.length; i++) {
//            if (position == i) {
//                fruitdes =
//            }
//        }

        nameFruits.setText(fruitName);
        return convertView;
    }

}