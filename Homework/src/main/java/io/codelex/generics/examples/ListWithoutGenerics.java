package io.codelex.generics.examples;

import java.util.ArrayList;
import java.util.List;

public class ListWithoutGenerics {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("CODELEX");
        String s = (String) list.get(0);
        // we need to cast :( why?
    }
}
