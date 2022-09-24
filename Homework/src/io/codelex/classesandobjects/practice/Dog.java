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

    public String toString() {
       return "Hi, my names is " + this.name + ". I am a " + this.sex;
    }

    public String fathersName() {
        return Objects.requireNonNullElse(this.father, "Unknown");
    }

    public  boolean hasSameMotherAs(Dog otherDog) {
        return this.mother.equals(otherDog.mother);
    }
}
