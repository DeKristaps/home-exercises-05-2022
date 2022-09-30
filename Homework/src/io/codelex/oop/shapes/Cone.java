package io.codelex.oop.shapes;

public class Cone extends D3Shape{
    int height;
    int width;
    double radius;
    double slant;


    public Cone(int height, int width) {
        this.height = height;
        this.width = width;

        this.slant = Math.sqrt(Math.pow(height,2) * Math.pow(width,2));
        this.radius = width/2;
    }

    @Override
    int calculateVolume() {
        return (int)((1/3)*height*Math.PI*Math.pow(radius,2));
    }

    @Override
    int getArea() {
        return (int)(Math.PI * slant * (width/2));
    }

    @Override
    int getPerimeter() {
        return (int)(2*radius*Math.PI);
    }
}


