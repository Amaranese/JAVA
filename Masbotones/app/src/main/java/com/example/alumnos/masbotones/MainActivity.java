package com.example.alumnos.masbotones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private RadioGroup groupColors;
    private TextView txtColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groupColors = findViewById(R.id.groupColors);
        txtColor = findViewById(R.id.txtColor);

        groupColors.setOnCheckedChangeListener(MainActivity.this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int Id) {
        RadioButton radio = findViewById(Id);
        if (radio.isChecked()) {
            txtColor.setText(radio.getText());
            switch (Id) {
                case R.id.radioRed:
                    changeColor(R.color.red);
                    break;
                case R.id.radioGreen:
                    changeColor(R.color.green);
                    break;
                case R.id.radioBlue:
                    changeColor(R.color.blue);
                    break;
            }
        }
    }
    private void changeColor(int colorId){
        txtColor.setTextColor(getResources().getColor(colorId));
    }
}
