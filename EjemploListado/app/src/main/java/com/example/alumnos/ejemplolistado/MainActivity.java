package com.example.alumnos.ejemplolistado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.alumnos.ejemplolistado.adapters.AlumnosAdapter;
import com.example.alumnos.ejemplolistado.beans.Alumno;
import com.example.alumnos.ejemplolistado.beans.AlumnoList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private final String LOG_TAG = "MainActivity";

    private EditText editNombre, editNota;
    private CheckBox checkAp;
    private Button btnEnviar;
    private ListView listAlumnos;

    private AlumnoList alumnoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNombre = findViewById(R.id.editNombre);
        editNota = findViewById(R.id.editNota);
        checkAp = findViewById(R.id.checkAp);
        btnEnviar = findViewById(R.id.btnEnviar);
        listAlumnos = findViewById(R.id.listAlumnos);

        alumnoList = new AlumnoList();
        Alumno alumno = new Alumno();
        alumno.setNombre("aaaa");
        alumno.setNota(5);
        alumno.setAprobado(true);
        alumnoList.addAlumno(alumno);
        alumno = new Alumno();
        alumno.setNombre("bbbb");
        alumno.setNota(8);
        alumno.setAprobado(true);
        alumnoList.addAlumno(alumno);

        AlumnosAdapter alumnosAdapter = new AlumnosAdapter(MainActivity.this,
                R.layout.item_alumno,
                alumnoList.getAlumnos());
        listAlumnos.setAdapter(alumnosAdapter);

        btnEnviar.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        if(editNombre.getText().toString()!=null && !editNombre.getText().toString().isEmpty()
                && editNota.getText().toString()!=null && !editNota.getText().toString().isEmpty()){
            try {
                Alumno alumno = new Alumno();
                alumno.setNombre(editNombre.getText().toString());
                alumno.setNota(Integer.parseInt(editNota.getText().toString()));
                alumno.setAprobado(checkAp.isChecked());

                alumnoList.addAlumno(alumno);
                AlumnosAdapter alumnosAdapter = (AlumnosAdapter) listAlumnos.getAdapter();
                alumnosAdapter.notifyDataSetChanged();
                Toast.makeText(MainActivity.this,"El alumno ha sido insertado",Toast.LENGTH_LONG).show();

                editNombre.setText("");
                editNota.setText("");
                checkAp.setChecked(false);
            }catch (Exception ex){
                Toast.makeText(MainActivity.this,"La nota debe ser numérica",Toast.LENGTH_LONG).show();
            }

        }else{
            Toast.makeText(MainActivity.this,"Los datos son obligatorios",Toast.LENGTH_LONG).show();
        }
    }
}
