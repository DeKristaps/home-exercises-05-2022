package io.codelex.polymorphism.practice.exercise3;

public class Employee extends Person{
    String jobTile;
    public Employee(String firstName, String lastName, String address, int id, String jobTile) {
        super(firstName, lastName, address, id);
        this.jobTile = jobTile;
    }

    public String getJobTile() {
        return jobTile;
    }

    public void setJobTile(String jobTile) {
        this.jobTile = jobTile;
    }

    @Override
    public void display() {
        System.out.println("First name: " + this.firstName + ", Last name: " + this.lastName + ", Address: " + this.address + ", id: " + this.id + ", Job Title " + this.jobTile);
    }
}

