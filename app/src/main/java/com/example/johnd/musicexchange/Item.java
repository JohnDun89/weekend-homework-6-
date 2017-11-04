package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public abstract class Item extends ShopObject implements Sellable{

    String itemName;
    private String name;

    public Item(Double buyPrice, Double sellPrice, String name) {
        super(buyPrice, sellPrice, name);
        this.name = name;
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }
}
