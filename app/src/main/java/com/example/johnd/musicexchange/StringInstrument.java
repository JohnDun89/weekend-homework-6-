package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public abstract class StringInstrument extends Instrument {

    String manufacturer;
    int numberOfStrings;


    public StringInstrument(Double buyPrice, Double sellPrice, String manufacturer, int numberOfStrings) {
        super(buyPrice, sellPrice, manufacturer);
        this.numberOfStrings = numberOfStrings;
    }



    public int getNumberOfStrings(){
        return this.numberOfStrings;
    }


}
