package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements

        List<String> arrayList = new ArrayList<>();

        //TODO: Add 10 values to list
        Collections.addAll(arrayList, "One", "Two", "Three", "For", "Five", "Six", "Seven", "Eight", "Nine", "Ten");
        System.out.println(arrayList);

        //TODO: Add new value at 5th position
        arrayList.add(4, "New");
        System.out.println(arrayList);

        //TODO: Change value at last position (Calculate last position programmatically)
        arrayList.set(arrayList.size() - 1, "New ten");

        //TODO: Sort your list in alphabetical order
        Collections.sort(arrayList, String.CASE_INSENSITIVE_ORDER);
        System.out.println(arrayList);

        //TODO: Check if your list contains "Foobar" element
        if (arrayList.contains("Foobar")) {
            System.out.println("Fount the element");
        } else {
            System.out.println("Sorry, but no elements like that in this list.");
        }

        //TODO: Print each element of list using loop
        for (String value : arrayList) {
            System.out.println(value);
        }

    }

}
