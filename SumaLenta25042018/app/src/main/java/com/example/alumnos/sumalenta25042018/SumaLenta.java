package com.example.alumnos.sumalenta25042018;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

public class SumaLenta extends AsyncTask<Double, Integer, Double> {
    TextView resultadoTV;

    SumaLenta(TextView resultadoTV) {
        this.resultadoTV = resultadoTV;
    }

    @Override
    protected void onPreExecute() {
        resultadoTV.setText("Calculando...");
    }

    @Override
    protected Double doInBackground(Double... numeros) {
        double a = numeros[0];
        double b = numeros[1];
        double intervalo = b / 100;
        double avance = intervalo;

        double resultado = a;
        for (int i = 0; i < b; i++) {
            resultado++;
            if (resultado == avance) {
                int porcentaje = (int) (resultado / intervalo);
                publishProgress(porcentaje);
                avance = avance + intervalo;
            }
        }

        return resultado;
    }

    @Override
    protected void onProgressUpdate(Integer... porcentaje) {
        resultadoTV.setText(porcentaje[0] + "%");
    }

    @Override
    protected void onPostExecute(Double resultado) {
        resultadoTV.setText("El resultado de la suma es " + resultado);
    }
}
