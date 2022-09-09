package io.codelex;

public class NoCodeWrittenException extends RuntimeException {
    public NoCodeWrittenException() {
        super("Sorry, no code written :(");
    }
}
