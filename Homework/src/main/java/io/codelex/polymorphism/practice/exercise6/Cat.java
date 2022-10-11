package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Feline{
    String breed;

    public Cat(String animalType, String animalName,  double animalWeight, String livingRegion,String breed) {
        super(animalName, animalType, animalWeight, livingRegion);
        this.breed = breed;

    }

    public void makeSound(){
        System.out.println("Meawww");
    }

    @Override
    public String toString() {
        return super.toString() + "breed='" + breed + '\'';

    }
}
