package io.codelex.oop.summary.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StorageHouse {

    //Fix this class so that storage house can contain other types of objects not only numbers
    //Test the functionality

    List<Integer> items = new ArrayList<>();

    public StorageHouse(Integer firstItem) {
        items.add(firstItem);
    }

    public void addMoreItems(Integer item) {
        items.add(item);
    }

    public Optional<Integer> getMaybeFirstItem() {
        return items.stream().findFirst();
    }

    public void printItems() {
        items.forEach(System.out::println);
    }

}
