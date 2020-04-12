package com.example.alumnos.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txt1;
    private EditText edit1;
    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt1 = (TextView)findViewById(R.id.txt1);
        edit1 = (EditText) findViewById(R.id.edit1);
        btn1 = (Button) findViewById(R.id.btn1);

        btn1.setOnClickListener(MainActivity.this);
        /*
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Has pulsado el boton", Toast.LENGTH_LONG).show();
            }
        });
*/
                txt1.setText("Hola Mundo!");


    }

    @Override
    public void onClick(View v) {
        Toast.makeText(MainActivity.this, "Has pulsado el boton", Toast.LENGTH_LONG).show();
    }
}
