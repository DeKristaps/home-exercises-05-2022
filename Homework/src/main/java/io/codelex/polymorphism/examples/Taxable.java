package io.codelex.polymorphism.examples;

public interface Taxable {
    // the same meaning as - static final double taxRate....
    double taxRate = 0.06;

    double calculateTax();
}
