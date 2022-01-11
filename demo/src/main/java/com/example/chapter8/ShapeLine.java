package com.example.chapter8;

public class ShapeLine extends Shape {

    protected ShapeLine(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public String getName() {
        return "LINE";
    }

    @Override
    public void draw() {
        System.out.println("drawLine: " + this.toString());
    }

    @Override
    public TypeCode getTypecode() {
        return Shape.TypeCode.LINE;
    }
}
