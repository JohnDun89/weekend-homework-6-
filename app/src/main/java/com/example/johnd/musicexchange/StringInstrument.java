package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public abstract class StringInstrument extends Instrument implements Sellable, Playable {

    String manufacturer;
    int numberOfStrings;



    public StringInstrument(Double buyPrice, Double sellPrice,String name, String manufacturer, int numberOfStrings) {
        super(buyPrice, sellPrice, name, manufacturer);
        this.numberOfStrings = numberOfStrings;
    }



    public int getNumberOfStrings(){
        return this.numberOfStrings;
    }


}
