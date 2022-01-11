package com.example.chapter8;

public class ShapeRectangle extends Shape {

    protected ShapeRectangle(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public TypeCode getTypecode() {
        return Shape.TypeCode.RECTANGLE;
    }

    @Override
    public String getName() {
        return "RECTANGLE";
    }

    @Override
    public void draw() {
        System.out.println("drawRectangle: " + this.toString());
    }
}
