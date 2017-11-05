package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */

public interface Sellable {

    Double markup();
    String name();
    String stock(String item);
}
