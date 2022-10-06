package io.codelex.collections.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};
        System.out.println(Arrays.toString(array));

        //todo - replace array with an ArrayList and print out the results

        List<String> arrayList = Arrays.asList(array);
        System.out.println(arrayList);

        //todo - replace array with a HashSet and print out the results

        Set<String> hashSet = Arrays.stream(array).collect(Collectors.toSet());
        System.out.println(hashSet);

        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results

        HashMap<String, String> carOrigin = new HashMap<>();
        carOrigin.put("Germany", "Audi");
        carOrigin.put("Germany", "BMW");
        carOrigin.put("Germany", "Mercedes");
        carOrigin.put("Germany", "VolksWagen");
        carOrigin.put("Japan", "Honda");
        carOrigin.put("USA", "Tesla");
        System.out.println(carOrigin);
    }
}
