package io.codelex.polymorphism.examples;

public abstract class Bird extends Animal {
    private String species;

    public void layEgg() {
        //complex egg laying process...
    }

    public abstract boolean canFly();
}
