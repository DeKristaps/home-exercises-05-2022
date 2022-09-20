package io.codelex.classesandobjects.practice;

public class Exercise1 {
    public static void main(String[] args) {
        Product p1 = new Product("Logitech mouse", 70.00, 14);
        Product p2 = new Product("iPhone 5s", 999.99, 3);
        Product p3 = new Product("Epson EB-U05", 440.46, 1);

        p1.printProduct();
        p2.printProduct();
        p3.printProduct();

        p1.setAmountAtStart(10);
        p1.setPriceAtStart(69.99);

        p1.printProduct();

    }
}
