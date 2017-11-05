package com.example.johnd.musicexchange;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by JohnD on 04/11/2017.
 */

public class ShopNameTest {

    Shop shop;
    Saxophone saxophone;
    DrumStick drumStick;


    @Before
    public void before(){
        shop = new Shop("Vincents Grizzly Music Shop",new ArrayList());
        saxophone = new Saxophone(765.00,500.00,"Yamaha","AS280",true,"unpainted bronze");
        drumStick = new DrumStick(10.00,20.00, "Super Sticks");
    }

    @Test
    public void canGetShopName(){
        assertEquals("Vincents Grizzly Music Shop", shop.getShopName());
    }

   @Test
    public void canAddToInventory(){
        shop.addToArrayList(saxophone);
        assertEquals(saxophone, shop.getInventory().get(0));
   }

    @Test
    public void canReturnArrayOfSellables(){
        shop.addToArrayList(saxophone);
        shop.addToArrayList(drumStick);
        assertEquals(drumStick, shop.getInventory().get(1));
    }


}
