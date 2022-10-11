package io.codelex.polymorphism.practice.exercise4;

public class Employee extends StaffMember {
    protected String socialSecurityNumber;
    protected double payRate;

    //-----------------------------------------------------------------
    // Sets up an employee with the specified information.
    //-----------------------------------------------------------------
    public Employee(String eName, String eAddress, String ePhone,
                    String socSecNumber, double rate) {
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //-----------------------------------------------------------------
    // Returns information about an employee as a string.
    //-----------------------------------------------------------------
    public String toString() {
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }

    //-----------------------------------------------------------------
    // Returns the pay rate for this employee.
    //-----------------------------------------------------------------
    public double pay() {
        return payRate;
    }
} 