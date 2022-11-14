package io.codelex.generics.practice.exercise4;

abstract class Animal<F extends Food> implements Meat {
    F lunchBag;

    abstract void eat(F food);

    F getLunchBag() {
        return lunchBag;
    }
}
