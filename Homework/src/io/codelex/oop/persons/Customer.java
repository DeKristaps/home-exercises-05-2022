package io.codelex.oop.persons;

public class Customer extends Person {
    int purchaseCount;
    String customerId;

    public Customer(String firstName, String lastName, String id, int age, int purchaseCount) {
        super(firstName, lastName, id, age);
        this.purchaseCount = purchaseCount;
        this.customerId = id;
    }

    public int getPurchaseCount() {
        return purchaseCount;
    }

    public void setPurchaseCount(int purchaseCount) {
        this.purchaseCount = purchaseCount;
    }

    @Override
    public String getInfo() {
        return firstName + " " + lastName + " " + customerId + " " + purchaseCount;
    }
}
