package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public class Saxophone extends WoodWind  {


    String colour;

    public Saxophone(String manufacturer,Boolean suppliedWithReid, String colour){
        super(manufacturer, suppliedWithReid);
        this.colour = colour;
    }

    public String instrumentNoise() {
        return "Baker Street";
    }

    public String getColour() {
        return this.colour;
    }
}
