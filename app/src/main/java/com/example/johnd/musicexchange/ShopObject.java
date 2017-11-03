package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public abstract class ShopObject {

    Double buyPrice;
    Double sellPrice;

    public ShopObject(Double buyPrice, Double sellPrice){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }
}
