package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public class BassGuitar extends StringInstrument implements Sellable {

    String manufacturer;
    String name;


    public BassGuitar(Double buyPrice, Double sellPrice, String name, String manufacturer, int numberOfStrings) {
        super(buyPrice, sellPrice, name, manufacturer, numberOfStrings);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.name = name;
    }


    public String  instrumentNoise(){
        return "Ding Ding";
    }

    @Override
    public Double markup() {
         return sellPrice -= buyPrice;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public String stock(String item) {
        return null;
    }
}

