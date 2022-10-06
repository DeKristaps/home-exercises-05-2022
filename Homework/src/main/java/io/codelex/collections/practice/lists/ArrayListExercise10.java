package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise10 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        colors.add("Pink");

        System.out.println("Original array list: " + colors);
        //TODO: Remove all elements from list

        colors.removeAll(colors);

        System.out.println("New array list: " + colors);
    }
}
