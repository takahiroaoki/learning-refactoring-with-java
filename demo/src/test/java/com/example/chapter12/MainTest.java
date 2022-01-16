package com.example.chapter12;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testMain() {
        IntegerDisplay display = IntegerDisplay.createTestIntegerDisplay();
        display.setValue(1);
        int actual = display.getValue();
        int expected = 1;
        assertEquals(expected, actual);
    }
}
