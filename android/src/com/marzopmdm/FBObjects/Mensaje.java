package com.marzopmdm.FBObjects;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by alejandro on 27/2/18.
 */


@IgnoreExtraProperties
public class Mensaje {

    public String original;

    public Mensaje(){

    }

    public Mensaje(String original){
        this.original=original;
    }
}