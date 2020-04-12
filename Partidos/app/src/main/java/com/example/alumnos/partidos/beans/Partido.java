package com.example.alumnos.partidos.beans;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Created by ALUMNOS on 20/02/2018.
 */

public class Partido implements Serializable {
    private String equipo1;
    private String equipo2;
    private int goles1;
    private int goles2;

    public Partido() {
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public int getGoles1() {
        return goles1;
    }

    public void setGoles1(int goles1) {
        this.goles1 = goles1;
    }

    public int getGoles2() {
        return goles2;
    }

    public void setGoles2(int goles2) {
        this.goles2 = goles2;
    }

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static Partido fromJson(String json){
        if(json!=null || !json.isEmpty()){
            Gson gson = new Gson();
            return gson.fromJson(json, Partido.class);
        }else{
            return new Partido();
        }
    }
}
