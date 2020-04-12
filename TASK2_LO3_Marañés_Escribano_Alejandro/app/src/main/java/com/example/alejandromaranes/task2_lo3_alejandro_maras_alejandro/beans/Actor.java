package com.example.alejandromaranes.task2_lo3_alejandro_maras_alejandro.beans;

import com.google.gson.Gson;

import java.io.Serializable;

public class Actor implements Serializable {
    private String actor1;
    private String actor2;
    private int hombre;
    private int mujer;

    public Actor() {
    }

    public String getActor1() { return actor1; }

    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }

    public int getHombre() {
        return hombre;
    }

    public void setHombre(int hombre) {
        this.hombre = hombre;
    }

    public int getMujer() {
        return mujer;
    }

    public void setMujer(int mujer) {
        this.mujer = mujer;
    }

    public String toJson(){
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static Actor fromJson(String json){
        if(json!=null || !json.isEmpty()){
            Gson gson = new Gson();
            return  gson.fromJson(json, Actor.class);
        }else{
            return new Actor();
        }
    }
}


