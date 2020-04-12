package com.example.alumnos.fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        view.setBackgroundColor(Color.RED);
        // Procesos iniciales de las vistas

        // Enviar datos a la actividad contenedora de este fragment
        FragmentActivity fa = getActivity();
        MainActivity mainActivity = (MainActivity) fa;
        mainActivity.recibirDato("hola soy un fragment");

        return view;
    }

    public void recibirDato(int numero) {
        Log.d("FragmentA" , "Número: " + numero);
    }
}
