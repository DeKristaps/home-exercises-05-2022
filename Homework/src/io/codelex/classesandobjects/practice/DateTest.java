package io.codelex.classesandobjects.practice;

public class DateTest {
    public static void main(String[] args) {
        Date birthday = new Date( 2,8,1993);
        System.out.println(birthday.displayDate());

        birthday.setDay(9);
        System.out.println(birthday.displayDate());

    }
}
