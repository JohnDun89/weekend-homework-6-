package com.example.johnd.musicexchange;

import java.util.ArrayList;

/**
 * Created by JohnD on 03/11/2017.
 */

public abstract class ShopObject implements Sellable {

    Double buyPrice;
    Double sellPrice;
    ArrayList stock;

    public ShopObject(Double buyPrice, Double sellPrice, String name){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.stock = new ArrayList();
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }


    public ArrayList getInventoryStock() {
        return stock;
    }
}
