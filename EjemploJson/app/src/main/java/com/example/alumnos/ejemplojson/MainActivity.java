package com.example.alumnos.ejemplojson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.alumnos.ejemplojson.beans.Pelicula;


public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {
    private final String LOG_TAG = "MainActivity";
    public static final String KEY_PELICULA = "PELICULA";

    EditText editTitulo, editAnio, editDirector;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTitulo = findViewById(R.id.editTitulo);
        editAnio = findViewById(R.id.editAnio);
        editDirector = findViewById(R.id.editDirector);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(MainActivity.this);

    }

    @Override
    public void onClick(View view) {
        if (editTitulo.getText().toString() != null &&
                !editTitulo.getText().toString().isEmpty() &&
                editDirector.getText().toString() != null &&
                !editDirector.getText().toString().isEmpty() &&
                editAnio.getText().toString() != null &&
                !editAnio.getText().toString().isEmpty()) {

            Pelicula p = new Pelicula();
            p.setTitulo(editTitulo.getText().toString());
            p.setDirector(editDirector.getText().toString());
            p.setAnio(Integer.parseInt(editAnio.getText().toString()));

            String json = p.toJson();
            Log.d(LOG_TAG,"*** json: "+json);

            Intent intent = new Intent(MainActivity.this,PeliculaActivity.class);
            intent.putExtra(KEY_PELICULA, json);
            startActivity(intent);
        }
    }
}
