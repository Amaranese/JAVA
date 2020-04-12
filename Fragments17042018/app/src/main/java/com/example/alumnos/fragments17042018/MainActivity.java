package com.example.alumnos.fragments17042018;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    FragmentA fragmentA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentA = new FragmentA();

        fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.container, fragmentA ,"FragmentATag");
        transaction.commit();

        // Enviar dato a fragment dinámico
        fragmentA.recibirDato(42);

        // Enviar dato a fragment estático
        Fragment fragment = fragmentManager.findFragmentById(R.id.otro_fragment);
        FragmentA a = (FragmentA) fragment;
        a.recibirDato(34345);
    }

    public void aparecerFragment(View view) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Fragment fragment = fragmentManager.findFragmentByTag("FragmentATag");

        if (fragment != null) {
            transaction.remove(fragment);
        } else {
            fragment = new FragmentA();
            transaction.add(R.id.container, fragment ,"FragmentATag");
        }

        transaction.commit();
    }


    public void recibirDato(String texto) {
        Log.d("MainActivity", "Texto: " + texto);
    }
}
