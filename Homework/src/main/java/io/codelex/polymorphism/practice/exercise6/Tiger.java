package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Feline{
    String livingRegion;

    public Tiger(String animalType, String animalName, double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight,livingRegion);
        this.livingRegion = livingRegion;
    }

    public void eatFood(Food food) {
        if (food instanceof Meat){
            super.eatFood(food);
        } else {
            System.out.printf("{%s} are not eating that type of food!", animalType);
        }
    }

    public void makeSound(){
        System.out.println("Rawrrr....");
    }
}
