package io.codelex.generics.examples;

import java.util.ArrayList;
import java.util.List;

public class ListWithGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        String s = list.get(0); //no casting needed
    }
}
