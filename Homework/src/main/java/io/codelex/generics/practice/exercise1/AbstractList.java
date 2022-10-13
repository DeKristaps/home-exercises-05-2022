package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractList {

    List<Object> abstractList = new ArrayList<>();

    public AbstractList() {
    }

    public void add() {
    }

    public List<Object> get() {
        return abstractList;
    }


}
