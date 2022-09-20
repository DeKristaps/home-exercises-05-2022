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

        Dog.print(Max);

        System.out.println(Dog.fathersName(Coco));
        System.out.println(Dog.fathersName(Sparky));

        System.out.println(Dog.hasSameMotherAs(Coco, Rocky));
    }
}
