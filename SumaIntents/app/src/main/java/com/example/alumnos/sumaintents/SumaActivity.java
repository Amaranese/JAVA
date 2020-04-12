package com.example.alumnos.sumaintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SumaActivity extends AppCompatActivity {
    private TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        txtResult = findViewById(R.id.txtResult);

        Intent intent = getIntent();
        int num1 = intent.getIntExtra(MainActivity.KEY_NUM1,0);
        int num2 = intent.getIntExtra(MainActivity.KEY_NUM2,0);

        int sum = num1 + num2;
        txtResult.setText(String.valueOf(sum));
    }
}
