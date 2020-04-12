package com.example.alumnos.contador;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ZASApp2MainActivity extends ActionBarActivity {
    int clicks = 0; /*Declarado como variable "global" dentro de Activity
                     para ser usada en el metodo onClick esto evitara que
                     la variable se vuelva a cero cada vez que se da click
                     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zasapp2_main);
        final Button boton1 = (Button)findViewById(R.id.button1);
        boton1.setText("No has pulsado el boton");
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicks++;
                boton1.setText("Has pulsado el boton "+clicks+" veces");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_zasapp2_main, menu);
        return true;
    }

    public View getMenuInflater() {
        return menuInflater;
    }
}