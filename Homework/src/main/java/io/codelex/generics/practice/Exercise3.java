package io.codelex.generics.practice;

import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {

        //Explain why we obtain such an error.
        // Jo wildcard apzīmē nezināmu kalsi kas var atšķirties no objekta.

        List<Integer> integerList = new ArrayList<>();
        integerList.add(21);
        integerList.add(null);

        List<Number> numbers = new ArrayList<>();
        numbers.add(9.3);
        numbers.add(666);

        addAllX(integerList, numbers);
        System.out.println(numbers);

        // Šis nestrādā jo metode ierobežo.
        //addAllY(IntegerKist, numbers);
    }


    public <V> void add(V value, List<? super V> list) {
        list.add(value);
    }

    public <V> void add2(V value, List<V> list) {
        list.add(value);
    }

    public static <V> void addAllX(List<V> value, List<? super V> list) {
        for (V el : value) list.add(el);
    }

    public static <V> void addAllY(List<V> value, List<V> list) {
        for (V el : value) list.add(el);
    }

}
