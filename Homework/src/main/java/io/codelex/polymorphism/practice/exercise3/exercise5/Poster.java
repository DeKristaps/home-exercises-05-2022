package io.codelex.polymorphism.practice.exercise3.exercise5;

public class Poster extends Advert {

    int dimensions;

    int numberOfCopies;

    int costPerCopy;

    public Poster(int fee, int height, int width, int numberOfCopies, int costPerCopy) {
        super(fee);
        this.dimensions = height * width;
        this.numberOfCopies = numberOfCopies;
        this.costPerCopy = costPerCopy;
    }

    public int cost(){
        return super.cost()+(numberOfCopies * costPerCopy);
    }

    public String toString() {
        return super.toString()
                + " Poster ad: dimensions " + dimensions
                + " Cost per copy " + costPerCopy
                + " Number of copy's " + numberOfCopies;
    }


}
