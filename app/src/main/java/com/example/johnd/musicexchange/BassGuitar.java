package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public class BassGuitar extends StringInstrument {

    String manufacturer;

    public BassGuitar(String manufacturer) {
        super(manufacturer);
    }

    public java.lang.String  instrumentNoise(){
        return "Ding Ding";
    }
}

