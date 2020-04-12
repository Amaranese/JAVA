package com.example.alumnos.menulateral24042018;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    DrawerLayout drawerLayout;
    ActionBarDrawerToggle drawerToggle;
    ListView menuLateral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Soy el título");

        // Poner botón en la barra
        drawerLayout = findViewById(R.id.drawer_layout);
        drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(drawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Escuchar clics en el menú lateral
        menuLateral = findViewById(R.id.menuLateral);
        menuLateral.setOnItemClickListener(this);

        cambiarPantalla(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.comprar:
                Toast.makeText(this, "Comprar!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.ajustes:
                Toast.makeText(this, "Ajustes!", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.perfil:
                Toast.makeText(this, "Perfil!", Toast.LENGTH_SHORT).show();
                return true;
        }

        if (drawerToggle.onOptionsItemSelected(item)) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPostCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        drawerToggle.syncState();
        super.onPostCreate(savedInstanceState, persistentState);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        cambiarPantalla(i);
    }

    private void cambiarPantalla(int i) {
        Fragment fragment = null;

        switch (i) {
            case 0:
                fragment = new InicioFragment();
                setTitle("Inicio");
                break;
        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.contenido, fragment);
        transaction.commit();

        drawerLayout.closeDrawer(GravityCompat.START);
    }
}
