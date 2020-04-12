package com.example.alumnos.ejemplojson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.alumnos.ejemplojson.beans.Pelicula;

public class PeliculaActivity extends AppCompatActivity {

    private final String LOG_TAG = "PeliculaActivity";

    private TextView txtTitulo, txtDirector, txtAnio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelicula);

        txtAnio = findViewById(R.id.txtAnio);
        txtDirector = findViewById(R.id.txtDirector);
        txtTitulo = findViewById(R.id.txtTitulo);

        Intent intent = getIntent();
        String json = intent.getStringExtra(MainActivity.KEY_PELICULA);
        Log.d(LOG_TAG,"*** JSON: "+json);

        Pelicula pelicula = Pelicula.fromJson(json);

        txtTitulo.setText(pelicula.getTitulo());
        txtDirector.setText(pelicula.getDirector());
        txtAnio.setText(String.valueOf(pelicula.getAnio()));
    }
}
