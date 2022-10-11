package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal{

    String livingRegion;

    public Mammal(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        return super.toString()+ "livingRegion='" + livingRegion + '\'';

    }
}
