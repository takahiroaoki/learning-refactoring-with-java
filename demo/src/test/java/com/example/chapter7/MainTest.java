package com.example.chapter7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.StandardOutputTest;

import org.junit.jupiter.api.Test;

public class MainTest extends StandardOutputTest {
    @Test
    public void testMain() {
        Main.main(new String[0]);
        String expected = getExpectedOutput(
            "book = [ 0, 世界の歴史, 4800 ]",
            "dvd  = [ 1, ニューヨークの夢・特別版, 3000 ]",
            "soft = [ 2, チューリングマシンエミュレータ, 3200 ]");
        String actual = getActualOutput();
        assertEquals(expected, actual);
    }
}
