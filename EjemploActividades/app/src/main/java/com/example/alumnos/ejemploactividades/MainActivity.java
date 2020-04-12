package com.example.alumnos.ejemploactividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private final String LOG_TAG="MainActivity";
    public static final String KEY_SALUDO="SALUDO";

    private Button btn;
    private EditText edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        edit = findViewById(R.id.edit);

        btn.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        String saludo = edit.getText().toString();
        if(saludo!=null && !saludo.isEmpty()){
            Intent intent = new Intent(MainActivity.this,NewActivity.class);
            intent.putExtra(KEY_SALUDO,saludo);
            startActivity(intent);
            finish();
        }else{
            Toast.makeText(MainActivity.this,"Debes introducir un texto", Toast.LENGTH_LONG).show();
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
