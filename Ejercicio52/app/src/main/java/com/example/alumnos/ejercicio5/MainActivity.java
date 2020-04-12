package com.example.alumnos.ejercicio5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener{

    CheckBox checkDog, checkLion, checkFox;
    ImageView imgDog, imgLion, imgFox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkDog = findViewById(R.id.checkDog);
        checkLion = findViewById(R.id.checkLion);
        checkFox = findViewById(R.id.checkFox);
        imgDog = findViewById(R.id.imgDog);
        imgLion = findViewById(R.id.imgLion);
        imgFox = findViewById(R.id.imgFox);

        checkDog.setOnCheckedChangeListener(MainActivity.this);
        checkLion.setOnCheckedChangeListener(MainActivity.this);
        checkFox.setOnCheckedChangeListener(MainActivity.this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            switch (buttonView.getId()){
                case R.id.checkDog:
                    imgDog.setVisibility(isChecked?View.VISIBLE:View.INVISIBLE);
                    break;
                case R.id.checkLion:
                    imgLion.setVisibility(isChecked?View.VISIBLE:View.INVISIBLE);
                    break;
                case R.id.checkFox:
                    imgFox.setVisibility(isChecked?View.VISIBLE: View.INVISIBLE);
                    break;
            }

    }
}
