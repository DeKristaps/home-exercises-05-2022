package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class ArrayListExercise5 {

    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Violet");
        colors.add("White");
        colors.add("Black");

        System.out.println(colors);

        //TODO: Change the third element with "Yellow"

        colors.set(2, "Yellow");

        System.out.println(colors);
    }

}
