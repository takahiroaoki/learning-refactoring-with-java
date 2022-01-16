package com.example.chapter13;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.StandardOutputTest;

import org.junit.jupiter.api.Test;

public class MainTest extends StandardOutputTest {
    @Test
    public void testMain() {
        Main.main(new String[0]);
        String expected = getExpectedOutput(
            "1, 5, 3, 4, 6, 3, 3, 4, 5, 3, ",
            "3, 5, 6, 6, 5, 4, 2, 1, 2, 4, ",
            "3, 5, 6, 6, 5, 4, 2, 1, 2, 4, ");
        String actual = getActualOutput();
        assertEquals(expected, actual);
    }
}
