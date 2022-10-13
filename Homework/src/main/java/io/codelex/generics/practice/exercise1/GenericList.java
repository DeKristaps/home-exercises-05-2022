package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> {
    List<T> genericList = new ArrayList<>();

    public void add(T t) {
        genericList.add(t);
    }

    public List<T> get() {
        return genericList;
    }

}
