package io.codelex.classesandobjects.practice;

public class DateTest {
    public static void main(String[] args) {
        Date birthday = new Date(11, 9, 1994);
        System.out.println(birthday.displayDate());

        birthday.setDay(8);
        birthday.setYear(1993);
        birthday.setMonth(2);

        System.out.println(birthday.getMonth());
        System.out.println(birthday.getYear());
        System.out.println(birthday.getDay());

    }
}
