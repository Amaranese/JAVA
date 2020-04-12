package com.example.alumnos.estafapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class CodigoFragment extends Fragment implements View.OnClickListener{

    EditText codigo;
    Button validar;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_codigo, container, false);

        validar = view.findViewById(R.id.validar);
        codigo = view.findViewById(R.id.codigo);

        validar.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        validar.setEnabled(false);

        String codigoIntroducido = codigo.getText().toString();

        FragmentActivity fragmentActivity = getActivity();
        MainActivity mainActivity = (MainActivity) fragmentActivity;
        mainActivity.recibirCodigo(codigoIntroducido);
    }
}
