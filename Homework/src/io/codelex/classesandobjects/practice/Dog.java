package io.codelex.classesandobjects.practice;

import java.util.Objects;

public class Dog {
    String name;
    String sex;

    String father;

    String mother;

    public Dog(String name, String sex, String father, String mother) {
        this.name = name;
        this.sex = sex;
        this.father = father;
        this.mother = mother;
    }

    public Dog(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public static void print(Dog dog) {
        System.out.println("Hi, my names is " + dog.name + ". I am a " + dog.sex);
    }

    public static String fathersName(Dog dog) {
        return Objects.requireNonNullElse(dog.father, "Unknown");
    }

    public static boolean hasSameMotherAs(Dog dog, Dog otherDog) {
        return dog.mother.equals(otherDog.mother);
    }
}
