package io.codelex.dateTime.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please input date from dd.mm.yyyy: ");
        LocalDate date1 = userInput(input);
        System.out.println("Please input date to : ");
        LocalDate date2 = userInput(input);


        System.out.println(workingHoursBetween(date1, date2));
    }

    public static LocalDate userInput(Scanner scanner) {
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String date = scanner.nextLine();
        return LocalDate.parse(date, pattern);
    }

    public static int workingHoursBetween(LocalDate date1, LocalDate date2) {
        final int HOURS_IN_WORKING_DAY = 8;

        Predicate<LocalDate> isWeekend = date -> date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY;

        List<LocalDate> workingDays = date1.datesUntil(date2.plusDays(1)).filter(isWeekend.negate()).toList();

        return workingDays.size() * HOURS_IN_WORKING_DAY;
    }
}
