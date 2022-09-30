package io.codelex.oop.persons;

import java.time.LocalDate;

public class Employee extends Person {
    String position;
    LocalDate startedWorking;

    public Employee(String firstName, String lastName, String id, int age, String position, LocalDate startedWorking) {
        super(firstName, lastName, id, age);
        this.position = position;
        this.startedWorking = startedWorking;
    }

    @Override
    public String getInfo() {
        return firstName + " " + lastName + " " + position + " " + getWorkExperience();
    }

    public int getWorkExperience() {
        return LocalDate.now().getYear() - startedWorking.getYear();
    }

}
