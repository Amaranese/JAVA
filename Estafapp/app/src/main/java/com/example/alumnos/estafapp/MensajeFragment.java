package com.example.alumnos.estafapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MensajeFragment extends Fragment {

    String mensaje;
    String codigo;

    TextView mensajeTextView;
    TextView codigoTextView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_mensaje, container, false);
        mensajeTextView = view.findViewById(R.id.mensajeTextView);
        codigoTextView = view.findViewById(R.id.codigoTextView);

        mensajeTextView.setText(mensaje);
        codigoTextView.setText("Código: " + codigo);

        return view;
    }

    public void recibirResultado(String mensaje, String codigo) {
        this.mensaje = mensaje;
        this.codigo = codigo;
    }
}
