package com.example.ekasilabalexcdtb.quakereport;

/**
 * Created by eKasiLab Alex CDTB on 2017/11/28.
 */

public class Earthquake {

/** Magnitude of the earthquake*/
private  String mMagnitude;

/** Location  of the earthquake*/
private  String  mLocation;


/** Date of the earthquake*/
private  String  mTime;


/**
 * Constructs a new {@link Earthquake} object.
 * @param magnitude is the magnitude (size) of the earthquake
 * @param  location is the city location of the earthquake
 * @param time
 */
public  Earthquake(String magnitude, String location, String time){
    mMagnitude= magnitude;
    mLocation= location;
    mTime= time;
}
/**
 * Returns th magnitude of the Earthquake.
 */
public  String getMagnitude(){return  mMagnitude;}

    /**
     * Returns th location of the Earthquake.
     */
    public  String getLocation(){return  mLocation;}

    /**
     * Returns th magnitude of the Earthquake.
     */
    public  String getmTime(){return  mTime;}
}
