package com.example.alumnos.ejemplojson.beans;

import com.google.gson.Gson;

import java.io.Serializable;

/**
 * Pelicula
 */

public class Pelicula implements Serializable{

    private String titulo, director;
    private int anio;


    public Pelicula() {
    }


    public Pelicula(String titulo, String director, int anio) {
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static Pelicula fromJson (String json){
        if(json!=null && !json.isEmpty()) {
            Gson gson = new Gson();
            return gson.fromJson(json, Pelicula.class);
        }else{
            return new Pelicula();
        }
    }
}
