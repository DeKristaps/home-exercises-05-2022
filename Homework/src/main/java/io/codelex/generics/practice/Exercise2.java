package io.codelex.generics.practice;

import java.util.ArrayList;
import java.util.List;


public class Exercise2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("word");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);

        Object object = new Object();
        List<Object> objectList = new ArrayList<>();
        objectList.add(object);

        String concatList = concatenate(stringList);
        String concatList2 = concatenate(integerList);
        String concatList3 = concatenate(objectList);

        System.out.println(concatList);
        System.out.println(concatList2);
        System.out.println(concatList3);
    }

    public static String concatenate(List<?> list) {
        String result = "";
        String separator = "";
        if (list.get(0).getClass().getSimpleName().equals("String")) {
            result = "String:";
            separator = " ";
        } else if (list.get(0).getClass().getSimpleName().equals("Integer")) {
            result = "Integers:";
            separator = "+";
        }
        for (Object el : list)
            result = result + separator + el.toString();
        return result;
    }



}
