package io.codelex.polymorphism.examples;

public class InstanceOfExample {
    public static void main(String[] args) {
        final Animal animal = new Eagle();
        System.out.println(animal instanceof Animal);
        //true
        System.out.println(animal instanceof Bird);
        //true
        System.out.println(animal instanceof Eagle);
        //true
        System.out.println(animal instanceof Owl);
        //false
    }
}
