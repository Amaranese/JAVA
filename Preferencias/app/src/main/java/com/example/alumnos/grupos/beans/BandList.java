package com.example.alumnos.grupos.beans;

import com.google.gson.Gson;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BandList implements Serializable {
    private List<Band> bands;

    public BandList () {
        bands = new ArrayList<>();
    }

    public List<Band> getBands() {
        return bands;
    }

    public void setBands(List<Band> bands) {
        this.bands = bands;
    }

    public Band get(int i) {
        return bands.get(i);
    }

    public void add(Band band) {
        bands.add(band);
    }

    public void remove(int i) {
        bands.remove(i);
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static BandList fromJson(String json) {
        if (json != null && !json.isEmpty()) {
            Gson gson = new Gson();
            return gson.fromJson(json, BandList.class);
        } else {
            return new BandList();
        }
    }
}
