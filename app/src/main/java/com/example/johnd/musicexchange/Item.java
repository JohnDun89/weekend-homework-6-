package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public abstract class Item extends ShopObject implements Sellable{

    String itemName;

    public Item(Double buyPrice, Double sellPrice, String itemName) {
        super(buyPrice, sellPrice);
    }

    public String getItemName(){
        return this.itemName;
    }
}
