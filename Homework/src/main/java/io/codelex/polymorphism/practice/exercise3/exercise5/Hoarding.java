package io.codelex.polymorphism.practice.exercise3.exercise5;

class Hoarding extends Advert {
    private int rate;
    //per day
    private int numDays;

    public Hoarding(int fee, int numberOfDays, int rate) {
        super(fee);
        numDays = numberOfDays;
        this.rate = rate;
    }

    public int cost() {
        return super.cost() + rate * numDays;
    }


    public String toString() {
        return super.toString() + " Hoarding: Days=" + numDays + " Rate=" + rate;
    }
}