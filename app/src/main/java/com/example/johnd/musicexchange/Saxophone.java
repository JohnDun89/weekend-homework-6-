package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public class Saxophone extends WoodWind  {

    String manufacturer;

    public Saxophone(String manufacturer){
        super(manufacturer);
    }
    public String instrumentNoise() {
        return "Baker Street";
    }
}
