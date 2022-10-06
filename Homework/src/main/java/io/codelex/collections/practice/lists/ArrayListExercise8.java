package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise8 {

    //TODO: Write a Java program to sort a given array list.
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println("List before sort: " + colors);

        //TODO: Sort array list
        Collections.sort(colors);

        System.out.println("List after sort: " + colors);
    }

}
