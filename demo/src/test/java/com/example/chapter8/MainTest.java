package com.example.chapter8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.StandardOutputTest;

import org.junit.jupiter.api.Test;

public class MainTest extends StandardOutputTest {
    @Test
    public void testMain() {
        Main.main(new String[0]);

        String expected = getExpectedOutput(
            "drawLine: [ LINE, (0, 0)-(100, 200) ]",
            "drawRectangle: [ RECTANGLE, (10, 20)-(30, 40) ]",
            "drawOval: [ OVAL, (100, 200)-(300, 400) ]");
        String actual = getActualOutput();
        assertEquals(expected, actual);
    }
}
