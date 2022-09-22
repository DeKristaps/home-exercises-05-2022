package io.codelex.classesandobjects.practice;

public class Point {
    int x;
    int y;

    public Point(int v1, int v2) {
        this.x = v1;
        this.y = v2;
    }

    public static void swapPoints(Point p1, Point p2) {
        int tempX = p1.x;
        int tempY = p1.y;

        p1.x = p2.x;
        p1.y = p2.y;

        p2.x = tempX;
        p2.y = tempY;

    }

    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);

        swapPoints(p1, p2);

        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");

    }
}
