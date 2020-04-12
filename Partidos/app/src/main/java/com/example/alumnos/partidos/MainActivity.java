package com.example.alumnos.partidos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.alumnos.partidos.adapters.EquiposAdapter;
import com.example.alumnos.partidos.beans.Partido;
import com.example.alumnos.partidos.beans.PartidosList;
import com.example.alumnos.partidos.preferences.PartidosPreferences;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener,
        AdapterView.OnItemClickListener,
        AdapterView.OnItemLongClickListener{

    EditText editEq1,editEq2,editGol1,editGol2;
    Button btnInset;
    ListView listPartidos;
    private PartidosList partidosList;

    public static final String KEY_PARTIDO="PARTIDO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEq1 = findViewById(R.id.editEq1);
        editEq2 = findViewById(R.id.editEq2);
        editGol1 = findViewById(R.id.editGol1);
        editGol2 = findViewById(R.id.editGol2);
        btnInset = findViewById(R.id.btnInsert);
        listPartidos = findViewById(R.id.listPartidos);

        partidosList = new PartidosList();
        EquiposAdapter equiposAdapter = new EquiposAdapter(MainActivity.this,
                R.layout.item_partido,
                partidosList.getPartidos());

        listPartidos.setAdapter(equiposAdapter);

        btnInset.setOnClickListener(MainActivity.this);
        listPartidos.setOnItemClickListener(MainActivity.this);
        listPartidos.setOnItemLongClickListener(MainActivity.this);

    }

    @Override
    protected void onStart() {
        super.onStart();
        PartidosPreferences partidosPreferences = new PartidosPreferences(MainActivity.this);
        PartidosList partidosListAux = partidosPreferences.getListPartidos();
        if(partidosListAux==null){
            partidosListAux = new PartidosList();
        }
        partidosList.getPartidos().clear();
        partidosList.getPartidos().addAll(partidosListAux.getPartidos());

        EquiposAdapter equiposAdapter = (EquiposAdapter) listPartidos.getAdapter();
        equiposAdapter.notifyDataSetChanged();

    }

    @Override
    protected void onPause() {
        super.onPause();
        if(partidosList!=null) {
            PartidosPreferences partidosPreferences = new PartidosPreferences(MainActivity.this);
            partidosPreferences.addListPartidos(partidosList);
        }
    }

    @Override
    public void onClick(View view) {
        if(editEq1.getText().toString()!=null && !editEq1.getText().toString().isEmpty() &&
                editEq2.getText().toString()!=null && !editEq2.getText().toString().isEmpty() &&
                editGol1.getText().toString()!=null && !editGol1.getText().toString().isEmpty() &&
                editGol2.getText().toString()!=null && !editGol2.getText().toString().isEmpty()){
            try {
                Partido partido = new Partido();
                partido.setEquipo1(editEq1.getText().toString());
                partido.setEquipo2(editEq2.getText().toString());
                partido.setGoles1(Integer.parseInt(editGol1.getText().toString()));
                partido.setGoles2(Integer.parseInt(editGol2.getText().toString()));
                partidosList.addPartido(partido);

                //((EquiposAdapter) listPartidos.getAdapter()).notifyDataSetChanged();;

                EquiposAdapter equiposAdapter = (EquiposAdapter) listPartidos.getAdapter();
                equiposAdapter.notifyDataSetChanged();

                editGol1.setText("");
                editGol2.setText("");
                editEq1.setText("");
                editEq2.setText("");
            }catch(Exception ex){
                Toast.makeText(MainActivity.this, "Datos incorrectos",Toast.LENGTH_LONG).show();
            }

        }else{
            Toast.makeText(MainActivity.this, "Todos los datos son obligatorios",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
        Toast.makeText(MainActivity.this,
                "OnItemClick: "+i,
                Toast.LENGTH_LONG).show();
        Partido partido = partidosList.getPartidos().get(i);
        String json = partido.toJson();
        Intent intent = new Intent(MainActivity.this, PartidoActivity.class);
        intent.putExtra(KEY_PARTIDO,json);
        startActivity(intent);
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long id) {
        Toast.makeText(MainActivity.this,
                "OnItemLongClick: "+i,
                Toast.LENGTH_LONG).show();
        partidosList.getPartidos().remove(i);
        EquiposAdapter equiposAdapter = (EquiposAdapter) listPartidos.getAdapter();
        equiposAdapter.notifyDataSetChanged();
        return true;
    }
}
