package io.codelex.oop.shapes;

public class Qube extends D3Shape {
    int height;
    int width;

    public Qube(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    int calculateVolume() {
        return (int)(Math.pow(width,3));
    }

    @Override
    int getArea() {
        return (int)(Math.pow(6*width,2));
    }

    @Override
    int getPerimeter() {
        return 12 * width;
    }
}
