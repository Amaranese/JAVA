package com.example.alumnos.partidos.preferences;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.alumnos.partidos.beans.PartidosList;

/**
 * Created by ALUMNOS on 28/02/2018.
 */

public class PartidosPreferences {

    public static final String NAME_PREFERENCES="partidos";

    public static final String KEY_LIST_PARTIDOS="listPartidos";

    private Context context;
    private SharedPreferences sharedPreferences;

    public PartidosPreferences(Context context) {
        this.context = context;
        sharedPreferences = context.getSharedPreferences(NAME_PREFERENCES,Context.MODE_PRIVATE);
    }

    public void addListPartidos(PartidosList partidosList){
        //SharedPreferences sharedPreferences = context.getSharedPreferences(NAME_PREFERENCES,Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(KEY_LIST_PARTIDOS,partidosList.toJson());
        editor.commit();
    }

    public PartidosList getListPartidos(){
        //SharedPreferences sharedPreferences = context.getSharedPreferences(NAME_PREFERENCES,Context.MODE_PRIVATE);
        String json = sharedPreferences.getString(KEY_LIST_PARTIDOS, "");
        PartidosList partidosList = PartidosList.fromJson(json);
        return partidosList;
    }
}
