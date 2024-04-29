package com.exaple.module1.exception;

public class DivideException extends ArithmeticException {

    private final int errorCode = 1;
    private final String errorMessage;

    public DivideException(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public DivideException(String s, String errorMessage) {
        super(s);
        this.errorMessage = errorMessage;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
