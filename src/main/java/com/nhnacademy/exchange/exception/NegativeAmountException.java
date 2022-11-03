package com.nhnacademy.exchange.exception;

public class NegativeAmountException extends RuntimeException {
    public NegativeAmountException(String message) {
        super("Amount is Negative Number: " + message);
    }
}
