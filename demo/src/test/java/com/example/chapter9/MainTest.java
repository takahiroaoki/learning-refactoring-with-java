package com.example.chapter9;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.StandardOutputTest;

import org.junit.jupiter.api.Test;

public class MainTest extends StandardOutputTest {
    @Test
    public void testIgnore() {
        Logger logger = new Logger();
        logger.log("information #1");

        String expected = getExpectedOutput(
            "Ignoring: information #1");
        String actual = getActualOutput();
        assertEquals(expected, actual);
    }

    @Test
    public void testStart() {
        Logger logger = new Logger();
        logger.log("information #1");
        logger.start();
        logger.log("information #2");
        logger.start();
        logger.log("information #3");

        String expected = getExpectedOutput(
            "Ignoring: information #1",
            "** START LOGGING **",
            "Logging: information #2",
            "Logging: information #3");
        String actual = getActualOutput();
        assertEquals(expected, actual);
    }

    @Test public void testStop() {
        Logger logger = new Logger();
        logger.log("information #1");
        logger.start();
        logger.log("information #2");
        logger.start();
        logger.log("information #3");
        logger.stop();
        logger.log("information #4");
        logger.stop();
        logger.log("information #5");

        String expected = getExpectedOutput(
            "Ignoring: information #1",
            "** START LOGGING **",
            "Logging: information #2",
            "Logging: information #3",
            "** STOP LOGGING **",
            "Ignoring: information #4",
            "Ignoring: information #5");
        String actual = getActualOutput();
        assertEquals(expected, actual);
    }
}
