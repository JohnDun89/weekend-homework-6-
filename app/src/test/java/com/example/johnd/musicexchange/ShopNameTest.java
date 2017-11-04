package com.example.johnd.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by JohnD on 04/11/2017.
 */

public class ShopNameTest {

    Shop shop;

    @Before
    public void before(){
        shop = new Shop("Vincents Grizzly Music Shop");
    }

    @Test
    public void canGetShopName(){
        assertEquals("Vincents Grizzly Music Shop", shop.getShopName());
    }
}
