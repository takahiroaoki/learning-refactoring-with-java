package com.example.chapter2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FindIntTest {
    @Test
    public void testFound() {
        int[] data = {
            1, 9, 0, 2, 8, 5, 6, 3, 4, 7,
        };
        boolean actual = FindInt.find(data, 5);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void testNotFound() {
        int[] data = {
            1, 9, 0, 2, 8, 5, 6, 3, 4, 7,
        };
        boolean actual = FindInt.find(data, 10);
        boolean expected = false;
        assertEquals(expected, actual);
    }
}
