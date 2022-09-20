package io.codelex.arrays.examples;

public class Quiz2 {
    public static void main(String[] args) {
        int[] ar = {2, 4, 6, 8};

        ar[0] = 23;
        ar[3] = ar[0];

        System.out.println(ar[0] + " " + ar[3]);
        // What will be the output?
        // 1. 23 2
        // 2. 23
        // 3. 23 23
        // 4. compilation error
        // 5. runtime error
    }
}
