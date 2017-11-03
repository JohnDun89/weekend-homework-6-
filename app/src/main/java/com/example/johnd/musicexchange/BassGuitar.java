package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public class BassGuitar extends StringInstrument implements Sellable {

    String manufacturer;


    public BassGuitar(Double buyPrice, Double sellPrice,String manufacturer, int numberOfStrings) {
        super(buyPrice, sellPrice, manufacturer, numberOfStrings);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String  instrumentNoise(){
        return "Ding Ding";
    }

    @Override
    public Double markup() {
         return sellPrice -= buyPrice;
    }
}

