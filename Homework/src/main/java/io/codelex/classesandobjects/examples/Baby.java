package io.codelex.classesandobjects.examples;

public class Baby {
    private String name;
    private Integer age;

    public Baby(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    void sayHi() {
        System.out.println("Hi! My name is " + name + "!");
    }

    void sayAge() {
        System.out.println("I am " + age + " old!");
    }
}
