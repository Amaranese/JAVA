package com.example.alumnos.jsonalumno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.alumnos.jsonalumno.beans.Alumno;

public class AlumnoActivity extends AppCompatActivity {

    private TextView txtNombre, txtNota, txtApro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alumno);

        txtApro = findViewById(R.id.txtApro);
        txtNombre = findViewById(R.id.txtNombre);
        txtNota = findViewById(R.id.txtNota);

        Intent intent = getIntent();
        String json = intent.getStringExtra(MainActivity.KEY_ALUMNO);
        Alumno alumno = Alumno.fromJson(json);

        txtNota.setText("Nota: "+alumno.getNota());
        txtNombre.setText("Nombre: "+alumno.getNombre());
        txtApro.setText("Aprobado: "+(alumno.isAprobado()?"SI":"NO"));
    }
}
