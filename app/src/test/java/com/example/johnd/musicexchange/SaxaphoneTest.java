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
        saxaphone = new Saxophone("Yamaha",true,"unpainted bronze");
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
}
