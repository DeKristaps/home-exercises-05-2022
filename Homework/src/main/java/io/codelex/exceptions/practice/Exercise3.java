package io.codelex.exceptions.practice;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Exercise3 {
    public static void cat(File file) throws IOException {

        //TODO - fix this method so it compiles
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (input != null) {
                input.close();
            }
        }

    }
}
