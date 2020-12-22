package com.example.android.quakereport;

public class Earthquake {

    //define the global variables
    private String mMagnitude;
    private String mLocation;
    private String mDate;

    //create the constructor

    public Earthquake(String magnitude, String location, String date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    //getter methods for the global variables
    public String getMagnitude(){ return mMagnitude; }
    public String getLocation(){ return mLocation; }
    public String getDate(){ return mDate; }
}
