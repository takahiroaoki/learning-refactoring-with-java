package com.example.chapter8;

public class ShapeOval extends Shape {

    protected ShapeOval(int startx, int starty, int endx, int endy) {
        super(startx, starty, endx, endy);
    }

    @Override
    public TypeCode getTypecode() {
        return Shape.TypeCode.OVAL;
    }

    @Override
    public String getName() {
        return "OVAL";
    }

    @Override
    public void draw() {
        System.out.println("drawOval: " + this.toString());
    }
}
