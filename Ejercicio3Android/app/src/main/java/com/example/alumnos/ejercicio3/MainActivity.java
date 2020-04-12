package com.example.alumnos.ejercicio3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView img;
    private Button btnIzq, btnDer;
    private TextView txtCont;
    private int[] imgs = {R.drawable.paper,R.drawable.scissor,R.drawable.stone};
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=0;
        img = findViewById(R.id.img);
        btnIzq = findViewById(R.id.btniz);
        btnDer = findViewById(R.id.btndr);
        txtCont = findViewById(R.id.txtCont);

        btnIzq.setOnClickListener(MainActivity.this);
        btnDer.setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btniz:
                btnDer.setVisibility(View.VISIBLE);
                if(i>0) i--;
                if(i==0) btnIzq.setVisibility(View.INVISIBLE);
                break;
            case R.id.btndr:
                btnIzq.setVisibility(View.VISIBLE);
                if(i<imgs.length-1) i++;
                if(i==imgs.length-1) btnDer.setVisibility(View.INVISIBLE);
                break;
        }
        img.setImageResource(imgs[i]);
        txtCont.setText(String.format("%02d",i + 1));

    }
}


