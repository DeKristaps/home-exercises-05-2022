package main.java.io.codelex.loops.examples;

public class BreakExample {
    public static void main(String[] args) {
        int[] arrayOfInts = {32, 87, 3, 589, 12};
        int searchFor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchFor) {
                foundIt = true;
                break;
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchFor + " at index " + i);
        } else {
            System.out.println(searchFor + " not in the array");
        }
    }
}
