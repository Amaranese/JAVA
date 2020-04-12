package com.example.alumnos.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{
    private EditText editNum1, editNum2;
    private TextView txtResult;
    private Button btnSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNum1 = findViewById(R.id.editNum1);
        editNum2 = findViewById(R.id.editNum2);
        txtResult = findViewById(R.id.txtResult);
        btnSum = findViewById(R.id.btnSum);

        btnSum.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        try {
            String strNum1 = editNum1.getText().toString();
            int num1 = Integer.parseInt(strNum1);
            //double num1d = Double.parseDouble(strNum1);
            String strNum2 = editNum2.getText().toString();
            int num2 = Integer.parseInt(strNum2);

            int sum = num1 + num2;

            txtResult.setText(String.valueOf(sum));
        }catch(Exception ex){
            Toast.makeText(MainActivity.this,
                    "Formato incorrecto",
                    Toast.LENGTH_LONG).show();
        }

    }
}
