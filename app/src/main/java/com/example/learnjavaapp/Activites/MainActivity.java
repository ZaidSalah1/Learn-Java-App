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

    // Declare variables
    private Adapter adapter;
    private ArrayList<Model> listData;
    private Model model;
    private ListView listView;

    private TextView txtUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        txtUserName = findViewById(R.id.txtUserName);
        listView = findViewById(R.id.listView);

        // Get intent extras
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        txtUserName.setText(name);


        // Initialize data
        int[] imageList = {R.drawable.code_ic, R.drawable.starting, R.drawable.output, R.drawable.code, R.drawable.variable_ic, R.drawable.comments};
//        String[] txtLevelName = {"Introduction", "Java Get Stared", "Java OutPut", "Java Syntax", "Java Variable", "Java Comments"};
//        String[] txtLevelInfo = {"What is Java ?", "Run the Code", "Hello World!", "Rules of java", "What is a Java Variable?", "Comments"};

        // Accessing the integer array from Java code

        // Accessing the string arrays from Java code
        String[] txtLevelName = getResources().getStringArray(R.array.txt_level_name);
        String[] txtLevelInfo = getResources().getStringArray(R.array.txt_level_info);


        listData = new ArrayList<>();
        // Populate data
        for (int i = 0; i < imageList.length; i++) {
            model = new Model(txtLevelName[i], txtLevelInfo[i], imageList[i]);
            listData.add(model);
        }
        // Set up ListView
        adapter = new Adapter(MainActivity.this, listData);
        listView.setAdapter(adapter);
        listView.setClickable(true);

        // ListView item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, DetaildActivity.class);
                intent.putExtra("index", i);
                startActivity(intent);
            }
        });

    }

    // Lifecycle methods
    @Override
    protected void onStart() {
        super.onStart();
        //   Toast.makeText(this, "On Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        //  Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //   Toast.makeText(this, "On Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        //  Toast.makeText(this, "On Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //   Toast.makeText(this, "On Destroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        //     Toast.makeText(this, "On Restart", Toast.LENGTH_SHORT).show();
    }


}