package com.example.learnjavaapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.learnjavaapp.model.Model;
import com.example.learnjavaapp.R;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<Model> {

    // Constructor for the Adapter
    public Adapter(@NonNull Context context, ArrayList<Model> list){
        super(context, R.layout.list_item, list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        // Get the data item for this position
        Model model = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if(view == null){
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Find views within list_item layout
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView txtLevelName = view.findViewById(R.id.txtLevelName);
        TextView txtLevelInfo = view.findViewById(R.id.txtLevelInfo);

        // Populate the data into the template view using the data object
        imageView.setImageResource(model.getImageView());
        txtLevelName.setText(model.getTxtName());
        txtLevelInfo.setText(model.getTxtInfo());

        // Return the completed view to render on screen
        return view;
    }
}
