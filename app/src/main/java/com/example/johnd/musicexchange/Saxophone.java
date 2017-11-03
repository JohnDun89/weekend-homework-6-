package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public class Saxophone extends WoodWind implements Sellable {


    String colour;

    public Saxophone(Double sellPrice, Double buyPrice, String manufacturer,Boolean suppliedWithReid, String colour){
        super(sellPrice, buyPrice, manufacturer, suppliedWithReid);
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


    public String instrumentNoise() {
        return "Baker Street";
    }

    public String getColour() {
        return this.colour;
    }

    @Override
    public Double markup() {
        return sellPrice -= buyPrice;
    }
}
