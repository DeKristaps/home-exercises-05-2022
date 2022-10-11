package io.codelex.polymorphism.examples;

public class Owl extends Bird {
    @Override
    public void makeSound() {
        System.out.println("-- owl specific sound --");
    }

    @Override
    public boolean canFly() {
        return true;
    }
    
    public void lookSmart(){
        // look very smart
    }
}
