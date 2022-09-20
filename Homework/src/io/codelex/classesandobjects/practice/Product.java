package io.codelex.classesandobjects.practice;

public class Product {
    String name;
    double priceAtStart;
    int amountAtStart;

    public double getPriceAtStart() {
        return priceAtStart;
    }

    public void setPriceAtStart(double priceAtStart) {
        this.priceAtStart = priceAtStart;
    }

    public int getAmountAtStart() {
        return amountAtStart;
    }

    public void setAmountAtStart(int amountAtStart) {
        this.amountAtStart = amountAtStart;
    }

    Product(String name, double priceAtStart, int amountAtStart) {
        this.name = name;
        this.priceAtStart = priceAtStart;
        this.amountAtStart = amountAtStart;


    }

    public void printProduct() {
        System.out.println(name + ", price " + priceAtStart + ", amount " + amountAtStart);
    }

}


