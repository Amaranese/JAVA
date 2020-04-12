package com.example.alumnos.estafapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by ALUMNOS on 18/04/2018.
 */

public class CuentaFrament extends Fragment implements View.OnClickListener{

    Button aceptar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cuenta, container, false);
        aceptar = view.findViewById(R.id.aceptar);
        aceptar.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getContext(), "Ha sido usted estafado", Toast.LENGTH_SHORT).show();
    }
}
