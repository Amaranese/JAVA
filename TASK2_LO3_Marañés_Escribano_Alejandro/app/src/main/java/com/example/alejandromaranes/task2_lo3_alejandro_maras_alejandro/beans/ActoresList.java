package com.example.alejandromaranes.task2_lo3_alejandro_maras_alejandro.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ActoresList implements Serializable {
    private List<Actor> actores;

    public ActoresList(){ actores = new ArrayList<>();}

    public List<Actor> getActores(){ return actores;}

    public void setActores(List<Actor> actores) { this.actores = actores;}

    public void addActor(Actor actor){ actores.add(actor);}
}
