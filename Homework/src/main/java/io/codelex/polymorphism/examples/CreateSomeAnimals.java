package io.codelex.polymorphism.examples;

import java.util.ArrayList;
import java.util.List;

public class CreateSomeAnimals {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Eagle());
        animals.add(new Owl());
        animals.forEach(animal -> {
            animal.makeSound();
            // wont compile - animal.canFly()
        });
    }
}
