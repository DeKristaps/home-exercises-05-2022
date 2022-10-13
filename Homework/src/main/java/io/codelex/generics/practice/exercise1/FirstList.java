package io.codelex.generics.practice.exercise1;

import java.util.ArrayList;
import java.util.List;

public class FirstList {

    List<String> firstList;
    List<Integer> secondList;

    public FirstList(String s) {
        firstList = new ArrayList<>();
    }

    public FirstList(int i) {
        secondList = new ArrayList<>();
    }

    public void add(String string){
        firstList.add(string);
    }

    public void add(Integer integer){
        secondList.add(integer);
    }

    public List<String> get(){
        return firstList;
    }

    public List<Integer> gets(){
        return secondList;
    }






}
