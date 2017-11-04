package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public class Saxophone extends WoodWind implements Sellable {


    private String name;
    String colour;

    public Saxophone(Double sellPrice, Double buyPrice, String name, Boolean suppliedWithReid, String colour){
        super(sellPrice, buyPrice, name, manufacturer, suppliedWithReid);
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.name = name;
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

    @Override
    public String name() {
        return name;
    }
}
