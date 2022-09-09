package io.codelex.typesandvariables.examples;

public class VariableScope {
    public static int x = 10; // class level

    public static void main(String[] args) {
        System.out.println(x); // output 10
        int x = 100; // method level, local variable
        x++;
        System.out.println(x); // output 101
        addOne();
        System.out.println(x); // output ?
    }

    private static void addOne() {
        x = x + 1;
        System.out.println(x); // output ?
    }
}
