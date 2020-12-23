package com.example.android.quakereport;

public class Earthquake {

    //define the global variables
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;

    //create the constructor

    public Earthquake(double magnitude, String location, long timeInMilliseconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    //getter methods for the global variables
    public double getMagnitude(){ return mMagnitude; }
    public String getLocation(){ return mLocation; }
    public long getTimeInMilliseconds(){ return mTimeInMilliseconds; }
}
