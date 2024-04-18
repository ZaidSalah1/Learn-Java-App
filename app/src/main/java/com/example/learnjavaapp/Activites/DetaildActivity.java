package com.example.learnjavaapp.Activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

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
        }else if (intent.getIntExtra("index",0) == 5){
            setContentView(R.layout.level_comments);
        }
    }

    // Lifecycle methods
    @Override
    protected void onStart() {
        super.onStart();
      //  Toast.makeText(this, "On Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
     //   Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
     //   Toast.makeText(this, "On Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(this, "On Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
       // Toast.makeText(this, "On Destroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
     //   Toast.makeText(this, "On Restart", Toast.LENGTH_SHORT).show();
    }
}