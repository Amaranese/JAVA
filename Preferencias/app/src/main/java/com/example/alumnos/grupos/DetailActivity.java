package com.example.alumnos.grupos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alumnos.grupos.beans.Band;

public class DetailActivity extends AppCompatActivity {

    TextView textViewName;
    TextView textViewBio;
    ImageView imageViewLogo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        textViewName = findViewById(R.id.textViewNameDetail);
        textViewBio = findViewById(R.id.textViewBioDetail);
        imageViewLogo = findViewById(R.id.imageViewLogoDetail);

        Intent intent = getIntent();
        textViewName.setText(intent.getStringExtra("name"));
        textViewBio.setText(intent.getStringExtra("bio"));
        imageViewLogo.setImageResource(intent.getIntExtra("logo1", 0));
    }
}
