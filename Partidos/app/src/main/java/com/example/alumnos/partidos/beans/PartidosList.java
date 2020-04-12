package com.example.alumnos.partidos.beans;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ALUMNOS on 20/02/2018.
 */

public class PartidosList implements Serializable {
    private List<Partido> partidos;

    public PartidosList() {
        partidos = new ArrayList<>();
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public void addPartido(Partido partido){
        partidos.add(partido);
    }

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static PartidosList fromJson(String json){
        if(json!=null || !json.isEmpty()){
            Gson gson = new Gson();
            return gson.fromJson(json, PartidosList.class);
        }else{
            return new PartidosList();
        }
    }
}
