package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class WordCount {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/lear.txt";


    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);
        System.out.println("Lines = " + lines.size());

        String[] words = lines.stream().map(String::valueOf).collect(Collectors.joining(" ")).replaceAll("\\s{2}", " ")
                .replaceAll("[^a-zA-Z ]", "").split(" ");

        System.out.println("Words = " + words.length);

        String[] letters = lines.stream().map(String::valueOf).collect(Collectors.joining(" "))
                .split("");
        System.out.println("Chars = " + letters.length);
    }
}
