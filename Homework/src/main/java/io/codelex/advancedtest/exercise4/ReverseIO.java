package io.codelex.advancedtest.exercise4;

import java.io.*;

public class ReverseIO {

    private static final String PATH_TO_APP = "C:/Users/Dekri/IdeaProjects/home-exercises-05-2022/home-exercises-05-2022/Homework/";

    public static void main(String[] args) throws IOException {
        StringBuilder reverser = new StringBuilder();
        String output = "";

        BufferedReader in = new BufferedReader(new FileReader(PATH_TO_APP + "testFile.txt"));
        BufferedWriter out = new BufferedWriter(new FileWriter(PATH_TO_APP + "outFile.txt"));

        String line;
        while ((line = in.readLine()) != null) {
            output = reverser.append(line).reverse().append("\n").toString();
        }

        out.write(output);

        in.close();
        out.close();


    }
}
