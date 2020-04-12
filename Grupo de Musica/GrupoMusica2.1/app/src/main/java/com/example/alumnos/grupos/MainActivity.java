package com.example.alumnos.grupos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener {

    ListView listViewBands;
    EditText editTextBandName;
    Button buttonAdd;

    ArrayAdapter<String> adapter;
    ArrayList<String> bands;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bands = new ArrayList<>();
        bands.add("Metallica");

        editTextBandName = findViewById(R.id.editTextBandName);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(MainActivity.this);

        listViewBands = findViewById(R.id.listViewBands);
        adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, bands);
        listViewBands.setAdapter(adapter);
        listViewBands.setOnItemLongClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        Log.d("onclick", editTextBandName.getText().toString());
        bands.add(editTextBandName.getText().toString());
        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        bands.remove(i);
        adapter.notifyDataSetChanged();
        return false;
    }
}
