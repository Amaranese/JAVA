package com.example.alumnos.grupos.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.example.alumnos.grupos.beans.BandList;

public class BandPreferences {

    private static final String PREFERENCES_NAME = "bands";
    private static final String KEY_BANDS = "bandlist";

    private SharedPreferences sharedPreferences;

    public BandPreferences(Context context) {
        sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME,Context.MODE_PRIVATE);
    }

    public void save(BandList bandList) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        Log.d("save", bandList.toJson());
        editor.putString(KEY_BANDS, bandList.toJson());
        editor.apply();
    }

    public BandList load() {
        String json = sharedPreferences.getString(KEY_BANDS, "");
        Log.d("save", json);
        return BandList.fromJson(json);
    }
}
