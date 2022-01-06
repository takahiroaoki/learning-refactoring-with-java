package com.example.chapter5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.StandardOutputTest;

import org.junit.jupiter.api.Test;

public class MainTest extends StandardOutputTest {
    @Test
    public void testHello() {
        Banner banner = new Banner("Hello");
        banner.print(1);

        String expected = getExpectedOutput(
            "+-----+",
            "|Hello|",
            "+-----+");
        String actual = getActualOutput();

        assertEquals(expected, actual);
    }

    @Test public void testWorld() {
        Banner banner = new Banner("Hello, World!");
        banner.print(3);

        String expected = getExpectedOutput(
            "+-------------+",
            "|Hello, World!|",
            "|Hello, World!|",
            "|Hello, World!|",
            "+-------------+");
        String actual = getActualOutput();

        assertEquals(expected, actual);
    }

    @Test public void testEmpty() {
        Banner banner = new Banner("");
        banner.print(2);

        String expected = getExpectedOutput(
            "++",
            "||",
            "||",
            "++");
        String actual = getActualOutput();

        assertEquals(expected, actual);
    }
}
