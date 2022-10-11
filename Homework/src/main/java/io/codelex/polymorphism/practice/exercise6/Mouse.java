package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal{
    public Mouse(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void eatFood(Food food) {
        if (food instanceof Vegetable){
        super.eatFood(food);
        } else {
            System.out.printf("{%s} are not eating that type of food!", animalType);
        }
    }

    public void makeSound(){
        System.out.println("Squeeek..");
    }
}
