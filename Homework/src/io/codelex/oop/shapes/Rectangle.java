package io.codelex.oop.shapes;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int getArea() {
        return this.width * this.height;
    }

    @Override
    public int getPerimeter() {
        return 2 * this.height + 2 * this.width;
    }
}
