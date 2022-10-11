package io.codelex.polymorphism.examples;

public class Eagle extends Bird {
    @Override
    public void makeSound() {
        System.out.println("-- eagle specific sound --");
    }

    @Override
    public boolean canFly() {
        return true;
    }

    public void attack() {
        // dangerously attack enemy
    }
}
