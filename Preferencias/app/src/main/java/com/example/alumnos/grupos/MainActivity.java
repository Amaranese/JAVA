package com.example.alumnos.grupos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.alumnos.grupos.beans.Band;
import com.example.alumnos.grupos.beans.BandList;
import com.example.alumnos.grupos.preferences.BandPreferences;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener, AdapterView.OnItemClickListener {

    ListView listViewBands;
    EditText editTextBandName;
    EditText editTextBandBio;
    Button buttonAdd;

    BandAdapter adapter;
    BandList bands;
    BandPreferences bandPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bandPreferences = new BandPreferences(MainActivity.this);

        editTextBandName = findViewById(R.id.editTextBandName);
        editTextBandBio = findViewById(R.id.editTextBandBio);

        buttonAdd = findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(MainActivity.this);

        listViewBands = findViewById(R.id.listViewBands);
        listViewBands.setOnItemLongClickListener(MainActivity.this);
        listViewBands.setOnItemClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        Band band = new Band(editTextBandName.getText().toString());
        band.setBio(editTextBandBio.getText().toString());
        bands.add(band);
        adapter.notifyDataSetChanged();
        bandPreferences.save(bands);
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
        bands.remove(i);
        adapter.notifyDataSetChanged();
        bandPreferences.save(bands);
        return true; // Para evitar que onItemClick reciba el evento
    }

    @Override
    protected void onStart() {
        super.onStart();
        bands = bandPreferences.load();
        adapter = new BandAdapter(MainActivity.this, R.layout.item, bands.getBands());
        listViewBands.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("name", bands.get(i).getName());
        intent.putExtra("bio", bands.get(i).getBio());
        intent.putExtra("logo1", bands.get(i).getLogo());
        startActivity(intent);
    }
}
