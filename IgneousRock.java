package com.example.ryan.geolbuddy;

/**
 * Created by Ryan on 1/15/2016.
 *
 * This will hold the information for each Igneous Rock
 */
public class IgneousRock {

    private String name;
    private String mineralsWithin;
    private String texture;
    private int formationTemp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMineralsWithin() {
        return mineralsWithin;
    }

    public void setMineralsWithin(String mineralsWithin) {
        this.mineralsWithin = mineralsWithin;
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public int getFormationTemp() {
        return formationTemp;
    }

    public void setFormationTemp(int formationTemp) {
        this.formationTemp = formationTemp;
    }



}
