package com.example.alumnos.grupos.beans;

import android.util.Log;

import com.example.alumnos.grupos.R;

import java.io.Serializable;
import java.util.Random;

public class Band implements Serializable {
    private String name;
    private String bio;
    private int logo;

    public Band(String name) {
        this.name = name;
        logo = randomImage();
    }

    private int randomImage() {
        Random r = new Random();
        int number = r.nextInt(7);
        Log.d("random", "" + number);

        int logo;
        switch (number) {
            case 0:
                logo = R.drawable.logo1;
                break;
            case 1:
                logo = R.drawable.logo2;
                break;
            case 2:
                logo = R.drawable.logo3;
                break;
            case 3:
                logo = R.drawable.logo4;
                break;
            case 4:
                logo = R.drawable.logo5;
                break;
            case 5:
                logo = R.drawable.logo6;
                break;
            case 6:
                logo = R.drawable.logo7;
                break;
            default:
                Log.d("random", "default");
                logo = R.drawable.logo1;
        }

        return logo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public int getLogo() {
        return logo;
    }

}
