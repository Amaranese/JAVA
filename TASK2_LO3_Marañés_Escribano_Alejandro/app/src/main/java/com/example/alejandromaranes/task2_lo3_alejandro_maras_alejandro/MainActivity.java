package com.example.alejandromaranes.task2_lo3_alejandro_maras_alejandro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.alejandromaranes.task2_lo3_alejandro_maras_alejandro.adapters.ActoresAdapter;
import com.example.alejandromaranes.task2_lo3_alejandro_maras_alejandro.beans.Actor;
import com.example.alejandromaranes.task2_lo3_alejandro_maras_alejandro.beans.ActoresList;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener,
        AdapterView.OnItemClickListener,
        AdapterView.OnItemLongClickListener{

    EditText editActor1, editActor2;
    Button btnInsert;
    ListView listActores;
    RadioButton editHombre, editMujer;
    private ActoresList actoresList;

    public static final String KEY_ACTOR="ACTOR";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editActor1 = findViewById(R.id.editActor1);
        editActor2 = findViewById(R.id.editActor2);
        editHombre = findViewById(R.id.editHombre);
        editMujer = findViewById(R.id.editMujer);
        btnInsert = findViewById(R.id.btnInsert);
        listActores = findViewById(R.id.listActores);

        actoresList = new ActoresList();
        ActoresAdapter actoresAdapter = new ActoresAdapter(MainActivity.this, R.layout.item_actores, actoresList.getActores());

        listActores.setAdapter(actoresAdapter);

        btnInsert.setOnClickListener(MainActivity.this);
        listActores.setOnItemClickListener(MainActivity.this);
        listActores.setOnItemLongClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View view) {
        if(editActor1.getText().toString()!=null && !editActor1.getText().toString().isEmpty() &&
                editActor2.getText().toString()!=null && !editActor2.getText().toString().isEmpty() &&
                editHombre.getText().toString()!=null && !editHombre.getText().toString().isEmpty() &&
                editMujer.getText().toString()!=null && !editMujer.getText().toString().isEmpty()){
            try {
                Actor actor = new Actor();
                actor.setActor1(editActor1.getText().toString());
                actor.setActor2(editActor2.getText().toString());
                actor.setHombre(Integer.parseInt(editHombre.getText().toString()));
                actor.setMujer(Integer.parseInt(editMujer.getText().toString()));
                actoresList.addActor(actor);

                ActoresAdapter actoresAdapter = (ActoresAdapter) listActores.getAdapter();
                actoresAdapter.notifyDataSetChanged();

                editActor1.setText("");
                editActor2.setText("");
                editHombre.setText("");
                editMujer.setText("");
            }catch(Exception ex){
                Toast.makeText(MainActivity.this, "Datos incorrectos",Toast.LENGTH_LONG).show();
            }

        }else{
            Toast.makeText(MainActivity.this, "Todos los datos son obligatorios",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(MainActivity.this,
                "OnItemClick: "+i,
                Toast.LENGTH_LONG).show();
        Actor actor = actoresList.getActores().get(i);
        String json = actor.toJson();
        Intent intent = new Intent(MainActivity.this, ActorActivity.class);
        intent.putExtra(KEY_ACTOR,json);
        startActivity(intent);
    }


    @Override
    public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

    Toast.makeText(MainActivity.this,
                    "OnItemLongClick: "+i,
                    Toast.LENGTH_LONG).show();
    actoresList.getActores().remove(i);
    ActoresAdapter actoresAdapter =(ActoresAdapter) listActores.getAdapter();
    actoresAdapter.notifyDataSetChanged();
        return false;
    }
}

































