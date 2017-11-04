package com.example.johnd.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;

/**
 * Created by JohnD on 03/11/2017.
 */

public class SaxaphoneTest {

    Saxophone saxaphone;

    @Before
    public void before(){
        saxaphone = new Saxophone(765.00,500.00,"Yamaha","AS280",true,"unpainted bronze");
    }

    @Test
    public void canSaxaphoneReturnInstrumentNoise(){
        assertEquals("Baker Street", saxaphone.instrumentNoise());
    }

    @Test
    public void canSaxaphoneReturnColour(){
        assertEquals("unpainted bronze",saxaphone.getColour());
    }

    @Test
    public void isSaxaphoneSuppliedWithReid(){
        assertTrue("yes", saxaphone.getSupliedWithRead());
    }

    @Test
    public void getSellPriceOfSaxophone(){
        assertEquals(765.00, saxaphone.getSellPrice());
    }

    @Test
    public void testMarkupInterfaceInSaxophone(){
        assertEquals(265.00,saxaphone.markup(), 0.1);
    }
}
