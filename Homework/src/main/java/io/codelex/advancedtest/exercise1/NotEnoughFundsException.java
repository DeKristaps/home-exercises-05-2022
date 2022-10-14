package io.codelex.advancedtest.exercise1;

public class NotEnoughFundsException extends RuntimeException {
    public NotEnoughFundsException(String error) {
        super(error);
    }
}
