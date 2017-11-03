package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public class BassGuitar extends StringInstrument {

    String manufacturer;

    public BassGuitar(Double buyPrice, Double sellPrice,String manufacturer, int numberOfStrings) {
        super(buyPrice, sellPrice, manufacturer, numberOfStrings);
    }

    public java.lang.String  instrumentNoise(){
        return "Ding Ding";
    }
}

