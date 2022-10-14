package io.codelex.advancedtest.exercise3;

import java.util.List;
import java.util.stream.Collectors;

public class Joiner<T> {

    String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(List<T> values) {
        return values.stream().map(Object::toString).collect(Collectors.joining(separator));
    }
}
