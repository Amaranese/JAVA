package com.example.alumnos.grupodemusica;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView IronMaiden,LedZeppelin, AmonAmarth, PowerWolf, Vlutarg, Rammstein;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IronMaiden = findViewById(R.id.IronMaiden);
        LedZeppelin = findViewById(R.id.LedZeppelin);
        AmonAmarth = findViewById(R.id.AmonAmarth);
        PowerWolf = findViewById(R.id.PowerWolf);
        Vlutarg = findViewById(R.id.Vlutarg);
        Rammstein = findViewById(R.id.Rammstein);


        list = findViewById(R.id.list);


    }
}
