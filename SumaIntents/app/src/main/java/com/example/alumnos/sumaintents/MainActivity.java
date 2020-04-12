package com.example.alumnos.sumaintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText edit1, edit2;
    private Button btn;
    public static final String KEY_NUM1 = "NUM1";
    public static final String KEY_NUM2 = "NUM2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        String txtEdit1 = edit1.getText().toString();
        String txtEdit2 = edit2.getText().toString();

        if(txtEdit1 != null && !txtEdit1.isEmpty() &&
                txtEdit2 != null && !txtEdit2.isEmpty()){
            try {
                int num1 = Integer.parseInt(txtEdit1);
                int num2 = Integer.parseInt(txtEdit2);
                Intent intent = new Intent(MainActivity.this,SumaActivity.class);
                intent.putExtra(KEY_NUM1,num1);
                intent.putExtra(KEY_NUM2,num2);
                startActivity(intent);
                finish();
            }catch(Exception ex){
                Toast.makeText(MainActivity.this,
                        "Los números deben ser enteros",
                        Toast.LENGTH_LONG).show();
            }
        }else{
            Toast.makeText(MainActivity.this,
                    "Los dos campos son obligatorios",
                    Toast.LENGTH_LONG).show();
        }
    }
}
