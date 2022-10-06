package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Histogram {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/midtermscores.txt";

    public static void main(String[] args) throws URISyntaxException, IOException {
        final int UPPER = 100;
        final int LOWER = 0;
        int upper = 0;

        for (int i = LOWER; i <= UPPER; i += 10) {
            if (i == 100) {
                upper = 100;
            } else {
                upper = i + 9;
            }
            System.out.println(i + "-" + upper + ":" + getStars(i, upper));
        }
    }

    private static String fileContent() throws URISyntaxException, IOException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        return Files.readAllLines(path, charset).stream()
                .findFirst()
                .orElseThrow(IllegalStateException::new);
    }

    private static String getStars(int lower, int upper) throws URISyntaxException, IOException {
        final String scores = fileContent();
        List<String> scoresList = Arrays.stream(scores.split(" ")).toList();
        StringBuilder starts = new StringBuilder();

        for (String value : scoresList) {
            int score = Integer.parseInt(value);
            if (score >= lower && score <= upper) {
                starts.append("*");
            }
        }
        return starts.toString();
    }
}
