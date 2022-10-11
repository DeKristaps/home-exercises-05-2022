package io.codelex.polymorphism.practice.exercise6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        Animal currentAnimal = null;
        Food food;
        int lineCounter = 0;

        System.out.println("Enter information about the animal in the following format: ");
        System.out.println("{AnimalType} {AnimalName} {AnimalWeight} {AnimalLivingRegion} {CatBreed} = Only if its cat");


        while (true) {

            String[] animal = userInput.nextLine().split(" ");
            if (animal[0].equals("end")) {
                System.out.println(animals);
                break;
            }
            if (lineCounter % 2 == 0) {
                if (animal.length > 4) {
                    currentAnimal = new Cat(animal[0], animal[1], (Double.parseDouble(animal[2])), animal[3], animal[4]);
                } else {
                    switch (animal[0].toLowerCase()) {
                        case "mouse":
                            currentAnimal = new Mouse(animal[0], animal[1], (Double.parseDouble(animal[2])), animal[3]);
                            break;
                        case "zebra":
                            currentAnimal = new Zebra(animal[0], animal[1], (Double.parseDouble(animal[2])), animal[3]);
                            break;
                        case "tiger":
                            currentAnimal = new Tiger(animal[0], animal[1], (Double.parseDouble(animal[2])), animal[3]);
                            break;
                        default:
                            System.out.println("No such animal");
                            break;
                    }

                }
                currentAnimal.makeSound();
                animals.add(currentAnimal);
                System.out.println("Now the food: {food} {quantity}");

            } else {
                if (animal[0].equalsIgnoreCase("meat")) {
                    food = new Meat(Integer.parseInt(animal[1]));
                } else {
                    food = new Vegetable(Integer.parseInt(animal[1]));
                }
                currentAnimal.eatFood(food);
                System.out.println("next animal");
            }

            lineCounter++;

        }

    }
}
