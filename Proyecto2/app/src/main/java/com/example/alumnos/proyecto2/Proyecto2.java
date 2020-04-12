package com.example.alumnos.proyecto2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Proyecto2 extends AppCompatActivity implements View.OnClickListener {
    private Button btnSend;
    private EditText editName;
    private TextView edittxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proyecto2);
        btnSend = findViewById(R.id.btnSend);
        editName = findViewById(R.id.editName);
        btnSend.setOnClickListener(this);
        edittxt= findViewById(R.id.edittxt);
    }
    @Override
    public void onClick(View view) {
        String nombre = editName.getText().toString().trim();
        if (nombre != null && !nombre.isEmpty()) {
            edittxt.setText(nombre.toUpperCase());
            Toast.makeText(Proyecto2.this, "Hello " + nombre, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(Proyecto2.this, "Debes de introducir el nombre ", Toast.LENGTH_LONG).show();
        }
    }
}
