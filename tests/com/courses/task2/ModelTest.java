package com.courses.task2;

import org.junit.Test;

import static org.junit.Assert.*;

public class ModelTest {
    private Model model = new Model();

    @Test
    public void getPlayerInputs() {
        model.startGuess(5);
        assertNotNull(model.getPlayerInputs());
    }

    @Test
    public void getMaxValue() {
        model.setMaxValue(100);
        assertEquals(100, model.getMaxValue());
    }

    @Test
    public void setMaxValue() {
        model.setMaxValue(100);
        assertEquals(100, model.getMaxValue());
    }

    @Test
    public void getMinValue() {
        model.setMinValue(5);
        assertEquals(5, model.getMinValue());
    }

    @Test
    public void setMinValue() {
        model.setMinValue(5);
        assertEquals(5, model.getMinValue());
    }

    @Test
    public void setNeededValue() {
        model.setMinValue(0);
        model.setMaxValue(100);
        boolean testSetValue = false;
        int value;
        for (int i = 0; i < 10_000; i++) {
            value = model.setNeededValue();
            if (value > 0 & value < 100) testSetValue = true;
        }
        assertTrue(testSetValue);
    }

    @Test
    public void testGuess() {
        int value = model.setNeededValue();
        int guess = model.startGuess(value);
        assertEquals(0, guess);
    }
}