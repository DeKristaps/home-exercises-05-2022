package io.codelex.streams.examples;

import java.util.List;

import static java.util.Arrays.asList;

public class Quiz1 {
    public static void main(String[] args) {
        List<Person> persons = asList(
                new Person("John"),
                new Person("Bob")
        );

        // Which one is an iteration using Stream API
        // 1.
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
        // 2.
        for (Person person : persons) {
            System.out.println(person);
        }
        // 3.
        System.out.println(persons);
        // 4.
        persons.forEach(System.out::println);
    }
}
