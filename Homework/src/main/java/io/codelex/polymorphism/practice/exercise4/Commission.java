package io.codelex.polymorphism.practice.exercise4;

public class Commission extends Hourly {

    private double totalSales;

    private final double COMMISSION_RATE;

    public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.COMMISSION_RATE = commissionRate;
    }

    public void addSales (double totalSales){
        this.totalSales += totalSales;
    }

    public double pay(){
        double totalPay =  super.pay() + (totalSales* COMMISSION_RATE);
        this.totalSales = 0;
        return totalPay;
    }

    public String toString() {
        String result = super.toString();
        result += "\nTotal sales: " + totalSales;
        return result;
    }





}
