package io.codelex.generics.practice.exercise1;

public class Exercise1 {
    public static void main(String[] args) {

        FirstList stringList = new FirstList("aaa");
        stringList.add("String");
        System.out.println(stringList.get());

        FirstList intList = new FirstList(1);
        intList.add(21);
        System.out.println(intList.gets());


        ConcreteStringList abstractStringList = new ConcreteStringList();
        abstractStringList.add("Hey, this is a string");
        System.out.println(abstractStringList.get());


        ConcreteIntList abstractIntList = new ConcreteIntList();
        abstractIntList.add(21);
        System.out.println(abstractIntList.get());


        GenericList<Integer> genericIntList = new GenericList<>();
        genericIntList.add(21);
        System.out.println(genericIntList.get());

        GenericList<String> genericStringList = new GenericList<>();
        genericStringList.add("This is a string");
        System.out.println(genericStringList.get());

    }
}
