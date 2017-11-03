package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public abstract class Instrument extends ShopObject implements Playable {

    public String manufacturer;


    public Instrument(String manufacturer) {
        this.manufacturer = manufacturer;
    }


}
