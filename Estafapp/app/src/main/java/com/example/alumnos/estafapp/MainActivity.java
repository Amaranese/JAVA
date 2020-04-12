package com.example.alumnos.estafapp;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    MensajeFragment mensajeFragment;
    FragmentManager fragmentManager;

    final String CODIGO_GANADOR = "2222";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mensajeFragment = new MensajeFragment();
         fragmentManager = getSupportFragmentManager();
    }

    public void recibirCodigo(String codigo) {
        Log.d("MainActivity", codigo);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.main_layout, mensajeFragment, "MensajeFragment");

        if (codigo.equals(CODIGO_GANADOR)) {
            mensajeFragment.recibirResultado("Has ganado!!!", codigo);
            CuentaFrament cuentaFrament = new CuentaFrament();
            transaction.add(R.id.main_layout, cuentaFrament, "CuentaFragment");
        } else {
            mensajeFragment.recibirResultado("Sigue intentándolo otro día", codigo);
        }

        transaction.commit();
    }
}
