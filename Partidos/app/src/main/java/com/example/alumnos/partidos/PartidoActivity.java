package com.example.alumnos.partidos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.alumnos.partidos.beans.Partido;

import static com.example.alumnos.partidos.MainActivity.KEY_PARTIDO;

public class PartidoActivity extends AppCompatActivity
        implements View.OnClickListener{


    private TextView txtEquipo1, txtEquipo2;
    private Button btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partido);

        txtEquipo1 = findViewById(R.id.txtEquipo1);
        txtEquipo2 = findViewById(R.id.txtEquipo2);
        btnExit = findViewById(R.id.btnExit);
        btnExit.setOnClickListener(PartidoActivity.this);

        Intent intent = getIntent();
        String json = intent.getStringExtra(KEY_PARTIDO);
        Partido partido = Partido.fromJson(json);

        txtEquipo1.setText(partido.getEquipo1()+": "+partido.getGoles1());
        txtEquipo2.setText(partido.getEquipo2()+": "+partido.getGoles2());

    }

    @Override
    public void onClick(View view) {
        finish();
    }
}
