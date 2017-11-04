package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public class DrumStick extends Item implements Sellable {
    public DrumStick(Double buyPrice, Double sellPrice, String name) {
        super(buyPrice, sellPrice, name);
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.itemName = itemName;
    }

    @Override
    public Double markup() {
        return sellPrice -= buyPrice;
    }

}
