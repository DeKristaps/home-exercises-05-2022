package io.codelex.generics.practice.exercise4;

class Cage {
    Animal<?> animal;

    Cage(Animal<?> animal) {
        this.animal = animal;
    }

    Animal<?> getAnimal() {
        return animal;
    }
}
