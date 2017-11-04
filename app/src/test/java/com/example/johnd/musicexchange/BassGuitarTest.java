package com.example.johnd.musicexchange;


import org.junit.Test;
import org.junit.Before;

import static junit.framework.Assert.assertEquals;
/**
 * Created by JohnD on 03/11/2017.
 */

public class BassGuitarTest {

    BassGuitar bassguitar;

    @Before
    public void before(){
        bassguitar = new BassGuitar(3000.00, 2200.00,"Les Paul Custom","Gibson", 6);
    }

    @Test
    public void canBassGuitarReturnNoise(){
        assertEquals("Ding Ding", bassguitar.instrumentNoise());
    }

    @Test
    public void canGuitarReturnNumberOfStrings(){
        assertEquals(6,bassguitar.getNumberOfStrings());
    }
}
