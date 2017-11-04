package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public abstract class WoodWind extends Instrument implements Sellable {

        String manufacturer;
        Boolean suppliedWithReid;

    public WoodWind(Double buyPrice, Double sellPrice, String name, String manufacturer, Boolean suppliedWithReid) {
        super(buyPrice, sellPrice, name, manufacturer);
        this.suppliedWithReid = suppliedWithReid;
    }


    public Boolean getSupliedWithRead(){
        return this.suppliedWithReid;
    }
}
