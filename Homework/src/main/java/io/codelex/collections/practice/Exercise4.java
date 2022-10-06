package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Set<String> uniqueNames = new HashSet<>();

        while (true) {
            System.out.print("Enter name: ");
            String nameToAdd = userInput.nextLine();
            if (nameToAdd.equals("")) {
                break;
            }
            uniqueNames.add(nameToAdd);
        }
        System.out.println("Unique name list contains: " + uniqueNames);
    }
}
