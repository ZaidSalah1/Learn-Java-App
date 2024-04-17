package com.example.learnjavaapp.Activites;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.learnjavaapp.Adapter.Adapter;
import com.example.learnjavaapp.R;
import com.example.learnjavaapp.model.Model;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Adapter adapter;
    private ArrayList<Model> listData;
    private Model model;
    private ListView listView;

    private TextView txtUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUserName = findViewById(R.id.txtUserName);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        txtUserName.setText(name);


        listView = findViewById(R.id.listView);
        int[] imageList = {R.drawable.code_ic, R.drawable.starting, R.drawable.output, R.drawable.code, R.drawable.variable_ic, R.drawable.comments};
        String[] txtLevelName = {"Introduction", "Java Get Stared", "Java OutPut", "Java Syntax", "Java Variable", "Java Comments"};
        String[] txtLevelInfo = {"What is Java ?", "Run the Code", "Hello World!", "Rules of java", "What is a Java Variable?", "Comments"};

        listData = new ArrayList<>();

        for (int i = 0; i < imageList.length; i++) {
            model = new Model(txtLevelName[i], txtLevelInfo[i], imageList[i]);
            listData.add(model);
        }
        adapter = new Adapter(MainActivity.this, listData);
        listView.setAdapter(adapter);
        listView.setClickable(true);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetaildActivity.class);

                // Get reference to the CardView
                //    CardView cardView = view.findViewById(R.id.introBtn_cardView);

                // Change background color temporarily
                //  cardView.setBackgroundColor(Color.parseColor("#FF0F0F"));

                // Post a delayed action to revert the background color back
//                new Handler().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        cardView.setBackgroundColor(Color.WHITE); // Revert back to original color
//                        cardView.setRadius(30);
//                    }
//                }, 1000); // Delay in milliseconds (e.g., 1000ms = 1 second)


                intent.putExtra("index", i);
                startActivity(intent);
            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "On Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "On Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "On Destroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "On Restart", Toast.LENGTH_SHORT).show();
    }


}