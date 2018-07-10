package com.example.asus.mylistview11;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NumbersAdapter extends ArrayAdapter<String> {


    public NumbersAdapter(@NonNull Context context, @NonNull List<String> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null){
            convertView =
                    LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        String number = getItem(position);
        TextView numerTextView = (TextView) convertView.findViewById(R.id.number);
        numerTextView.setText(number);
        return convertView;
    }

}
