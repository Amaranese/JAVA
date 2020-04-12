package com.example.alumnos.ejemplolistado.beans;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 14/02/2018.
 */

public class Alumno implements Serializable {
    private String nombre;
    private boolean aprobado;
    private int nota;

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAprobado() {
        return aprobado;
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static Alumno fromJson (String json){
        if(json != null && !json.isEmpty()) {
            Gson gson = new Gson();
            return gson.fromJson(json, Alumno.class);
        }else{
            return new Alumno();
        }
    }
}
