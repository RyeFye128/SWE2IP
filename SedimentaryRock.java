package com.example.ryan.geolbuddy;

/**
 * Created by Ryan on 1/15/2016.
 *
 * This will hold the information for a Sedimentary rock.
 */
public class SedimentaryRock {

    private String name;
    private String possibleGrainsWithin;
    private boolean isClastic;
    private String cement;
    private String degreeofSortedness;
    private String isFoundWhere;
    private String generalColor

    /*-----------------------------------------------------------------------------
    * Getters and Setters                                   */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPossibleGrainsWithin() {
        return possibleGrainsWithin;
    }

    public void setPossibleGrainsWithin(String possibleGrainsWithin) {
        this.possibleGrainsWithin = possibleGrainsWithin;
    }

    public boolean isClastic() {
        return isClastic;
    }

    public void setIsClastic(boolean isClastic) {
        this.isClastic = isClastic;
    }

    public String getCement() {
        return cement;
    }

    public void setCement(String cement) {
        this.cement = cement;
    }

    public String getDegreeofSortedness() {
        return degreeofSortedness;
    }

    public void setDegreeofSortedness(String degreeofSortedness) {
        this.degreeofSortedness = degreeofSortedness;
    }

    public String getIsFoundWhere() {
        return isFoundWhere;
    }

    public void setIsFoundWhere(String isFoundWhere) {
        this.isFoundWhere = isFoundWhere;
    }

    public String getGeneralColor() {
        return generalColor;
    }

    public void setGeneralColor(String generalColor) {
        this.generalColor = generalColor;
    }
}

