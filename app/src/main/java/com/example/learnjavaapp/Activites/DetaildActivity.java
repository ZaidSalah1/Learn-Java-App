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


    private TextView levelName,explainLevel;
    private ImageView image,imgExample;
    private CardView exampleCardView;
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
        //setContentView(R.layout.activity_detaild);



    }


}

/*
    setContentView(R.layout.activity_detaild);
        levelName = findViewById(R.id.txtLevelName);
        explainLevel = findViewById(R.id.txtLevelDetails);
        image = findViewById(R.id.imageView);
        exampleCardView = findViewById(R.id.exampleCardView);

        Intent intent = this.getIntent();
        if (intent != null) {
            String name = intent.getStringExtra("name");
            int imageId = intent.getIntExtra("image",0);
            boolean hasExample = intent.getBooleanExtra("example",false);
            String explain = intent.getStringExtra("explain");
            if(hasExample){
                int exampleImgId = intent.getIntExtra("imgExample",0);
                imgExample = findViewById(R.id.exampleImg);
                imgExample.setImageResource(exampleImgId);

            }else{
                exampleCardView.setVisibility(View.GONE);
            }
            levelName.setText(name);
            explainLevel.setText(explain);
            image.setImageResource(imageId);
        }
 */