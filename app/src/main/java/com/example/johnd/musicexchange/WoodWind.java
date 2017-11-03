package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public abstract class WoodWind extends Instrument {

        String manufacturer;
        Boolean suppliedWithReid;

    public WoodWind(String manufacturer, Boolean suppliedWithReid) {
        super(manufacturer);
        this.suppliedWithReid = suppliedWithReid;
    }

    public Boolean getSupliedWithRead(){
        return this.suppliedWithReid;
    }
}
