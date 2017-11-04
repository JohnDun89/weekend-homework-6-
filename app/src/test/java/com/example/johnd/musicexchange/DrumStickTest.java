package com.example.johnd.musicexchange;

/**
 * Created by JohnD on 03/11/2017.
 */


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

public class DrumStickTest {

    DrumStick drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumStick(12.00,25.00, "Mid price sticks");
    }

    @Test
    public void testMarkupOnDrumStick(){
        assertEquals(13.00, drumSticks.markup(),0.1);
    }

    @Test
    public void testGetDrumStickName(){
        assertEquals("Mid price sticks", drumSticks.name());
    }

    @Test
    public void testCanGetDrumStickSellPrice(){
        assertEquals(25.00, drumSticks.getSellPrice(),0.1);
    }
}
