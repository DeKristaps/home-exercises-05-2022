package io.codelex.dateTime.practice;

import java.time.LocalDate;

public class Exercise3 {
    public static void main(String[] args) {
        LocalDate firstStart = LocalDate.of(2022, 1, 1);
        LocalDate firstEnd = LocalDate.of(2022, 1, 15);
        DatePeriod firstPeriod = new DatePeriod(firstStart, firstEnd);

        LocalDate secondStart = LocalDate.of(2022, 1, 10);
        LocalDate secondEnd = LocalDate.of(2022, 1, 25);
        DatePeriod secondPeriod = new DatePeriod(secondStart, secondEnd);

        DatePeriod overlap = firstPeriod.intersection(secondPeriod);

        if (overlap != null){
            System.out.println("The overlap is at dates: " + overlap.start +  " " + overlap.end);
        } else {
            System.out.println("There is no overlap");
        }

    }
}
