package io.codelex.oop.shapes;

public class Exercise1 {


    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 5, 6);
        Rectangle rectangle = new Rectangle(4,9);
        Hexagon hexagon = new Hexagon(9,30);

        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println(hexagon.getArea());
        System.out.println(hexagon.getPerimeter());

    }

}
