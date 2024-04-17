package com.example.learnjavaapp.Activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.learnjavaapp.R;

public class DetaildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        if(intent.getIntExtra("index",0) == 0){
            setContentView(R.layout.level_introduction);
        }else if (intent.getIntExtra("index",0) == 1){
             setContentView(R.layout.level_get_started);
        }else if (intent.getIntExtra("index",0) == 2){
            setContentView(R.layout.level_output);
        }else if (intent.getIntExtra("index",0) == 3){
            setContentView(R.layout.level_syntax);
        }else if (intent.getIntExtra("index",0) == 4){
            setContentView(R.layout.level_variables);
        }

    }
}