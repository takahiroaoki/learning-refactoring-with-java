package com.example.chapter10;

public class Position {
    private int _x;
    private int _y;
    public Position(int x, int y) {
        _x = x;
        _y = y;
    }
    public int getX() {
        return _x;
    }
    public int getY() {
        return _y;
    }
    public Position setX(int x) {
        _x = x;
        return this;
    }
    public Position setY(int y) {
        _y = y;
        return this;
    }
    public String toString() {
        return "position(" + _x + ", " + _y + ")";
    }
}
