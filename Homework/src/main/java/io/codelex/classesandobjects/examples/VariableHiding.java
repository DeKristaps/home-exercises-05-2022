package io.codelex.classesandobjects.examples;

public class VariableHiding {
    private int variable = 5;

    public static void main(String[] args) {
        VariableHiding example = new VariableHiding();
        example.print(7);
    }

    void print(int variable) {
        variable = 10;
        System.out.println("Value of Instance variable :" + this.variable);
        System.out.println("Value of Local variable :" + variable);
    }
}
