package io.codelex.polymorphism.practice.exercise3;

abstract class Person {

    String firstName;

    String lastName;

    String address;

    int id;

    public Person(String firstName, String lastName, String address, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void display(){
        System.out.println("First name: " + this.firstName + ", Last name: " + this.lastName + ", Address: " + this.address + ", id: " + this.id );
    }
}
