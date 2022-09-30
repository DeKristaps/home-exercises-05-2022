package io.codelex.dateTime.practice;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter server launch date dd/mm/yyyy: ");
        LocalDate serverStart = LocalDate.parse(userInput.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyy"));
        System.out.println("Enter year to check: ");
        int updateCheckYear = userInput.nextInt();
        System.out.println("Enter month to check: ");
        int updateCheckMonth = userInput.nextInt();

        LocalDate updateCheck = LocalDate.of(updateCheckYear, updateCheckMonth, Month.of(updateCheckMonth).length(false));

        System.out.println(datesForUpdate(serverStart, updateCheck));
    }

    public static List<LocalDate> datesForUpdate(LocalDate start, LocalDate check) {
        List<LocalDate> update = new ArrayList<>();
        while (start.isBefore(check)) {
            if (start.getYear() == check.getYear() && start.getMonth() == check.getMonth()) {
                update.add((start));
            }
            start = start.plusDays(14);
        }
        return update;
    }
}
