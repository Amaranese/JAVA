package com.example.alumnos.a4botones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
            private Button btn1;
            private Button btn2;
            private Button btn3;
            private Button btn4;
            private TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);


        btn1.setOnClickListener(MainActivity.this);
        btn2.setOnClickListener(MainActivity.this);
        btn3.setOnClickListener(MainActivity.this);
        btn4.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn1:
                    txt.setText(getString(R.string.txt1));
                break;
            case R.id.btn2:
                txt.setText(getString(R.string.txt2));
                break;
            case R.id.btn3:
                txt.setText(getString(R.string.txt3));
                break;
            case R.id.btn4:
                txt.setText(getString(R.string.txt4));
                break;
        }
    }
}
