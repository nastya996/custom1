package com.example.custom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends ArrayAdapter<Sample> {

    private List<Sample> dataList;
    private int layout;
    private int position;
    private View convertView;
    private ViewGroup parent;

    public MyAdapter(Context context, int resource, List<Sample> dataList) {
        super(context, resource, dataList);
        this.dataList = dataList;
        this.layout = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        this.position = position;
        this.convertView = convertView;
        this.parent = parent;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(layout, parent, false);
        }

        Sample sample = dataList.get(position);

        TextView name = convertView.findViewById(R.id.name);
        TextView textName = convertView.findViewById(R.id.textName);
        ImageView image = convertView.findViewById(R.id.image);
        name.setText(sample.name);
        textName.setText(sample.textName);
        image.setImageDrawable(getContext().getResources().getDrawable(sample.image));

        return convertView;
    }
}


