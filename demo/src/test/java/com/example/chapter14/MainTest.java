package com.example.chapter14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.StandardOutputTest;

import org.junit.jupiter.api.Test;

public class MainTest extends StandardOutputTest {
    @Test
    public void testMain() {
        Main.main(new String[0]);

        String expected = getExpectedOutput(
            "name=Hiroshi Yuki, mail=hyuki@example.com",
            "name=Tomura, mail=tomura@example.com",
            "name=Hanako Sato, mail=hanako@example.com");
        String actual = getActualOutput();
        assertEquals(expected, actual);
    }
}
