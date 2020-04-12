package com.example.alumnos.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alumnos.holamundo.MainActivity;
import com.example.alumnos.holamundo.R;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {
    private EditText editnum1, private EditText editnum2;
    private TextView txtResult;
    private Button btnsum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        editnum1 = findViewById(R.id.num1);
        editnum2 = findViewById(R.id.num2);
        txtResult = findViewById(R.id.txtResult);
        btnsum = findViewById(R.id.btnSum);

        btnsum.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String strnum1 = editnum1.getText().toString();
        int num1 = Integer.parseInt(strnum1);
        String strnum2 = editnum2.getText().toString();
        int num2 = Integer.parseInt(strnum2);

        int sum = num1 + num2;

        txtResult.setText(String.valueOf(sum));
    }
}