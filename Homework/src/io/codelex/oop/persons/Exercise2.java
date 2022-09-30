package io.codelex.oop.persons;

import java.time.LocalDate;

public class Exercise2 {
    public static void main(String[] args) {
        LocalDate startedWorking = LocalDate.of(2020, 2, 1);
        Employee dan = new Employee("Dan", "Kimchi", "00332", 24, "Accountant", startedWorking);
        Customer theo = new Customer("Theo", "Newborn", "cti10", 30, 10);


        System.out.println(dan.getInfo());
        System.out.println(theo.getInfo());
    }
}
