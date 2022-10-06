package io.codelex.collections.examples;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();

        myList.add(7);
        myList.add(3);
        myList.add(9);
        myList.add(3);
        myList.add(4);
        myList.add(8);
        myList.add(6);

        System.out.println(myList.get(0));
        System.out.println(myList.get(3));
    }
}
