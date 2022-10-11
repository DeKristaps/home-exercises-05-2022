package io.codelex.polymorphism.practice.exercise3.exercise5;

public class Advert {
    protected int fee;

    public Advert() {
        fee = 0;
    }

    public Advert(int fee) {
        this.fee = fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int cost() {
        return fee;
    }

    public String toString() {
        return "\nAdvert: Fee=" + fee;
    }
}
