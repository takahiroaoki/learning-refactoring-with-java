package com.example.chapter13;

import java.util.*;

public class Dice {
    Random _random;

    public Dice() {
        this(314159L);
    }
    public Dice(long seed) {
        _random = new Random(seed);
    }
    public int nextInt() {
        return _random.nextInt(6) + 1;
    }
    public void setSeed(long seed) {
        _random.setSeed(seed);
    }
}
