package com.example.learnjavaapp.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.learnjavaapp.Activites.MainActivity;
import com.example.learnjavaapp.R;
import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {

    private Button btnLogin;

    public static final String NAME = "NAME";
    public static final String PASS = "PASS";
    public static final String FLAG = "FLAG";
    private boolean flag = false;
    private TextInputLayout editName ;
    private TextInputLayout editPassword;
    private CheckBox checkBox;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toast.makeText(getBaseContext(),"On Create", Toast.LENGTH_LONG).show();

        btnLogin = findViewById(R.id.loginBtn);
        setupView();
        setupSharedPrefs();
        checkPrefs();

//        btnLogin.setOnClickListener(event ->{
//            Intent intent = new Intent(Login.this,MainActivity.class);
//            startActivity(intent);
//        });


    }

    private void setupView(){
        editName = findViewById(R.id.editName);
        editPassword = findViewById(R.id.editPass);
        checkBox = findViewById(R.id.checkbox);
    }

    private void setupSharedPrefs(){
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        editor = sharedPreferences.edit();
    }

    private void checkPrefs(){
        flag = sharedPreferences.getBoolean("FLAG", false);
        if(flag){
            String name = sharedPreferences.getString(NAME, "");
            String password = sharedPreferences.getString(PASS, "");
            editName.getEditText().setText(name);
            editPassword.getEditText().setText(password);
            checkBox.setChecked(true);
        }
    }

    public void btnLoginOnClick(View view){
        String name = editName.getEditText().getText().toString();
        String password = editPassword.getEditText().getText().toString();
        boolean rememberMe = checkBox.isChecked();

        if (rememberMe) {
            editor.putString(NAME, name);
            editor.putString(PASS, password);
            editor.putBoolean(FLAG, true);
        } else {
            editor.remove(NAME);
            editor.remove(PASS);
            editor.putBoolean(FLAG, false);
        }

        // Commit the changes to shared preferences
        editor.apply();

        if(userNameValidation() && passwordValidation()){
            Intent intent = new Intent(Login.this, MainActivity.class);
            intent.putExtra("name", name);
            startActivity(intent);
        }
    }

    private boolean userNameValidation(){
        String name = editName.getEditText().getText().toString().trim();
        if(name.isEmpty()){
            editName.setError("This Field Should Not Be Empty!");
            return false;
        }else{
            editName.setError(null); // Clear the error message
            return true;
        }
    }

    private boolean passwordValidation(){
        String name = editPassword.getEditText().getText().toString().trim();
        if(name.isEmpty()){
            editPassword.setError("This Field Should Not Be Empty!");
            return false;
        }else{
            editPassword.setError(null); // Clear the error message
            return true;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getBaseContext(),"On Start", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getBaseContext(),"on Resume", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getBaseContext(),"on Restart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getBaseContext(),"on Pause", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getBaseContext(),"on Destroy", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getBaseContext(),"on Stop", Toast.LENGTH_LONG).show();
    }
}