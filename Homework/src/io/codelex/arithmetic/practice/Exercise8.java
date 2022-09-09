package io.codelex.arithmetic.practice;


public class Exercise8 {
    public static void main(String[] args) {
        System.out.println(payCauculator("Employee1", 7.50, 35));
        System.out.println(payCauculator("Employee2", 8.20, 47));
        System.out.println(payCauculator("Employee3", 10.00, 73));
    }

    static String payCauculator(String employee, double basePay, int hoursWorked) {
        if (basePay < 8.00) {
            return (employee + " Error: base pay to low");
        } else if (hoursWorked > 60) {
            return (employee + " Error: Too many hours worked");
        }

        int hoursOvertime = hoursWorked - 40;

        if (hoursOvertime > 0) {
            double overtimePay = hoursOvertime * (basePay * 1.5);
            return (employee + " Receives " + (overtimePay + (basePay * (hoursWorked - hoursOvertime))));
        }
        return (employee + " Receives " + basePay * hoursWorked);
    }
}
