package com.example.chapter10;

public class Direction {
    private int _x;
    private int _y;

    public Direction(int x, int y) {
        _x = x;
        _y = y;
    }
    public Direction setX(int x) {
        _x = x;
        return this;
    }
    public Direction setY(int y) {
        _y = y;
        return this;
    }
    public int getX() {
        return _x;
    }
    public int getY() {
        return _y;
    }
    public String toString() {
        return "direction(" + _x + ", " + _y + ")";
    }
}
