package com.example.johnd.musicexchange;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by JohnD on 03/11/2017.
 */

public class SaxaphoneTest {

    Saxophone saxaphone;

    @Before
    public void before(){
        saxaphone = new Saxophone("Yamaha");
    }

    @Test
    public void canSaxaphoneReturnInstrumentNoise(){
        assertEquals("Baker Street", saxaphone.instrumentNoise());
    }
}
