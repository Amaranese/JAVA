package com.example.alumnos.sumadenumeros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sumadenumeros extends AppCompatActivity implements View.OnClickListener {
        private Button btnSend;
        private EditText editNumero1;
        private EditText editNumero2;
        private TextView edittxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumadenumeros);
        btnSend = findViewById(R.id.btnSend);
        editNumero1 = findViewById(R.id.editNumero1);
        editNumero2 = findViewById(R.id.editNumero2);
        edittxt = findViewById(R.id.edittxt);
    }

    @Override
    public void onClick(View v) {

    }
}
