package com.drpicox.bowlingKata;

import org.junit.Before;
import org.junit.Test;

import java.sql.SQLException;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class BowlingGameTest {
    private Game g;

    @Before
    public void setUp() throws Exception {
        g = new Game();
    }

    @Test
    public void gutterGame() throws Exception {
        rollMany(20,0);
        assertEquals(0, g.score());
    }

    public void rollMany(int n, int pins){
        for(int i = 0; i<n; i++)
            g.roll(pins);
    }

    @Test
    public void testAllOnes() throws Exception{
        for(int i = 0; i<20; i++)
            g.roll(1);
            assertEquals(20, g.score());

    }




}
