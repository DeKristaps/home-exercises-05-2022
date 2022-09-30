package io.codelex.oop.shapes;

public class Hexagon extends Shape{

    int width;
    int height;
    private final int NUM_OF_SIDES = 6;

    public Hexagon(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    int getArea() {
        int p = getPerimeter();
        return ((height/2) * p)/2;
    }

    @Override
    int getPerimeter() {
        return width*NUM_OF_SIDES;
    }
}
