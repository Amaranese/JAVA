package com.example.alumnos.saludo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{

    private Button btnSend;
    private EditText editName;
    private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend = findViewById(R.id.btnSend);
        editName = findViewById(R.id.editName);
        txtName = findViewById(R.id.txtName);

        btnSend.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String name = editName.getText().toString().trim();

        if(name!=null && !name.isEmpty()) {
            txtName.setText(name.toUpperCase());
        }else{
            Toast.makeText(MainActivity.this,
                    "Debes introducir tu nombre " ,
                    Toast.LENGTH_LONG).show();
        }
    }
}
