package io.codelex.oop.shapes;

public class Triangle extends Shape {
    int a;
    int b;
    int c;

    final int NUM_OF_SIDES = 3;



    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    int getArea() {
        int halfPerimeter = getPerimeter()/2;
        return (int)Math.sqrt(halfPerimeter*(halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    @Override
    int getPerimeter() {
        return a+b+c;
    }


}

