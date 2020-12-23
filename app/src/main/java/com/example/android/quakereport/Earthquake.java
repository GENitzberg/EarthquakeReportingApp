package com.example.android.quakereport;

public class Earthquake {

    //define the global variables
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mUrl;

    //create the constructor

    public Earthquake(double magnitude, String location, long timeInMilliseconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    //getter methods for the global variables
    public double getMagnitude(){ return mMagnitude; }
    public String getLocation(){ return mLocation; }
    public long getTimeInMilliseconds(){ return mTimeInMilliseconds; }
    public String getUrl(){ return mUrl; }
}
