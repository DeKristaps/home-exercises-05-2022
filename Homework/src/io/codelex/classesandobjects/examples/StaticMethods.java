package io.codelex.classesandobjects.examples;

public class StaticMethods {
    public static void main(String[] args) {
        //For methods that use only their arguments
        //and thus don't need an object for member data
        Math.pow(2, 4);
        // For methods that only need static data fields
        // public static int getNextId( ) { return nextId++;}
        Student.getNextId();
    }
}
