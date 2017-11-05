package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public class plectrum extends Item implements Sellable{
    plectrum(Double buyPrice, Double sellPrice, String itemName) {
        super(buyPrice, sellPrice, itemName);
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }


    public Double markup() {
        return sellPrice -= buyPrice;
    }

    @Override
    public String stock(String item) {
        return null;
    }
}
