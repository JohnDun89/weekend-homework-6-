package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public abstract class Instrument extends ShopObject implements Playable, Sellable {

    public String manufacturer;


    public Instrument(Double buyPrice, Double sellPrice, String manufacturer) {
        super(buyPrice, sellPrice, name);
        this.manufacturer = manufacturer;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }




}
