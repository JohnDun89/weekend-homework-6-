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
        bassguitar = new BassGuitar("Gibson");
    }

    @Test
    public void canBassGuitarReturnNoise(){
        assertEquals("Ding Ding", bassguitar.instrumentNoise());
    }
}
