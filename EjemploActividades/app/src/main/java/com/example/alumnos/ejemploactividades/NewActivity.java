package com.example.alumnos.ejemploactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;


public class NewActivity extends AppCompatActivity {
    private final String LOG_TAG="NewActivity";

    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        txt = findViewById(R.id.txt);

        Intent intent= getIntent();
        String saludo = intent.getStringExtra(MainActivity.KEY_SALUDO);
        if(saludo!=null && !saludo.isEmpty()){
            txt.setText(saludo);
        }else{
            Log.d(LOG_TAG,"*** saludo null or empty");
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG,"***onStart");
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG,"***onResume");
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG,"***onPause");
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG,"***onStop");
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG,"***onDestroy");
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG,"***onRestart");
        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }

}
