package com.example.ryan.geolbuddy;

import android.widget.ImageView;

/**
 * Created by Ryan on 1/28/2016.
 *
 * This class will hold the information for each rock in the flowchart, like the picture and where
 * it goes to next.
 */
public class rockHolder {

    private String description;
    private int next;
    private int previous;
    private int current; //more of a debug thing.
    private int nextNo;
    ImageView helpPicture;

    public CharSequence getNoToast() {
        return noToast;
    }

    public void setNoToast(CharSequence noToast) {
        this.noToast = noToast;
    }

    public CharSequence getYesToast() {
        return yesToast;
    }

    public void setYesToast(CharSequence yesToast) {
        this.yesToast = yesToast;
    }

    CharSequence yesToast, noToast;

    private String whatRock;



    rockHolder(String desc)
    {
        description = desc;
    }

    public int getNextNo() {
        return nextNo;
    }

    public void setNextNo(int nextNo) {
        this.nextNo = nextNo;
    }

    public String getWhatRock() {
        return whatRock;
    }

    public void setWhatRock(String whatRock) {
        this.whatRock = whatRock;
    }
    public String getDescription() {
        return description;
    }

    public ImageView getHelpPicture() {
        return helpPicture;
    }

    public void setHelpPicture(ImageView helpPicture) {
        this.helpPicture = helpPicture;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public int getPrevious() {
        return previous;
    }

    public void setPrevious(int previous) {
        this.previous = previous;
    }

    public int getCurrent() {
        return current;
    }

    public void setCurrent(int current) {
        this.current = current;
    }
}
