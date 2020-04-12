package com.example.alumnos.sumalenta25042018;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView sumaTV;
    Button sumaB;
    ProgressBar barraProgreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumaTV= findViewById(R.id.sumaTV);
        sumaB = findViewById(R.id.sumaB);
        sumaB.setOnClickListener(this);

        barraProgreso = findViewById(R.id.barraProgreso);
        barraProgreso.setProgress(75);
    }
    /*
       2 + 3 = 5
       resultado = a; // resultado = 2
       resultado++; // resultado = 3
       resultado++; // resultado = 4
       resultado++; // resultado = 5
    */
    private double sumaLenta(double a, double b) {
        double resultado = a;
        for (int i = 0; i < b; i++) {
            resultado++;
        }
        return resultado;
    }

    @Override
    public void onClick(View view) {
//        double resultado = sumaLenta(2, 1000000000d);
//        sumaTV.setText("La suma es " + resultado);

        SumaLenta sumaLenta = new SumaLenta(sumaTV);
        // Ejecución en serie
//        sumaLenta.execute(2.0, 1000000000d);
        // Ejucución en paralelo
        sumaLenta.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, 2.0, 1000000000d);
    }
}
