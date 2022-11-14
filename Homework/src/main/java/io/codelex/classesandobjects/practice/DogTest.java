package io.codelex.classesandobjects.practice;

public class DogTest {
    public static void main(String[] args) {
        Dog Max = new Dog("Max", "male", "Rocky", "Lady");
        Dog Rocky = new Dog("Rocky", "male", "Sam ", "Molly");
        Dog Sparky = new Dog("Sparky", "male");
        Dog Buster = new Dog("Buster", "male", "Sparky ", "Lady");
        Dog Sam = new Dog("Sam", "male");
        Dog Lady = new Dog("Lady", "female");
        Dog Molly = new Dog("Molly", "female");
        Dog Coco = new Dog("Coco", "female", "Buster", "Molly");

        System.out.println(Max);

        System.out.println(Coco.fathersName());
        System.out.println(Sparky.fathersName());

        System.out.println(Coco.hasSameMotherAs(Rocky));
    }
}
