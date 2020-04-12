package com.example.alumnos.ejemplolistado.beans;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ALUMNOS on 14/02/2018.
 */

public class AlumnoList implements Serializable {

    private List<Alumno> alumnos;

    public AlumnoList() {
        alumnos = new ArrayList<>();
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public void addAlumno (Alumno alumno){

        alumnos.add(alumno);
    }

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static AlumnoList fromJson (String json){
        if(json != null && !json.isEmpty()) {
            Gson gson = new Gson();
            return gson.fromJson(json, AlumnoList.class);
        }else{
            return new AlumnoList();
        }
    }
}
