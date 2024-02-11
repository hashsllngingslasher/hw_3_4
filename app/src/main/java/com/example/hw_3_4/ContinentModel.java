package com.example.hw_3_4;

import java.io.Serializable;

public class ContinentModel implements Serializable {

    private String name;
    private String image;

    public ContinentModel(String name, String image){
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }
}