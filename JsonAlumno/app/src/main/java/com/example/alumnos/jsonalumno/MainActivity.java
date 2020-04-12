package com.example.alumnos.jsonalumno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alumnos.jsonalumno.beans.Alumno;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private final String LOG_TAG = "MainActivity";
    public static final String KEY_ALUMNO = "ALUMNO";

    private EditText editNombre, editNota;
    private CheckBox checkAp;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNombre = findViewById(R.id.editNombre);
        editNota = findViewById(R.id.editNota);
        checkAp = findViewById(R.id.checkAp);
        btnEnviar = findViewById(R.id.btnEnviar);

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

                Intent intent = new Intent(MainActivity.this, AlumnoActivity.class);
                Log.d(LOG_TAG, "*** "+alumno.toJson());
                intent.putExtra(KEY_ALUMNO,alumno.toJson());
                startActivity(intent);
            }catch (Exception ex){
                Toast.makeText(MainActivity.this,"La nota debe ser numérica",Toast.LENGTH_LONG).show();
            }

        }else{
            Toast.makeText(MainActivity.this,"Los datos son obligatorios",Toast.LENGTH_LONG).show();
        }
    }
}
